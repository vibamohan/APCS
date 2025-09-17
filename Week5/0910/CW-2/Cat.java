public class Cat {
    private String name = "lola";

    public void drawMe() {
        System.out.println("\\    /");
        System.out.println("  )  ( ')");
        System.out.println(" (  /  )");
        System.out.println("\\(__)|");
    }

    public void speak() {
        System.out.println("meow");

    }

    public void myInfo() {
        System.out.println(name);

        drawMe();
        speak();

    }



}