import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Q3_4Drawing {
    private JFrame frame;
    private JPanel paintPanel;
    private JButton drawButton;
    private JButton clearButton;

    public Q3_4Drawing() {
        frame = new JFrame();
        paintPanel = new JPanel();
        drawButton = new JButton("Draw");
        clearButton = new JButton("Clear");
        paintPanel.add(drawButton);
        paintPanel.add(clearButton);
        paintPanel.setLayout(new GridLayout(2, 3));
        paintPanel.setBackground(Color.BLUE);
        paintPanel.setForeground(Color.WHITE);
        paintPanel.setPreferredSize(new Dimension(300, 300));
        paintPanel.setVisible(true);
        frame.add(paintPanel);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // draw a "t" on the panel using the Graphics object
    public void drawT(Graphics g) {
        g.drawLine(100, 100, 100, 200);
        g.drawLine(100, 200, 200, 200);
        g.drawLine(200, 200, 200, 100);
        g.drawLine(200, 100, 100, 100);
    }

    // clear the panel when clicked on the "Clear" button
    public void clearPanel() {
        paintPanel.removeAll();
    }

    // main method
    public static void main(String[] args) {
        Q3_4Drawing drawing = new Q3_4Drawing();
        drawing.drawT(drawing.paintPanel.getGraphics());
        drawing.clearPanel();
    }
}