import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reference {
    public static void main(String args[]) {
        new Frame1();
    }
}

class Frame1 extends JFrame implements ActionListener {
    JButton b = new JButton("New Frame");

    public Frame1() {
        setVisible(true);
        setSize(250, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(b);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        new Frame2();
        // dispose();
    }
}

class Frame2 extends JFrame {
    public Frame2() {
        setVisible(true);
        setSize(250, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Welcome To New Frame");
        add(l1);
    }
}
