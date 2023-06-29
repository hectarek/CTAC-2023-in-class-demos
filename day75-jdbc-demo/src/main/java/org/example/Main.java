package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        Main main = new Main();

        main.updateEmployeeData();

//        main.insertEmployeeData();

        main.selectAllEmployees();


    }

    public void updateEmployeeData () throws SQLException {
        Connection connection = null;
        Statement stmt = null;

        try {
            connection = this.connect();

            String update = "UPDATE Employees SET Salary = Salary + 1000 WHERE EmployeeID = 11";

            stmt = connection.createStatement();

            stmt.executeUpdate(update);

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

    public void insertEmployeeData() {
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {

            connection = this.connect();

            String sql = "INSERT INTO Employees (EmployeeID, FirstName, LastName, BirthDate, Position, Salary) VALUES (?, ?, ?, ?, ?, ?)";

            pstmt = connection.prepareStatement(sql);

            pstmt.setInt(1, 11);
            pstmt.setString(2, "Jose");
            pstmt.setString(3, "Manuel");
            pstmt.setDate(4, new Date(1993, 2, 28));
            pstmt.setString(5, "Intern");
            pstmt.setInt(6, 35000);

            pstmt.executeUpdate();

            System.out.println("Successfully Inserted");


        } catch (SQLException e) {
            System.out.println("Error executing SELECT statement");
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    public void selectAllEmployees () {

        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {

            connection = this.connect();

             stmt = connection.createStatement();

            String sql = "SELECT * FROM Employees";

            rs = stmt.executeQuery(sql);

            while(rs.next()) {
                System.out.println(
                        rs.getString("EmployeeID") + " " +
                                rs.getString("FirstName") + " " +
                                rs.getString("LastName") + " " +
                                rs.getDate("BirthDate") + " " +
                                rs.getString("Position") + " " +
                                rs.getDouble("Salary")
                );
            }

        } catch (SQLException e) {
            System.out.println("Error connecting to DB");
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public Connection connect() {
        Connection connection = null;

        try {
            String url = "jdbc:mysql://localhost:3306/demo";
            String username = "root";
            String password = "mydata1313";

            connection = DriverManager.getConnection(url, username, password);

            System.out.println("Successfully Connected!");

        } catch (SQLException e) {
            System.out.println("Error connecting to DB");
            e.printStackTrace();
        }

        return connection;

    }

}