import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Q2BMI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JLabel label1 = new JLabel("Height(\"):");
        label1.setBounds(20, 20, 100, 40);
        frame.add(label1);

        JLabel label2 = new JLabel("Weight(lb):");
        label2.setBounds(20, 60, 100, 40);
        frame.add(label2);

        JLabel labelResult = new JLabel("BMI Calculator");
        labelResult.setBounds(20, 90, 300, 40);
        frame.add(labelResult);

        JTextField txtHeight = new JTextField("");
        txtHeight.setBounds(120, 20, 200, 40);
        frame.add(txtHeight);

        JTextField txtWeight = new JTextField("");
        txtWeight.setBounds(120, 60, 200, 40);
        frame.add(txtWeight);

        JButton button = new JButton("BMI");
        button.setBounds(20, 130, 300, 40);

        // Event
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double weight = Double.parseDouble(txtWeight.getText());
                double height = Double.parseDouble(txtHeight.getText());

                double bmi = weight / Math.pow(height, 2) * 703;

                if (bmi < 18.5) {
                    labelResult.setText("underweight - BMI : " + bmi);
                } else if (bmi < 25) {
                    labelResult.setText("normal - BMI : " + bmi);
                } else if (bmi < 30) {
                    labelResult.setText("overweight - BMI : " + bmi);
                } else {
                    labelResult.setText("obese - BMI : " + bmi);
                }
            }
        });

        frame.add(button);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}