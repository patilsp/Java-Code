package seven.shape;

public class Circle {
    
     double r=0, area=0;
     private double PI = 3.142;
     
     public Circle(double radius){ //constructor 
         r=radius;
     }
     public double calArea(){
         area= PI * r * r;
         
         return area;
         
     } 
     
    
}
