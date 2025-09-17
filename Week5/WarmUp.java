import java.util.*;

public class WarmUp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter a verb: ");
    String verb = scanner.next();
    System.out.println("enter a noun: ");
    String noun = scanner.next();
    String sentence = "The " + noun + " " + verb + "s. ";
    System.out.println(sentence);
    scanner.close();
  }
}
