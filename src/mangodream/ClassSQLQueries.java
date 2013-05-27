package mangodream;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClassSQLQueries {
    
ClassDataBaseConnection ConnectionToDataBase;

private String DataFromTextField;
private String NextIdToInsert;

    public ClassSQLQueries() {
        this.ConnectionToDataBase = new ClassDataBaseConnection();
    }

public void takingValueFromTextField(String TextFieldValue) {
    DataFromTextField = TextFieldValue;
    //System.out.println(DataFromTextField);
}

public String ReturningValueIntoSqlQuery() {
    return DataFromTextField;
    
}

/*public String sqlQueryGetTaskId() throws ClassNotFoundException, SQLException {
    ConnectionToDataBase.DataBaseConnectionInitiating();
    Statement StatementForSelectQuery = ConnectionToDataBase.dbConnection.createStatement();
    ResultSet ResultSelectSqlQuery = StatementForSelectQuery.executeQuery("SELECT COUNT(ID_POSTED_TASK) FROM APP.POSTED_TASKS");
    while (ResultSelectSqlQuery.next()) {
    try {
        System.out.println(ResultSelectSqlQuery.getString(1));    
        String NextIdToInsert = ResultSelectSqlQuery.getString(1);
    }catch(Exception ex) {
    System.out.println("0");
}
    }
    return NextIdToInsert;
}*/

public void sqlQueryInsertTask() throws ClassNotFoundException, SQLException {
    Statement StatementForInsertQuery = ConnectionToDataBase.dbConnection.createStatement();
    StatementForInsertQuery.executeQuery("INSERT INTO APP.POSTED_TASKS (NAME_OF_POSTED_TASK, CONTAINMENT_OF_POSTED_TASK, TIME_TASK_WAS_POSTED) VALUES ('234234234234', 'testing', CURRENT_TIMESTAMP)");
}
}
