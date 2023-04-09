package ChessboardDrawer;

import javax.swing.*;
import java.awt.*;

public class ChessboardDrawer {

    public static void main(String[] args) {
        
        int boardSize = 8;
        int squareSize = 60;
        int screenSize = boardSize * squareSize * 2;
        
        // Create a new JFrame and set its properties
        JFrame frame = new JFrame("Chessboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(screenSize, screenSize);
        frame.setLocationRelativeTo(null);
        
        // Create a JPanel to draw the chessboard
        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                for (int i = 0; i < boardSize; i++) {
                    for (int j = 0; j < boardSize; j++) {
                        if ((i + j) % 2 == 0) {
                            g2d.setColor(Color.WHITE);
                        } else {
                            g2d.setColor(Color.BLACK);
                        }
                        int x = j * squareSize;
                        int y = i * squareSize;
                        g2d.fillRect(x, y, squareSize, squareSize);
                    }
                }
            }
        };
        
        // Add the panel to the frame and show it
        frame.add(panel);
        frame.setVisible(true);
    }
}