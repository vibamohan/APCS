public class Triangle {
    private double base;
    private double height;

    public Triangle() {
    }

    public Triangle(double bas,double hei) {
        base = bas;
        height = hei;
    }


    public void printArea() {
        double area = base*height;
        System.out.println("area: " + area);
    }

    public void printVariable() {
        System.out.println("base " + base);
        System.out.println("height: " + height);
    }

    
}