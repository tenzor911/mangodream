package mangodream;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassController {
    private ClassModel model;
    private ClassForm view;
    private ClassSQLQueries sqlqueries;
    private ActionListener actionListener;
    
    public ClassController(ClassModel model, ClassForm view){
        this.model = model;
        this.view = view;                 
    }
    
     public void contol(){        
        actionListener = new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent actionEvent) {                  
                  try {
                      linkBtnAndLabel();
                  } catch (SQLException ex) {
                      Logger.getLogger(ClassController.class.getName()).log(Level.SEVERE, null, ex);
                  } catch (ClassNotFoundException ex) {
                      Logger.getLogger(ClassController.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
        };                
        view.getButton().addActionListener(actionListener);
    }
    
    private void linkBtnAndLabel() throws SQLException, ClassNotFoundException{
        view.getValueFromTextField();
        model.takingValueFromTextField(view.setValueFromTextField());
        view.SetText(model.ReturningValueIntoSqlQuery());
        //model.sqlQueryInsertTask(model.ReturningValueIntoSqlQuery());
               
        //model.my_x(view.SetTextIntoField());
        //sqlqueries.takingValueFromTextField(view.setValueFromTextField());
        //sqlqueries.ReturningValueIntoSqlQuery();
        //model.my_x(view.setValueFromTextField());
        //model.my_y();
        
    }       
}
