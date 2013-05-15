package mangodream;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClassSQLQueries {
    
ClassDataBaseConnection ConnectionToDataBase = new ClassDataBaseConnection();

private String DataFromTextField;

public void takingValueFromTextField(String TextFieldValue) {
    DataFromTextField = TextFieldValue;
}

public String ReturningValueIntoSqlQuery() {
    return DataFromTextField;
}

public void sqlQueryGetTaskId() throws ClassNotFoundException, SQLException {
    ConnectionToDataBase.DataBaseConnectionInitiating();
    Statement StatementForSelectQuery = ConnectionToDataBase.dbConnection.createStatement();
    ResultSet ResultSelectSqlQuery = StatementForSelectQuery.executeQuery("SELECT ID_POSTED_TASK FROM APP.POSTED_TASKS");
    try {
        System.out.println(ResultSelectSqlQuery.first());    
    }catch(Exception ex) {
    System.out.println("0");
}
}

public void sqlQueryInsertTask(String DataFromTextField) throws ClassNotFoundException, SQLException {
    ConnectionToDataBase.DataBaseConnectionInitiating();
    Statement StatementForInsertQuery = ConnectionToDataBase.dbConnection.createStatement();
    
    StatementForInsertQuery.executeQuery("INSERT INTO APP.POSTED_TASKS (ID_POSTED_TASK, NAME_POSTED_TASK, TIME_WAS_POSTED_POSTED_TASK) VALUES (4, " + DataFromTextField + ", CURRENT_TIME)");
}

}
