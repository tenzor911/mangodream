package mangodream;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class ClassForm  {

    private JFrame MainFormView = new JFrame("Testing Windows");
    private JTextField TaskFieldView = new JTextField();
      
public void createFormWithComponents()  {
    MainFormView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    MainFormView.setSize(500, 400);   
    MainFormView.setVisible(true);
    MainFormView.setResizable(false);
    MainFormView.setLayout(null);
    MainFormView.setLocationRelativeTo(null);
    textfieldCreate();
    MainFormView.add(TaskFieldView);
}

public void textfieldCreate()  {
    TaskFieldView.setHorizontalAlignment(JTextField.RIGHT);
    TaskFieldView.setBounds(5, 10, 360, 20);
    TaskFieldView.setVisible(true);   
} 

public void buttonPostTaskCreate()  {
    
}

}
