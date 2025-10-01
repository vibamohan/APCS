import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

enum Colors {
  RED(128, 0, 0),
  YELLOW(255, 222, 23),
  GREEN(0, 255, 0),
  GROUND(101, 67, 33),
  LAKE(0, 191, 230),
  BROWN(112, 66, 20),
  TREETRUNK(222,184,135),
  LEAVES(34,139,34);

  public Color color;

  Colors(int r, int g, int b) {
    color = new Color(r, g, b);
  }
}

// (1) What is imported to get Graphics to work?
public class Scenery extends JPanel {

  @Override
  public Dimension getPreferredSize() {
    // Sets the size of the panel
    return new Dimension(800, 600);
  }


  

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // (2) In the paintComponent method, what do you think it is drawing?
    g.setColor(Colors.GROUND.color);
    g.fillRect(0,480,800,300);
    g.setColor(Colors.LAKE.color);
    g.fillOval(250,490, 400, 100);
    g.setColor(Colors.YELLOW.color);
    g.fillOval(400, 200, 100, 50);
    // g.setColor(Colors.BROWN.color);
    // g.fillRect(600, 230, 30, 90);
    // g.setColor(Colors.GREEN.color);
    // g.fillOval(580, 200, 80, 80);
    // g.setColor(Colors.TREETRUNK.color);
    // g.fillRect(700,500,50,100);
    drawTree(g, 20, 305);
    drawTree(g, 340, 305);
    drawTree(g, 680, 305);
    
  }

  /**
   * Draws a tree with given parameters
   * @param g graphics object 
   * @param tlx top left x of the tree
   * @param tly top left y of the tree
   */

  public void drawTree(Graphics g, int tlx, int tly) {
    g.setColor(Colors.TREETRUNK.color);
    g.fillRect(tlx+25, tly+75, 50, 100);
    g.setColor(Colors.LEAVES.color);
    g.fillOval(tlx, tly, 100, 100);
  }

  @Override
  public Color getBackground() {
      return new Color(105, 196, 255);
  }
}

  