import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class EmpForm extends JFrame implements ActionListener {
    JTextField n, d, s;
    JButton add;
    JTable t;
    DefaultTableModel m;

    EmpForm() {
        setTitle("Employee Form");
        setSize(400,300);
        setLayout(new FlowLayout());

        n = new JTextField(10);
        d = new JTextField(10);
        s = new JTextField(10);
        add = new JButton("Add");

        m = new DefaultTableModel(new String[]{"Name","Dept","Salary"},0);
        t = new JTable(m);

        add(new JLabel("Name:")); add(n);
        add(new JLabel("Dept:")); add(d);
        add(new JLabel("Salary:")); add(s);
        add(add);
        add(new JScrollPane(t));

        add.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = n.getText();
        String dept = d.getText();
        String sal = s.getText();
        if(!name.isEmpty() && !dept.isEmpty() && !sal.isEmpty()) {
            m.addRow(new Object[]{name,dept,sal});
            n.setText(""); d.setText(""); s.setText("");
        }
    }

    public static void main(String[] a) {
        new EmpForm();
    }
}
