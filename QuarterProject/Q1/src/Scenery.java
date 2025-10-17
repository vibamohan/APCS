import java.awt.*;
import javax.swing.*;

public class Scenery extends JPanel {
  private boolean isDay;
  private String weather;


  public Scenery(boolean isDay, String weather) {
    this.isDay = isDay;
    this.weather = weather;
  }


  public Dimension getPreferredSize() {
    return new Dimension(1000, 700);
  }


  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    drawBackground(g);
    drawGround(g);

    drawEiffelTower(g);

    drawTrees(g);
    drawBenches(g);
    drawFlowers(g);
    drawLampPosts(g);
  }

  @Override
  public Color getBackground() {
    return (isDay) ? new Color(135, 206, 250) : new Color(25, 25, 112);
  }


  private void drawBackground(Graphics g) {
    if (weather.equals("sunny") && isDay) drawSun(g);
    if (weather.equals("cloudy") || weather.equals("rainy")) drawClouds(g);
    if (weather.equals("rainy")) drawRain(g);
  }


  private void drawGround(Graphics g) {
    if (isDay) g.setColor(new Color(34, 139, 34));
    else g.setColor(new Color(0, 70, 0));
    g.fillRect(0, getHeight() - 100, getWidth(), 100);
  }


  private void drawEiffelTower(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    g2d.setColor(Color.ORANGE);
    g2d.setStroke(new BasicStroke(10.0f));

    int xOffset = 220;
    int yOffset = 30;

    g2d.fillPolygon(
        new int[] {100 + xOffset, 200 + xOffset, 300 + xOffset},
        new int[] {
          getHeight() - 200 - yOffset, getHeight() - 500 - yOffset, getHeight() - 200 - yOffset
        },
        3);

    g2d.fillPolygon(
        new int[] {80 + xOffset, 100 + xOffset, 330 + xOffset, 250 + xOffset},
        new int[] {
          getHeight() - 170 - yOffset,
          getHeight() - 190 - yOffset,
          getHeight() - 180 - yOffset,
          getHeight() - 180 - yOffset
        },
        4);

    g2d.fillPolygon(
        new int[] {100 + xOffset, 330 + xOffset, 330 + xOffset, 100 + xOffset},
        new int[] {
          getHeight() - 190 - yOffset,
          getHeight() - 190 - yOffset,
          getHeight() - 170 - yOffset,
          getHeight() - 170 - yOffset
        },
        4);

    g2d.fillPolygon(
        new int[] {60 + xOffset, 100 + xOffset, 330 + xOffset, 370 + xOffset},
        new int[] {
          getHeight() - 70 - yOffset,
          getHeight() - 160 - yOffset,
          getHeight() - 160 - yOffset,
          getHeight() - 70 - yOffset
        },
        4);

    g2d.setColor(getBackground());
    g2d.fillPolygon(
        new int[] {170 + xOffset, 200 + xOffset, 230 + xOffset},
        new int[] {
          getHeight() - 300 - yOffset, getHeight() - 400 - yOffset, getHeight() - 300 - yOffset
        },
        3);

    g2d.fillArc(100 + xOffset, getHeight() - 135 - yOffset, 200, 130, 0, 180);
  }

  private void drawTrees(Graphics g) {
    int yOff = 60;
    drawTree(g, 120, 480 + yOff);
    drawTree(g, 230, 500 + yOff);
    drawTree(g, 800, 490 + yOff);
    drawTree(g, 900, 470 + yOff);
  }

  private void drawTree(Graphics g, int x, int y) {
    g.setColor(new Color(101, 67, 33)); 
    g.fillRect(x + 10, y, 20, 60);
    g.setColor(Color.GREEN); 
    g.fillOval(x - 10, y - 40, 60, 50);
  }

  private void drawBenches(Graphics g) {
    drawBench(g, 300, 580);
    drawBench(g, 700, 580);
  }

  private void drawBench(Graphics g, int x, int y) {
    g.setColor(new Color(139, 69, 19));
    g.fillRect(x, y, 60, 10);
    g.fillRect(x, y + 15, 60, 10);
    g.fillRect(x + 5, y + 25, 5, 20);
    g.fillRect(x + 50, y + 25, 5, 20);
  }

  private void drawFlowers(Graphics g) {
    for (int i = 0; i < 12; i++) {
      drawFlower(g, 40 + i * 80, getHeight() - 50);
    }
  }

  private void drawFlower(Graphics g, int x, int y) {
    g.setColor(new Color(0, 128, 0));
    g.fillRect(x + 6, y, 4, 25);

    g.setColor(Color.PINK);
    g.fillOval(x - 5, y - 10, 15, 15);
    g.fillOval(x + 5, y, 15, 15);
    g.fillOval(x - 15, y, 15, 15);
    g.fillOval(x - 5, y + 10, 15, 15);

    g.setColor(Color.YELLOW);
    g.fillOval(x, y + 5, 10, 10);
  }

  private void drawLampPosts(Graphics g) {
    drawLampPost(g, 180, 600);
    drawLampPost(g, 860, 600);
  }

  private void drawLampPost(Graphics g, int x, int y) {
    g.setColor(Color.DARK_GRAY);
    g.fillRect(x, y - 80, 10, 80);
    g.setColor(Color.YELLOW);
    g.fillOval(x - 5, y - 90, 20, 20);
  }

  private void drawSun(Graphics g) {
    g.setColor(Color.YELLOW);
    g.fillOval(800, 100, 80, 80);
  }

  private void drawClouds(Graphics g) {
    g.setColor(Color.LIGHT_GRAY);
    for (int i = 0; i < 3; i++) {
      g.fillOval(200 + i * 200, 100, 100, 60);
      g.fillOval(240 + i * 200, 80, 100, 60);
    }
  }

  private void drawRain(Graphics g) {
    g.setColor(Color.BLUE);
    for (int i = 0; i < getWidth(); i += 15) {
      for (int j = 0; j < 4; j++) {
        int y = (int) (Math.random() * 400 + 200);
        g.drawLine(i, y, i + 2, y + 10);
      }
    }
  }
}
