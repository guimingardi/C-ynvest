
package com.mycompany.illumy.oshi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:sqlserver://srvillumy.database.windows.net:1433;database=bdillumy;"
                    + "user=userillumy@srvillumy;password={#Gfgrupo4};encrypt=true;trustServerCertificate=false;"
                    + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
        } catch (SQLException e) {
            throw new RuntimeException(e);     
        }
    }
    
}
