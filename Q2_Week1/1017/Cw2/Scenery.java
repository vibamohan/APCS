import java.awt.*;
import javax.swing.*;

public class Scenery extends JPanel {
    public Scenery() {}

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(new Color(135, 206, 235));
        drawGrass(g);

        int x = 50;
        while (x <= 500) {
            drawTree(g, x, 300);
            x += 45;
        }

        int cx = 100;
        while (cx <= 500) {
            drawCloud(g, cx, 80);
            cx += 80;
        }

        int gx = 0;
        while (gx <= 600) {
            drawGrassBlade(g, gx, 380);
            gx += 6;
        }
    }

    public void drawTree(Graphics g, int x, int y) {
        g.setColor(new Color(139, 69, 19));
        g.fillRect(x + 10, y, 20, 50);

        g.setColor(new Color(34, 139, 34));
        g.fillOval(x - 10, y - 30, 60, 50);
    }

    public void drawCloud(Graphics g, int x, int y) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, 50, 30);
        g.fillOval(x + 20, y - 10, 50, 30);
        g.fillOval(x + 40, y, 50, 30);
    }

    public void drawGrassBlade(Graphics g, int x, int y) {
        g.setColor(new Color(0, 100, 0));
        g.drawLine(x, y, x + 2, y - 10);
    }

    public void drawGrass(Graphics g) {
        g.setColor(new Color(34, 139, 34));
        g.fillRect(0, 350, getWidth(), 150);
    }
}
