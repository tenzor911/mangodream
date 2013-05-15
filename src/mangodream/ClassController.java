package mangodream;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
              public void actionPerformed(ActionEvent actionEvent) {                  
                  linkBtnAndLabel();
              }
        };                
        view.getButton().addActionListener(actionListener);
    }
    
    private void linkBtnAndLabel(){
        view.getSQLQueryFromTextField();
        model.my_x(view.SetTextIntoField());
        view.SetText(model.my_y());
        
    }    
    
    private void getSQlQuery() {
      
    }
    
}
