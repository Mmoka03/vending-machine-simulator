package com.spring.vendingmachine.database.close;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionClose {
    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        try {
            if(rs != null) {
                rs.close();
            }
            if(stmt != null) {
                stmt.close();
            }
            if(conn != null) {
                conn.close();
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    public static void close (Statement stmt, Connection conn) {
        try {
            if(stmt != null) {
                stmt.close();
            }
            if(conn != null) {
                conn.close();
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
