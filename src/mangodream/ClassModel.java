package mangodream;

public class ClassModel {
    
    private int x;
    private String SQL_Query;
    
    public ClassModel() {
        x = 0;
    }
    
    public ClassModel(int x) {
        this.x = x;
    }
    
    public void incX() {
        x++;
    }
    
    public int getX() {
        return x;
    }
    
     public void getValueFromJTextFieldForm(String SQL_Query_From_From){
        SQL_Query = SQL_Query_From_From;
    }
    
    public String insertDataBaseRecord() {
        return SQL_Query;
    }
}

