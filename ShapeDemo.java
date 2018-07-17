/**
 * LOGIC : don't be noob :)
 * just keep in mind circle = pi*r*r; triangle = 0.5 allttitude*base;
 * and square = side*side;
 */
package seven;

import seven.shape.*;


public class ShapeDemo {
    public static void main(String[] args) {
        Circle obj = new Circle(19);
        System.out.println("area of circle is :" +  obj.calArea());
        
        Square sobj = new Square(10);
        System.out.println("area of Square is :" + sobj.callArea());
        
        Triangle tobj = new Triangle(19, 4);
        System.out.println("area of Triangle is :" + tobj.callArea());
    }
    
}
