package seven.shape;

public class Triangle {
    double base=0, altitude=0, area=0;
    public Triangle(double b, double a) {
        base = b;
        altitude=a;
        
    }
    public double callArea(){
        area = 0.5 * base * altitude;
        return area;
    }
    
}
