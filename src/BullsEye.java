import javax.swing.*;

/**
 * Auto Coin Lab
 * Author: Keira
 * Collaborator(s): Megan
 * On My Honor, I confirm that I followed all collaboration policy guidelines and that the work I am submitting is my own: KAK
 **/
import java.awt.*;
import javax.swing.*;
        public class BullsEye extends JPanel {
            public static void main(String[] args) {
                JFrame frame = new JFrame("Paint");
                frame.add(new BullsEye());
                frame.setSize(400, 400);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.white); // makes the bullseye a color
                g.drawOval(175,175,50,50); // I am drawing a circle with a diameter of 25 175 units from the orgin (top left)
                g.setColor(Color.BLUE);
                g.drawOval(150, 150, 100, 100); // I am drawing a circle 150 units down with a diameter of 100
                g.setColor(Color.CYAN);
                g.drawOval(125,125,150,150);
                g.setColor(Color.GREEN);
                g.drawOval(100, 100, 200, 200);
                g.setColor(Color.YELLOW);
                g.drawOval(75,75,250,250);
                g.setColor(Color.orange);
                g.drawOval(50,50,300,300);
                g.setColor(Color.pink);
                g.drawOval(25,25,350,350);
                g.setColor(Color.magenta);
                g.drawOval(0,0,400,400);
                g.setColor(Color.red);

            }
        }
