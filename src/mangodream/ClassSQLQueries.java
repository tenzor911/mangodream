package mangodream;

import java.sql.SQLException;
import java.sql.Statement;

public class ClassSQLQueries {
    
ClassDataBaseConnection Connection_To_Data_Base = new ClassDataBaseConnection();

String SQL_Query;

public void sqlQueryInsertTask() throws ClassNotFoundException, SQLException {
    
    Connection_To_Data_Base.DataBaseConnectionInitiating();
    Statement statement = Connection_To_Data_Base.dbConnection.createStatement();
}

}
