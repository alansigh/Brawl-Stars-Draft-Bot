import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/brawl_schema";
    private static final String USER = "root";
    private static String PASSWORD = "";

    static {
        try (BufferedReader br = new BufferedReader(new FileReader("db_password.txt"))) {
            PASSWORD = br.readLine().trim();
        } catch (IOException e) {
            System.err.println("Error reading db_password.txt: " + e.getMessage());
            // Fallback or handle error appropriately
        }
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public List<Brawler> getAllBrawlers() {
        List<Brawler> brawlers = new ArrayList<>();
        String query = "SELECT brawler_id, name, rarity, class FROM brawlers";

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                int id = rs.getInt("brawler_id");
                String name = rs.getString("name");
                String rarity = rs.getString("rarity");
                String brawlerClass = rs.getString("class");

                brawlers.add(new Brawler(id, name, rarity, brawlerClass));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return brawlers;
    }

    public double getWinRate(int brawlerAId, int brawlerBId) {
        String query = "SELECT win_rate_a_vs_b FROM matchups WHERE brawler_a_id = ? AND brawler_b_id = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            
            pstmt.setInt(1, brawlerAId);
            pstmt.setInt(2, brawlerBId);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getDouble("win_rate_a_vs_b");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 50.0; // Default to 50% if no data found
    }

    public double getAverageWinRate(int brawlerId) {
        String query = "SELECT AVG(win_rate_a_vs_b) as avg_win_rate FROM matchups WHERE brawler_a_id = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            
            pstmt.setInt(1, brawlerId);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    double avg = rs.getDouble("avg_win_rate");
                    if (rs.wasNull()) return 50.0; // Return 50 if no matchups found
                    return avg;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 50.0;
    }
}
