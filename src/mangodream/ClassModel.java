package mangodream;

public class ClassModel {
    
    private int x;
    
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
}

