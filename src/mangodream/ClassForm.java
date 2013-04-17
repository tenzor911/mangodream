package mangodream;

import javax.swing.JFrame;

public class ClassForm  {

    private JFrame MainFormView = new JFrame("Testing Windows");
      
public void createFormWithComponents() {
    MainFormView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    MainFormView.setSize(800, 600);   
    MainFormView.setVisible(true);
    MainFormView.setResizable(false);
    MainFormView.setLayout(null);
    MainFormView.setLocationRelativeTo(null);
}
    
}
