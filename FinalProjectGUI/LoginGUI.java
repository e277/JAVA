import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class LoginGUI extends JFrame {

    private JPanel contentPane;
    private JTextField textField;

    private final String adminID = "ad";
    private final String accID = "ac";
    private JRadioButton admin;
    private JRadioButton accountant;
    private JLabel heading;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoginGUI frame = new LoginGUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public LoginGUI() {
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 900, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        heading = new JLabel("Use the form below to login");
        heading.setFont(new Font("Tahoma", Font.PLAIN, 20));
        heading.setBounds(129, 92, 262, 35);
        contentPane.add(heading);

        JLabel userID = new JLabel("UserName:");
        userID.setFont(new Font("Tahoma", Font.BOLD, 16));
        userID.setBounds(123, 171, 89, 35);
        contentPane.add(userID);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
        textField.setBounds(247, 171, 155, 35);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel userType = new JLabel("User Type:");
        userType.setFont(new Font("Tahoma", Font.BOLD, 16));
        userType.setBounds(123, 231, 89, 25);
        contentPane.add(userType);

        admin = new JRadioButton("Admin");
        admin.setFont(new Font("Tahoma", Font.PLAIN, 16));
        admin.setBounds(247, 233, 162, 21);
        contentPane.add(admin);

        accountant = new JRadioButton("Accountant");
        accountant.setFont(new Font("Tahoma", Font.PLAIN, 16));
        accountant.setBounds(247, 264, 162, 21);
        contentPane.add(accountant);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(admin);
        buttonGroup.add(accountant);

        JButton login = new JButton("Login");

        // action listener for login button to check if the user is admin or accountant
        // and then open the appropriate page (admin or accountant)
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (admin.isSelected()) {
                    if (textField.getText().equals(adminID)) {
                        AdminGUI adminCrud = new AdminGUI();
                        adminCrud.setVisible(true);
                        dispose();
                    } else {
                        JLabel error = new JLabel("Invalid UserName");
                        error.setFont(new Font("Tahoma", Font.PLAIN, 16));
                        error.setBounds(123, 300, 162, 35);
                        contentPane.add(error);
                    }
                } else if (accountant.isSelected()) {
                    if (textField.getText().equals(accID)) {
                        AccountantGUI accountantGUI = new AccountantGUI();
                        accountantGUI.setVisible(true);
                        dispose();
                    } else {
                        JLabel error = new JLabel("Invalid UserName");
                        error.setFont(new Font("Tahoma", Font.PLAIN, 16));
                        error.setBounds(123, 300, 162, 35);
                        contentPane.add(error);
                    }
                }
            }
        });

        login.setFont(new Font("Tahoma", Font.PLAIN, 16));
        login.setBounds(189, 335, 144, 50);
        contentPane.add(login);
    }
}
