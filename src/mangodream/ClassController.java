package mangodream;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClassController {
    private ClassModel model;
    private ClassForm view;
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
        model.incX();                
        view.setTask(Integer.toString(model.getX()));
        //model.getValueFromJTextFieldForm(null);
        view.getSQLQueryFromTextField();
    }    
    
    private void getSQlQuery() {
      
    }
    
}
