
public class Cylinder {
    public static double PI = Math.PI;
    public static void main(String[] args) {
        double volume, radius, height;
        radius = 6;
        height = 10;

        System.out.println("radius: " + radius + ", height: " + height + ", pi: " + PI);
        volume = radius * radius * height * PI;
        System.out.println("Volume: " + volume);
    }
}
