
/*import java.util.Scanner;
public class MathLibraryRunner {
  public static void main(String[] args) {
    MathLibrary ml = new MathLibrary();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter the radius: ");
    double radius = scanner.nextDouble();
    double circ = ml.circumference(radius);
    System.out.println("Circumference of circle is " + circ);
    double area = areaCircle(radius);
    System.out.println("Area of circle is " + area);
    System.out.println("Please enter the height: ");
    double height = scanner.nextDouble();
    double volCyl = ml.cylinderVol(radius, height);
    System.out.println("Volume of cylinder is " + volCyl);
    double volCon = ml.coneVol(radius, height);
    System.out.println("Volume of cone is " + volCon);
    double sphereVol = ml.sphereVol(radius);
    System.out.println("Sphere volume is " + sphereVol);
  }
}

public class MathLibrary{
		public double circumference(double r){
      	double c = 2 * Math.PI * r;
    		return c;
    }
  	public double circleArea(double r){
      	double a = Math.PI * Math.pow(r, 2);
    		return a;
    }
  	public double cylinderVol(double r, double h){
      	double v = circleArea(r) * h;
    		return v;
    }
  	public double coneVol(double r, double h){
      	double v = cylinderVol(r, h) / 3;
      	return v;
    }
  	public double sphereVol(double r){
    		double v = (4/3) * Math.PI * Math.pow(r, 3);
      	return v;
    }
}*/


public class MathLibrary {
    // Instance variable
    private double pi;

    // Constructor
    public MathLibrary() {
        pi = 3.14;
    }

    // Methods

    // Returns the circumference of a circle given its radius
    public double circumference(double radius) {
        return 2 * pi * radius;
    }

    // Returns the area of a circle given its radius
    public double areaCircle(double radius) {
        return pi * radius * radius;
    }

    // Returns the volume of a cylinder given radius and height
    public double volCylinder(double radius, double height) {
        double area = areaCircle(radius);
        double volume = area * height;
        return volume;
    }

    // Returns the volume of a cone given radius and height
    public double volCone(double radius, double height) {
        double area = areaCircle(radius);
        double volume = (area * height) / 3.0;
        return volume;
    }

    // Returns the volume of a sphere given radius
    public double volSphere(double radius) {
        double volume = (4.0 / 3.0) * pi * Math.pow(radius, 3);
        return volume;
    }
}










