/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expor.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Jaime
 */
public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/expor?user=root&password=root&serverTimezone=UTC & characterEncoding = UTF-8 & useUnicode = yes");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
