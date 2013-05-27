package mangodream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ClassForm  {

    private JFrame MainFormView = new JFrame("Testing Windows");
    private JButton SendTaskButton = new JButton();
    private JTextField TaskEnteringField = new JTextField();
    
    private String ValueFromTextField = null;
    private JTextField TaskSetField = new JTextField();
      
public void createFormWithComponents()  {
    MainFormView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    MainFormView.setSize(480, 400);   
    MainFormView.setVisible(true);
    MainFormView.setResizable(false);
    MainFormView.setLayout(null);
    MainFormView.setLocationRelativeTo(null);
    textfieldCreate();
    buttonPostTaskCreate();
    MainFormView.add(TaskEnteringField);
    MainFormView.add(SendTaskButton);
    
    MainFormView.add(TaskSetField);
}

public void textfieldCreate()  {
    TaskEnteringField.setHorizontalAlignment(JTextField.LEFT);
    TaskEnteringField.setBounds(5, 10, 360, 20);
    TaskEnteringField.setVisible(true);  
    TaskEnteringField.setText("text");
    
    TaskSetField.setHorizontalAlignment(JTextField.LEFT);
    TaskSetField.setBounds(5, 30, 360, 20);
    TaskSetField.setVisible(true);  
} 

public void buttonPostTaskCreate()  {
    SendTaskButton.setBounds(370, 10, 100, 19);
    SendTaskButton.setVisible(true);
    SendTaskButton.setText("Add task");
}

public JButton getButton(){
    return SendTaskButton;
}

//public void setTask(String text) {
 //   TaskEnteringField.setText(text);
//}

public void getValueFromTextField() {
    ValueFromTextField = TaskEnteringField.getText();
    
}

public String setValueFromTextField() {
    return ValueFromTextField;
}

public void SetText(String text_val) {
    TaskSetField.setText(text_val);
}

}
