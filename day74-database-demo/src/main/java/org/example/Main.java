package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        Main example = new Main();

        example.selectAllBooks();

    }

    public Connection connect() {
        // Need to create a connection to the DB
        Connection connection = null;
        try {
            // The properties taht go into your connection
            String url = "jdbc:mysql://localhost:3306/demo";
            String username = "root";
            String password = "mydata1313";

            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Successfully connected to the database!");
        } catch (SQLException e) {
            System.out.println("Error connecting to the database.");
            e.printStackTrace();
        }
        return connection;
    }

    public void selectAllBooks() {
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // The actual connection that was established
            connection = this.connect();

            // The Actual SQL Statement
            String sql = "SELECT * FROM Employees";

            // Creates the format that is needed to make SQL Statement
            stmt = connection.createStatement();

            // Actual method that will then run formatted SQL statement
            rs = stmt.executeQuery(sql);

            // need to run while for go through data
            // .next() will return true as long as there is more data
            while (rs.next()) {
                System.out.println(rs.getString("EmployeeID") + "\t" +
                        rs.getString("FirstName") + "\t" +
                        rs.getString("LastName") + "\t" +
                        rs.getString("Position") + "\t" +
                        rs.getDouble("Salary"));
            }
        } catch (SQLException e) {
            System.out.println("Error executing SELECT statement");
            e.printStackTrace();
        } finally {
            try {
                // Need to close each respective parts for security
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}