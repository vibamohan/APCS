public class Dog {
    private String name = "Rina"; 

    public void drawMe() {
        System.out.println("      __");
        System.out.println("(___()'`;");
        System.out.println("/,    /`");
        System.out.println("\\\"--\\\")");
    }

   public void speak() {
    System.out.println("woof");
   }

   public void myInfo() {
    System.out.println(name);
        drawMe();
        speak();

   }
}