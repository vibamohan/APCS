
public class Circle {
    private double radius;
    private double pi;

    public Circle() {
        radius = 0;
        pi = 3.14;
    }

    public Circle(double radius) {
        this.radius = radius;
        pi = 3.14;
    }

    public void printVariables() {
        System.out.println("Radius: " + radius);
        System.out.println("pi: " + pi);
    }
    
    public void printArea() {
        double area = Math.pow(radius, 2) * pi;
        System.out.println("The area of the circle is " + area);
    }
}
