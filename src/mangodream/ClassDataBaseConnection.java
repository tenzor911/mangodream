package mangodream;

import java.sql.*;
import org.apache.derby.jdbc.ClientDriver;

public class ClassDataBaseConnection {
    
    private String dbHost = "jdbc:derby://localhost:1527/mangodream";
    private String uName = "root";
    private String uPass = "root";
    protected Connection dbConnection = null;
    
    void DataBaseConnectionInitiating() throws ClassNotFoundException {
        
        try {
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            dbConnection = DriverManager.getConnection(dbHost, uName, uPass);
            System.out.println("Connect to " + dbConnection.getClientInfo() + " a success!");
            
        }
        
        catch (SQLException err) {
            
            System.err.println("");
            System.err.println("Error!!! Connection was unsuccessfull !!!" + err.getMessage());  
            
        }
    }  
    
    public Connection DBCon() {
        return dbConnection;
    }
}
