package Week7.classwork;
public class Circle2 {
  private double pi;
  private double radius;

  public Circle2() {
    radius = 1;
    pi = 3.14;
  }

  public Circle2(double radius) {
    this.radius = radius;
    pi = 3.14;
  }

  public void printArea() {
    double area = pi * radius * radius;
    System.out.println("The area of the circle is " + area);
  }

  public void printArea(double radius) {
    double area = pi * radius * radius;
    System.out.println("The area of the circle is " + area);
  }


  public void printVol(double radius) {
    double volume = (4/3) * pi * Math.pow(radius, 3);
    System.out.println("Volume of the cylinder is " + volume);
  }

  public void printVol(double radius, double height) {
    double volume = pi * radius * radius * height;
    System.out.println("Volume of the cylinder is " + volume);
  }

}
