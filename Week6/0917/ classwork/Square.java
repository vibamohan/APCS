public class Square {
    private double height;

    public Square() {
    }

    public Square(double hei) {
        height = hei;
    }

    public void printVariables() {
        System.out.println("height: " + height);
    }

    public void printArea() {
        double area = height*height;
        System.out.println("area: " + area);
    }
}