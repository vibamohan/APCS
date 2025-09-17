
public class Bird {
    private String name = "Lilo";
    
    public void drawMe() {
        System.out.println("           _.-.\n" + //
                        "        .-.  `) |  .-. \n" + //
                        "    _.'`. .~./  \\.~. .`'._\n" + //
                        ".-'`.'-'.'.-:    ;-.'.'-'.`'-.\n" + //
                        " `'`'`'`'`   \\  /   `'`'`'`'`\n" + //
                        "             /||\\\n" + //
                        "  jgs       / ^^ \\\n" + //
                        "            `'``'`");
    }

    public void speak() {
        System.out.println("coo! coo!");
    }
    
    public void myInfo() {
        drawMe();
        speak();
    }
}
