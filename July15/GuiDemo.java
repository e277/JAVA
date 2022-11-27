import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

public class GuiDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JScrollBar scrollBar = new JScrollBar();
        JLabel label = new JLabel("Enter your name: ");
        JTextField textField = new JTextField(10);
        JButton submit = new JButton("Submit");
        JButton clear = new JButton("Clear");

        submit.setBounds(30, 30, 10, 10);
        clear.setBounds(30, 30, 10, 10);

        panel.add(label);
        panel.add(textField);
        panel.add(submit);
        panel.add(clear);
        panel.add(scrollBar);

        String text = textField.getText();
        System.out.println(text);

        frame.add(panel);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}