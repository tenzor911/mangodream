package mangodream;

public class ClassMain {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassForm CallClassForm = new ClassForm();
        CallClassForm.createFormWithComponents();
        ClassDataBaseConnection Conn = new ClassDataBaseConnection();
        Conn.DataBaseConnectionInitiating();
        
                ClassModel model = new ClassModel(0);
                
                ClassController controller = new ClassController(model, CallClassForm);
                controller.contol();
}
}