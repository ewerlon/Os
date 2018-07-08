/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.os.dao;

import java.sql.*;

/**
 *
 * @author Ewerlon
 */
public class PostgreSql {

    public static Connection conecta() {

        java.sql.Connection con = null;
        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/os";
        String user = "postgres";
        String password = "root";

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
