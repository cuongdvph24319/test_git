/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.*;
/**
 *
 * @author ACER
 */
public class DB_Context {
    static String url = "jdbc:sqlserver://localhost\\NAM\\SQLEXPRESS:1433;databaseName=FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041";
    static String user = "sa";
    static String pass = "66668888";
    
    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static Connection getContext(){
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            return con;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void main(String[] args) {
        Connection con = getContext();
        if(con.equals("")){
            System.out.println("loi");
        }else{
            System.out.println("thanhcong");
        }
    }
}
