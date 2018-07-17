/**
 * Implement multiple Inheritance using interface to calculate
 * the area of triangle and rectangle.
 * ----
 * -we need interface for using in two classes  called 'rectangle'-'triangle'
 * one class for displaying area and hold's some data type values
 * 
 * 
 */
package Third;
public class MultiInheritanceCalAreaTrang {
    public static void main(String[] args){
 Triangle objt = new Triangle();
 Rectangle objr = new Rectangle();
 
        Area ar;
        ar = objr;
        
        System.out.println("area of rect = " + ar.CalculateArea(1,2));
        ar = objt;
        System.out.println("are of triangle =" + ar.CalculateArea(10, 3));
 
         }
    
}

interface Area{
      public float CalculateArea(float x, float y);

}
class Triangle  implements Area {
   

    

    @Override
    public float CalculateArea(float x, float y) {
        {
            return(x * y);
        }
    }
    
    
}
class Rectangle  implements Area{
   
   
    

    @Override
    public float CalculateArea(float x, float y) {
        {
            return (x * y/2);
        }   
    }
}
