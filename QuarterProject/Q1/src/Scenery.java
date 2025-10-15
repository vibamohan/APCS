import java.awt.*;
import javax.swing.*;

enum Weather {
  SUNNY,
  RAINY,
  CLOUDY
}

enum Colors {
  RED(255, 0, 0);

  int r, g, b;
  Color c;

  Colors(int r, g, b) {
    c = new Color(r, g, b);
  }

  public Color get() {
    return c;
  }
}

public class Scenery extends JPanel {
  private boolean dayOrNight;
  private Weather weather;

  public Scenery() {
    this.dayOrNight = true;
    this.weather = Weather.SUNNY;
    this.colors = Color.CYAN;
  }

  public Scenery(boolean dayOrNight, Weather weather) {
    this.dayOrNight = dayOrNight;
    this.weather = weather;
    this.colors = dayOrNight ? Color.CYAN : Color.DARK_GRAY;
  }

  @Override
  public Dimension getPreferredSize() {
    return new Dimension(1300, 800);
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.setColor(dayOrNight ? Color.CYAN : Color.BLACK);
    g.fillRect(0, 0, getWidth(), getHeight());

    switch (weather) {
      case SUNNY -> g.setColor(Color.YELLOW);
      case RAINY -> g.setColor(Color.BLUE);
      case CLOUDY -> g.setColor(Color.LIGHT_GRAY);
    }

    // Draw scenery
    eiffelTower(g, 400, 100, 120, 600);
    drawTree(g, 100, 700);
    drawBakery(g, 800, 700);
    drawCat(g, 600, 730);
    drawFlower(g, 1000, 750);
  }

  public void eiffelTower(Graphics g, int x, int y, int width, int height) {
    g.setColor(Color.ORANGE);

    int legHeight = height * 2 / 3; // height of the bottom legs
    int platformHeight = y + legHeight; // middle platform
    int legInset = width / 5; // how much legs taper inward

    // ---- Draw bottom legs ----
    g.fillPolygon(
        new int[] { x, x + width, x + width - legInset, x + legInset },
        new int[] { y + height, y + height, platformHeight, platformHeight },
        4);

    // Draw middle platform
    g.fillRect(x + legInset, platformHeight - 10, width - 2 * legInset, 10);

    // ---- Draw top A-shaped section ----
    int topHeight = height / 3;
    int topWidth = width / 2;
    int topX = x + width / 2 - topWidth / 2;
    int topY = y;
    g.fillPolygon(
        new int[] { topX, topX + topWidth, x + width - legInset, x + legInset },
        new int[] { topY + topHeight, topY + topHeight, platformHeight, platformHeight },
        4);

    // ---- Draw antenna ----
    g.fillRect(x + width / 2 - 2, y - 20, 4, 20);
  }

  public void drawTree(Graphics g, int x, int y) {
    g.setColor(new Color(101, 67, 33));
    g.fillRect(x, y - 50, 20, 50);
    g.setColor(Color.GREEN);
    g.fillOval(x - 15, y - 80, 50, 40);
  }

  public void drawBakery(Graphics g, int x, int y) {
    g.setColor(new Color(255, 200, 150));
    g.fillRect(x, y - 50, 60, 50);
    g.setColor(Color.RED);
    g.fillRect(x + 10, y - 30, 40, 20);
  }

  public void drawCat(Graphics g, int x, int y) {
    g.setColor(Color.GRAY);
    g.fillOval(x, y, 20, 20);
    g.fillOval(x + 15, y - 10, 10, 10);
  }

  public void drawFlower(Graphics g, int x, int y) {
    g.setColor(Color.GREEN);
    g.fillRect(x, y, 5, 20);
    g.setColor(Color.PINK);
    g.fillOval(x - 5, y - 10, 15, 15);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Scenery Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new Scenery(true, Weather.SUNNY));
    frame.pack();
    frame.setVisible(true);
  }
}
