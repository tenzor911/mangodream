package mangodream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ClassForm  {

    private JFrame MainFormView = new JFrame("Testing Windows");
    private JButton SendTaskButton = new JButton();
    private JTextField TaskEnteringField = new JTextField();
      
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
}

public void textfieldCreate()  {
    TaskEnteringField.setHorizontalAlignment(JTextField.LEFT);
    TaskEnteringField.setBounds(5, 10, 360, 20);
    TaskEnteringField.setVisible(true);  
} 

public void buttonPostTaskCreate()  {
    SendTaskButton.setBounds(370, 10, 100, 19);
    SendTaskButton.setVisible(true);
    SendTaskButton.setText("Add task");
}

public JButton getButton(){
    return SendTaskButton;
}

public void setTask(String text) {
    TaskEnteringField.setText(text);
}

public void getSQLQueryFromTextField() {
    TaskEnteringField.getText();
}
}
