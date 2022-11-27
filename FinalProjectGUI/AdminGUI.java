
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminGUI extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JTable studentDataTable;
    private JTextField textField_0, textField_1, textField_2, textField_3, textField_4 searchField;
    private JButton editAccButton, deleteAccButton, addAccButton, searchAccButton;

    public AdminGUI() {
        setTitle("Admin Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 900, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel firstName = new JLabel("First Name");
        firstName.setBounds(38, 43, 124, 13);
        contentPane.add(firstName);

        textField = new JTextField();
        textField.setBounds(172, 40, 268, 19);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lastName = new JLabel("Last Name");
        lastName.setBounds(38, 72, 124, 13);
        contentPane.add(lastName);

        textField_1 = new JTextField();
        textField_1.setBounds(172, 69, 268, 19);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        JLabel paymentAmount = new JLabel("Payment Amount");
        paymentAmount.setBounds(38, 104, 124, 13);
        contentPane.add(paymentAmount);

        textField_2 = new JTextField();
        textField_2.setBounds(172, 98, 268, 19);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        JLabel paymentDate = new JLabel("Payment Date");
        paymentDate.setBounds(38, 133, 124, 13);
        contentPane.add(paymentDate);

        textField_3 = new JTextField();
        textField_3.setBounds(172, 127, 268, 19);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        addStudent = new JButton("Add Student");
        addStudent.setBounds(38, 167, 134, 23);
        contentPane.add(addStudent);
        addStudent.addActionListener(this);

        // edit and delete buttons
        editStudent = new JButton("Edit");
        editStudent.setBounds(195, 167, 89, 23);
        contentPane.add(editStudent);
        editStudent.addActionListener(this);

        deleteStudent = new JButton("Delete");
        deleteStudent.setBounds(298, 167, 89, 23);
        contentPane.add(deleteStudent);
        deleteStudent.addActionListener(this);

        // search field
        searchField = new JTextField();
        searchField.setBounds(411, 167, 89, 23);
        contentPane.add(searchField);
        searchField.setColumns(10);

        // search button
        searchButton = new JButton("Search");
        searchButton.setBounds(510, 167, 89, 23);
        contentPane.add(searchButton);
        searchButton.addActionListener(this);

        // table
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(38, 216, 800, 200);
        contentPane.add(scrollPane);
        studentDataTable = new JTable();
        scrollPane.setViewportView(studentDataTable);
        studentDataTable.setModel(new DefaultTableModel(
                new Object[][] {
                        { "Ezra", "Muir", "300.00", "26/07/2022", "BR001", "ACC003", "Accountant1" },
                        { "Vanessa", "Muir", "350.00", "01/09/2019", "BR003", "ACC025", "Accountant3" },
                        { "Jane", "Doe", "89.95", "12/12/2012", "BR002", "ACC002", "Accountant2" },
                        { "Shana-lee", "Duggy", "90.00", "24/" }
                },
                new String[] {
                        "First Name", "Last Name", "Payment Amount", "Payment Date", "Branch Id", "Accountant Id",
                        "Accountant Name"
                }));
    }

    public void clearFields() {
        textField.setText("");
        textField_1.setText("");
        textField_2.setText("");
        textField_3.setText("");
    }

    // sorter
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addStudent) {
            String firstName = textField.getText();
            String lastName = textField_1.getText();
            String paymentAmount = textField_2.getText();
            String paymentDate = textField_3.getText();
            String branchId = "BR001";
            String accountantId = "ACC003";
            String accountantName = "Accountant1";
            // check if all fields are filled
            if (firstName.equals("") || lastName.equals("") || paymentAmount.equals("") || paymentDate.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill in all fields");
            } else {
                String[] row = { firstName, lastName, paymentAmount, paymentDate, branchId, accountantId,
                        accountantName };
                DefaultTableModel model = (DefaultTableModel) studentDataTable.getModel();
                model.addRow(row);
            }
        } else if (e.getSource() == editStudent) {
            int selectedRow = studentDataTable.getSelectedRow();
            if (selectedRow >= 0) {
                String firstName = textField.getText();
                String lastName = textField_1.getText();
                String paymentAmount = textField_2.getText();
                String paymentDate = textField_3.getText();
                String branchId = "BR001";
                String accountantId = "ACC003";
                String accountantName = "Accountant1";
                String[] row = { firstName, lastName, paymentAmount, paymentDate, branchId, accountantId,
                        accountantName };
                DefaultTableModel model = (DefaultTableModel) studentDataTable.getModel();
                model.setValueAt(firstName, selectedRow, 0);
                model.setValueAt(lastName, selectedRow, 1);
                model.setValueAt(paymentAmount, selectedRow, 2);
                model.setValueAt(paymentDate, selectedRow, 3);
                model.setValueAt(branchId, selectedRow, 4);
                model.setValueAt(accountantId, selectedRow, 5);
                model.setValueAt(accountantName, selectedRow, 6);
            } else {
                JOptionPane.showMessageDialog(null, "Please select a row");
            }
        } else if (e.getSource() == deleteStudent) {
            int selectedRow = studentDataTable.getSelectedRow();
            if (selectedRow >= 0) {
                DefaultTableModel model = (DefaultTableModel) studentDataTable.getModel();
                model.removeRow(selectedRow);
            } else {
                JOptionPane.showMessageDialog(null, "Please select a row");
            }
        } else if (e.getSource() == searchButton) {
            String search = searchField.getText();
            String firstName = textField.getText();
            String lastName = textField_1.getText();
            String paymentAmount = textField_2.getText();
            String paymentDate = textField_3.getText();
            String branchId = "BR001";
            String accountantId = "ACC003";
            String accountantName = "Accountant1";

            // search each row cell case insensitive using nested for loops, highlight the
            // row if search field is found, else if search field is not found, show error
            // message, else show error message fpr empty search field
            for (int row = 0; row < studentDataTable.getRowCount(); row++) {
                for (int col = 0; col < studentDataTable.getColumnCount(); col++) {
                    if (studentDataTable.getValueAt(row, col).toString().toLowerCase().contains(search.toLowerCase())) {
                        studentDataTable.setRowSelectionInterval(row, row);
                        clearFields();
                        return;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "No results found");

        }
    }
}
