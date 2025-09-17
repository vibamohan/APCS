public class Radius {
  private double pi = 3.14;

  public void printArea(double radius) {
    double area = radius * radius * pi;
    System.out.println("Area of the circle with " + radius + " radius is " + area);
  }

  public void printCir(double radius) {
    double cir = radius * pi * 2.0;
    System.out.println("Circumference of the circle with " + radius + " radius is " + cir);
  }

  public void printConeVol(double radius, double height) {
    double vol = pi*radius*radius*height*(1.0/3.0);
    System.out.println("Volume of the cone with " + radius + " radius and " + height + " height is " + vol);

  }
}
