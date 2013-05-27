package mangodream;

import java.sql.SQLException;

public class ClassMain {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ClassForm CallClassForm = new ClassForm();
        //ClassSQLQueries SQL = new ClassSQLQueries();
        //SQL.sqlQueryInsertTask();
        /*SQL.sqlQueryGetTaskId();*/
        CallClassForm.createFormWithComponents();
        ClassDataBaseConnection Conn = new ClassDataBaseConnection();
        Conn.DataBaseConnectionInitiating();
        
        ClassModel model = new ClassModel(0);
        ClassController controller = new ClassController(model, CallClassForm);
        controller.contol();
}
}