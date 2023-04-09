package TurtleDesign_SG_Star;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TurtleDesign_SG_Star extends JPanel {

    // Override the paint method
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Set the background color to black
        setBackground(Color.BLACK);

        // Designing the letter S
        g.setColor(Color.BLUE);
        g.fillRect(50, 100, 50, 5);
        g.fillRect(50, 100, 5, 50);
        g.fillRect(50, 145, 50, 5);
        g.fillRect(95, 145, 5, 50);
        g.fillRect(50, 195, 50, 5);

        // Drawing the letter G
        g.setColor(Color.RED);
        g.fillRect(200, 100, 50, 5);
        g.fillRect(200, 100, 5, 50);
        g.fillRect(200, 145, 50, 5);
        g.fillRect(245, 145, 5, 30);
        g.fillRect(230, 165, 15, 5);
        g.fillRect(230, 180, 15, 5);
        g.fillRect(200, 195, 50, 5);
        g.fillRect(200, 195, 5, 50);
        g.fillRect(245, 195, 5, 30);

        // Drawing the star
        g.setColor(Color.GRAY);
        int xpoints[] = {400, 420, 450, 425, 435, 400, 365, 375, 350, 380};
        int ypoints[] = {150, 185, 185, 200, 230, 215, 230, 200, 185, 185};
        int npoints = 10;
        g.fillPolygon(xpoints, ypoints, npoints);
    }

    // Main method
    public static void main(String[] args) {
        // Creating the JFrame
        JFrame frame = new JFrame("Drawing Letters and Shapes");

        // Creating the DrawingLettersAndShapes object and adding it to the frame
        TurtleDesign_SG_Star drawing = new TurtleDesign_SG_Star();
        frame.add(drawing);

        // Setting up the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}