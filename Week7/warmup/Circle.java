public class Circle {
  private double pi;
  private double radius;

  public Circle() {
    radius = 0;
    pi = 3.14;
  }

  public Circle(double radius) {
    this.radius = radius;
    pi = 3.14;
  }

  public void printCylinderVolume(double height) {
    double volume = pi * radius * radius * height;
    System.out.println("Volume of the cylinder is " + volume);
  }

}
