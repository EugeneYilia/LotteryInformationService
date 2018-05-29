package com.eugenestudio.EugeneWechatServer.spider.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.eugenestudio.EugeneWechatServer.spider.constant.Constant.*;


public class DatabaseConnection {
    private static Connection connection = null;

    private DatabaseConnection(){}
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
