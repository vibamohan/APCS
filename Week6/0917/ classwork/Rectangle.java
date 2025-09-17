public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double len,double wid) {
        length = len;
        width = wid;
    }

    public void printArea() {
        double area = length * width;
        System.out.println("area: " + area);
    }

    public void printVariables() {
        System.out.println("length: " + length);
        System.out.println("width: " + width);
    }
}