import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Color;

public class Scenery extends JPanel {
  private int bg;
  private int weather;

  public Scenery(int background, int weather) {
    this.bg = background;
    this.weather = weather;

  }
  @Override
  public Dimension getPreferredSize() {
    return new Dimension(800, 600);
  }

  @Override
  public
}
