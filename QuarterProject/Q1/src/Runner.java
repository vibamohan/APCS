import javax.swing.JFrame;

public class Runner {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Simple Eiffel Tower");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(true);
    frame.add(new Scenery()); // Add the scenery panel
    frame.setVisible(true);
  }
}
