package mangodream;

import java.awt.event.ActionListener;

public class ClassController {
    private ClassModel model;
    private ClassForm view;
    private ActionListener actionListener;
    
    public ClassController(ClassModel model, ClassForm view){
        this.model = model;
        this.view = view;
                          
    }
    
}
