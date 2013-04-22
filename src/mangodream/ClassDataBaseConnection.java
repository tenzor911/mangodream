package mangodream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.derby.jdbc.ClientDriver;

public class ClassDataBaseConnection {
    
    private String dbHost = "jdbc:derby://localhost:1527/mangodream";
    private String uName = "root";
    private String uPass = "root";
    
    void DataBaseConnectionInitiating() throws ClassNotFoundException {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection dbConnection = DriverManager.getConnection(dbHost, uName, uPass);
            System.out.println("Connect to " + dbConnection.getCatalog() + " a success!");
        }
        catch (SQLException err) {
            System.err.println("");
            System.err.println("Error!!! Connection was unsuccessfull !!!" + err.getMessage());  
        }
    }
}
