import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

public class Reference4 extends JPanel {
    // JTable Header
    String[] columns = new String[] {
            "Id",
            "Name",
            "Address",
            "Hourly rate",
            "Part time"
    };
    // JTable data in a 2D table
    Object[][] data = new Object[][] {
            { 1, "Thomas", "259 Saint James Drive, Florida", 20.0, true },
            { 2, "Jean", "2189 Saints Alley, Florida", 50.0, false },
            { 3, "Yohan", "3840 Irish Lane, Boston", 30.0, true },
            { 4, "Emily", "222 Duff Avenue, New York", 60.0, false },
            { 5, "Alex", "1632 Village View Drive, Missouri", 10.0, false },
    };
    // create a JTable with data
    JTable table = new JTable(data, columns);
    TableRowSorter<TableModel> sort = new TableRowSorter<>(table.getModel());
    JTextField textField = new JTextField();

    public Reference4() {
        // set the width of the 3rd column to 200 pixels
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(2).setPreferredWidth(200);

        table.setRowSorter(sort);
        JPanel p = new JPanel(new BorderLayout());
        p.add(new JLabel("Search for a word:"), BorderLayout.WEST);
        p.add(textField, BorderLayout.CENTER);
        setLayout(new BorderLayout());
        add(p, BorderLayout.SOUTH);
        add(new JScrollPane(table), BorderLayout.CENTER);
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String str = textField.getText();
                if (str.trim().length() == 0) {
                    sort.setRowFilter(null);
                } else {
                    // (?i) means case insensitive search
                    sort.setRowFilter(RowFilter.regexFilter("(?i)" + str));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String str = textField.getText();
                if (str.trim().length() == 0) {
                    sort.setRowFilter(null);
                } else {
                    sort.setRowFilter(RowFilter.regexFilter("(?i)" + str));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame f = new JFrame("Search in JTable");
                f.add(new Reference4());
                f.setSize(500, 180);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setLocationRelativeTo(null);
                f.setVisible(true);
            }
        });
    }
}