
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

public class AccountantGUI extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JTable studentDataTable;
    private JTextField textField, textField_1, textField_2, textField_3, searchField;
    private JButton editStudent, deleteStudent, addStudent, searchButton;

    public AccountantGUI() {
        setTitle("Accountant Page");
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
                        { "Ezra", "Muir", "300.00", "26/07/2022" },
                },
                new String[] {
                        "First Name", "Last Name", "Payment Amount", "Payment Date"
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
        int selectedRow = studentDataTable.getSelectedRow();

        if (e.getSource() == addStudent) {
            String firstName = textField.getText();
            String lastName = textField_1.getText();
            String paymentAmount = textField_2.getText();
            String paymentDate = textField_3.getText();

            // check if all fields are filled
            if (firstName.equals("") || lastName.equals("") || paymentAmount.equals("") || paymentDate.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill in all fields");
            } else {
                String[] row = { firstName, lastName, paymentAmount, paymentDate };
                DefaultTableModel model = (DefaultTableModel) studentDataTable.getModel();
                model.addRow(row);
            }
            clearFields();
        } else if (e.getSource() == editStudent && selectedRow >= 0) {
            textField.setText(studentDataTable.getValueAt(selectedRow, 0).toString());
            textField_1.setText(studentDataTable.getValueAt(selectedRow, 1).toString());
            textField_2.setText(studentDataTable.getValueAt(selectedRow, 2).toString());
            textField_3.setText(studentDataTable.getValueAt(selectedRow, 3).toString());
            String firstName = textField.getText();
            String lastName = textField_1.getText();
            String paymentAmount = textField_2.getText();
            String paymentDate = textField_3.getText();
            String[] row = { firstName, lastName, paymentAmount, paymentDate };
            DefaultTableModel model = (DefaultTableModel) studentDataTable.getModel();
            model.setValueAt(row[0], selectedRow, 0);
            model.setValueAt(row[1], selectedRow, 1);
            model.setValueAt(row[2], selectedRow, 2);
            model.setValueAt(row[3], selectedRow, 3);
            clearFields();
        } else if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row to edit");
        } else if (e.getSource() == deleteStudent && selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) studentDataTable.getModel();
            model.removeRow(selectedRow);
        } else if (e.getSource() == searchButton) {
            String search = searchField.getText();
            // search each row cell case insensitive using nested for loops, highlight the
            // row if search field is found, else if search field is not found, show error
            // message
            for (int row = 0; row < studentDataTable.getRowCount(); row++) {
                for (int col = 0; col < studentDataTable.getColumnCount(); col++) {
                    if (studentDataTable.getValueAt(row, col).toString().toLowerCase().contains(search.toLowerCase())) {
                        studentDataTable.setRowSelectionInterval(row, row);
                        return;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "No results found");
            clearFields();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }
}
