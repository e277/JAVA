import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridLayout;

public class Q1Telephone {
    private JFrame frame;
    private JPanel mainPanel, labelPanel, buttonPanel, textPanel;
    private JLabel label, numLabel;
    private JButton one, two, three, four, five, six, seven, eight, nine, star, zero, hash;
    private JTextField numField;

    public Q1Telephone() {
        frame = new JFrame();

        label = new JLabel("Telephone");
        labelPanel = new JPanel();
        labelPanel.add(label);
        labelPanel.setLayout(new GridLayout(2, 3));

        buttonPanel = new JPanel();
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        star = new JButton("*");
        zero = new JButton("0");
        hash = new JButton("#");

        buttonPanel.add(one);
        buttonPanel.add(two);
        buttonPanel.add(three);
        buttonPanel.add(four);
        buttonPanel.add(five);
        buttonPanel.add(six);
        buttonPanel.add(seven);
        buttonPanel.add(eight);
        buttonPanel.add(nine);
        buttonPanel.add(star);
        buttonPanel.add(zero);
        buttonPanel.add(hash);
        buttonPanel.setLayout(new GridLayout(4, 3, 5, 5));

        numLabel = new JLabel("Number to call: ");
        numField = new JTextField(10);
        textPanel = new JPanel();
        textPanel.add(numLabel);
        textPanel.add(numField);
        textPanel.setLayout(new GridLayout(4, 2, 5, 5));

        mainPanel = new JPanel();
        mainPanel.add(labelPanel);
        mainPanel.add(buttonPanel);
        mainPanel.add(textPanel);
        mainPanel.setLayout(new GridLayout(3, 3, 5, 5));

        frame.add(mainPanel);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Q1Telephone();
    }
}
