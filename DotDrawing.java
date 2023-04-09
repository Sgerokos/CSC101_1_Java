package DotDrawing;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DotDrawing extends JPanel {

    // define the distance method
    private double distance(double xa, double ya, double xb, double yb) {
        double distance = Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));
        return distance;
    }

    // define the drawDot method
    private void drawDot(Graphics g, int x, int y) {
        g.fillOval(x, y, 6, 6);
    }

    // define the drawCircle method
    private void drawCircle(Graphics g, int x, int y, int radius) {
        g.drawOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    // define the drawRectangle method
    private void drawRectangle(Graphics g, int x, int y, int width, int height) {
        g.drawRect(x - width / 2, y - height / 2, width, height);
    }

    // define the drawDotsInCircle method
    private void drawDotsInCircle(Graphics g) {
        Random rand = new Random();
        int dotsCount = 0;
        while (dotsCount < 10) {
            int x = rand.nextInt(100);
            int y = rand.nextInt(100) - 50;
            if (distance(x, y, 50, 0) <= 50) {
                drawDot(g, x, y);
                dotsCount++;
            }
        }
    }

    // define the drawDotsInSquare method
    private void drawDotsInSquare(Graphics g) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int x = rand.nextInt(100) - 125;
            int y = rand.nextInt(100) - 50;
            drawDot(g, x, y);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the rectangle
        g.setColor(Color.BLACK);
        drawRectangle(g, 75, 100, 100, 100);

        // Draw the circle
        g.setColor(Color.BLACK);
        drawCircle(g, 225, 100, 50);

        // Draw the dots in the circle
        g.setColor(Color.BLUE);
        drawDotsInCircle(g);

        // Draw the dots in the square
        g.setColor(Color.RED);
        drawDotsInSquare(g);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Circle and Rectangle Drawer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DotDrawing panel = new DotDrawing();
        frame.add(panel);
        frame.setSize(400, 250);
        frame.setVisible(true);
    }

}