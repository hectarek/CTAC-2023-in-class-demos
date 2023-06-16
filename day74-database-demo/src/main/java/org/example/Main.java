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
            // The properties that go into your connection
            String url = "jdbc:mysql://localhost:3306/yourDB";
            String username = "YourUsername";
            String password = "YourPassword";

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

    public void insertData() {

        Connection connection = null;
        PreparedStatement pstmt = null;
        try {
            // The actual connection that was established
            connection = this.connect();

            pstmt = connection.prepareStatement("INSERT INTO Products (ProductID, ProductName, Category, Price, Stock) VALUES (?, ?, ?, ?, ?)");

            pstmt.setInt(1, 11);
            pstmt.setString(2, "Lamp Model E");
            pstmt.setString(3, "Furniture");
            pstmt.setDouble(4, 50.00);
            pstmt.setInt(5, 25);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error executing SELECT statement");
            e.printStackTrace();
        } finally {
            try {
                // Need to close each respective parts for security
                if (pstmt != null) pstmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    public void updateProducts() throws SQLException {

        Connection connection = null;
        Statement stmt = null;

        try {
            // The actual connection that was established
            connection = this.connect();

            // The Actual SQL Statement
            String update1 = "UPDATE Products SET Stock = Stock - 1 WHERE ProductID = 1";
            String update2 = "UPDATE Employees SET Salary = Salary + 1000 WHERE EmployeeID = 1";

            stmt = connection.createStatement();

            stmt.executeUpdate(update1);
            stmt.executeUpdate(update2);

            connection.commit();

        } catch (SQLException e) {
            connection.rollback();
            System.out.println("Error executing SELECT statement");
            e.printStackTrace();

        } finally {
            try {
                if (stmt != null) stmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}