package seven.shape;

public class Square {
    int area=0, side=0;
    
    public Square(int a){
        side =a;
    }
    public  int callArea(){
        area = side * side;
        return area;
        
    }
    
}
