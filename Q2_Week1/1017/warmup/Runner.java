public class Runner {
  public static void main(String[] args) {
    Number number = new Number();
    boolean isOdd = number.checkOdd(5);
    System.out.println("5 is odd: " + isOdd);

    double area = number.areaTriangle(4.5, 4.0);
    System.out.println("Area is " + area);
  }
}
