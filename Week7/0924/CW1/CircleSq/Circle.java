import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

enum Colors {
  RED(128, 0, 0),
  YELLOW(255, 222, 23),
  GREEN(0, 255, 0),
  BROWN(112, 66, 20);

  public Color color;

  Colors(int r, int g, int b) {
    color = new Color(r, g, b);
  }
}

// (1) What is imported to get Graphics to work?
public class Circle extends JPanel {

  @Override
  public Dimension getPreferredSize() {
    // Sets the size of the panel
    return new Dimension(800, 600);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // (2) In the paintComponent method, what do you think it is drawing?
    g.setColor(Colors.YELLOW.color);
    g.fillOval(400, 200, 100, 50);
    g.setColor(Colors.BROWN.color);
    g.fillRect(600, 300, 30, 90);
    g.setColor(Colors.GREEN.color);
    g.fillOval(580, 230, 80, 80);
  }
}
