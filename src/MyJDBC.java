import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;

public class MyJDBC {
    public static void main(String[] args) {
        String password = "";
        try (BufferedReader br = new BufferedReader(new FileReader("db_password.txt"))) {
            password = br.readLine().trim();
        } catch (Exception e) {
            System.err.println("Error reading db_password.txt: " + e.getMessage());
            return;
        }

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/brawl_schema",
                    "root",
                    password
            );

            java.sql.Statement statement = connection.createStatement();

            // Create table if it doesn't exist
            // Updated to match the CSV schema as requested
            statement.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS brawlers (" +
                            "brawler_id INT PRIMARY KEY, " +
                            "name VARCHAR(255), " +
                            "rarity VARCHAR(50), " +
                            "class VARCHAR(50))"
            );

            statement.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS matchups (" +
                            "id INT PRIMARY KEY, " +
                            "brawler_a_id INT, " +
                            "brawler_b_id INT, " +
                            "map_id INT, " +
                            "win_rate_a_vs_b DOUBLE, " +
                            "sample_size INT, " +
                            "Notes VARCHAR(255))"
            );

            statement.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS maps (" +
                            "map_id INT PRIMARY KEY, " +
                            "map_name VARCHAR(255), " +
                            "game_mode VARCHAR(255))"
            );

            // Example operation: selecting all brawlers
            java.sql.ResultSet resultSet = statement.executeQuery("SELECT * FROM brawlers");

            while (resultSet.next()) {
                System.out.println("Brawler: " + resultSet.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
