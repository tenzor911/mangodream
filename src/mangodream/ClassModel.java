package mangodream;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClassModel {
    ClassDataBaseConnection ConnectionToDataBase;
    
    private int x;
    private String y = "";
    
    private String DataFromTextField;
    private String NextIdToInsert;
    
    private String SQL_Query;
    
    public ClassModel() {
        x = 0;
        this.ConnectionToDataBase = new ClassDataBaseConnection();
    }
    
    public ClassModel(int x) {
        this.x = x;
    }
    
    /*public void incX() {
        x++;
    }
    
    public int getX() {
        return x;
    }
    
    public void getValueFromJTextFieldForm(String SQL_Query_From_From){
        SQL_Query = SQL_Query_From_From;
    }
    
    public String insertDataBaseRecord() {
        return SQL_Query;
    }*/
 
    /*public void my_x(String z) {
        y = z;
           //System.out.println(y);
    }
    
    public String my_y() {
        return y;
    }*/
    
    
    public void takingValueFromTextField(String TextFieldValue) {
        DataFromTextField = TextFieldValue;
    }

    public String ReturningValueIntoSqlQuery() {
        return DataFromTextField;
    }
 
    //public void sqlQueryInsertTask(String DataFromTextField) throws ClassNotFoundException, SQLException {
       // ConnectionToDataBase.DataBaseConnectionInitiating();
        //Statement StatementForInsertQuery = ConnectionToDataBase.dbConnection.createStatement();
        //StatementForInsertQuery.executeQuery("INSERT INTO APP.POSTED_TASKS (NAME_OF_POSTED_TASK, CONTAINMENT_OF_POSTED_TASK, TIME_TASK_WAS_POSTED) VALUES (" + DataFromTextField + ", testing, CURRENT_TIMESTAMP");
    //}
}

