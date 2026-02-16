# Brawl Stars Draft Bot

This project is a Java-based application designed to assist players in drafting brawlers for Brawl Stars matches. It uses a MySQL database to store brawler statistics and matchup data, providing data-driven recommendations for picks and bans.

## Features

*   **Database Integration**: Connects to a local MySQL database to retrieve brawler information and matchup win rates. A short sample data is provided.
*   **Draft Assistance**: Suggests optimal picks based on the current draft state, including bans and opponent selections.
*   **Win Rate Analysis**: Calculates the best counter-picks by analyzing historical matchup data.
*   **First Pick Strategy**: Offers recommendations for strong first-pick brawlers based on meta bonuses or average win rates.

## Setup

1.  **Database Configuration**:
    *   Ensure you have a MySQL server running locally on port 3306.
    *   Create a schema named `brawl_schema`.
    *   Run the `MyJDBC` class to initialize the tables (`brawlers`, `matchups`, `maps`) if they don't exist.
    *   Populate the database with data. The schema is expected to match the CSV files in the `SampleData` directory.

2.  **Credentials**:
    *   Create a file named `db_password.txt` in the project root directory.
    *   Enter your MySQL root password in this file.
    *   **Note**: This file is ignored by Git to protect your credentials.

3.  **Running the Application**:
    *   Open the project in your IDE (e.g., IntelliJ IDEA, Android Studio).
    *   Run the `Main` class.
    *   Follow the on-screen prompts to input draft information (bans, picks).

## Project Structure

*   `src/Main.java`: The main entry point of the application, handling user interaction and draft logic.
*   `src/DatabaseManager.java`: Handles all database connections and queries.
*   `src/Brawler.java`: Represents a Brawler entity.
*   `src/MyJDBC.java`: Utility class for setting up the database schema.
*   `SampleData/`: Contains CSV files (`brawlers.csv`, `matchups.csv`, `maps.csv`) that serve as the reference for the database schema and initial data.

## Requirements

*   Java Development Kit (JDK)
*   MySQL Server
*   MySQL JDBC Driver (ensure it's added to your project's dependencies)
