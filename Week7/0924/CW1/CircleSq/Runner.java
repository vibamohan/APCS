import javax.swing.JFrame;

public class Runner {

  public static void main(String args[]) {
    // (1) What does the constructor of JFrame takes in? What does it do?
    JFrame frame = new JFrame("Circle");

    // Create JPanel object and add it to the frame
    Circle canvas = new Circle();
    frame.add(canvas);

    // (2) What do you think this command does?
    // Comment the code out and test it.
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // (3) What happens when you remove the code below?
    // Comment the code out and test it.
    frame.pack();

    // (4) What does setVisible do? What happens when you remove the code below?
    // Comment the code out and test it.
    frame.setVisible(true);

  }

}
