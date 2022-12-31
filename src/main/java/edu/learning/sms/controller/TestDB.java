package edu.learning.sms.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDB {
    public static void main(String[] args) {
        //jdbc:mysql://localhost:3036/sms?useSSL=false&serverTimezone=UTC
        String url = "jdbc:mysql://localhost:3036/sms";
        String username = "";
        String password = "";

        System.out.println("Connecting database...");



        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!");
        } catch(SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }


}
