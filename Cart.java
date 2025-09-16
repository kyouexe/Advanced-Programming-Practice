import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cart extends JFrame implements ActionListener {
    JCheckBox c1, c2, c3;
    JButton b;
    JTextArea ta;

    Cart() {
        setTitle("Cart");
        setSize(250, 250);
        setLayout(new FlowLayout());

        c1 = new JCheckBox("Laptop - $800");
        c2 = new JCheckBox("Phone - $500");
        c3 = new JCheckBox("Headphones - $100");
        b = new JButton("Bill");
        ta = new JTextArea(5, 18);

        add(c1); add(c2); add(c3);
        add(b); add(new JScrollPane(ta));

        b.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int t = 0;
        String s = "Items:\n";
        if (c1.isSelected()) { t += 800; s += "Laptop - $800\n"; }
        if (c2.isSelected()) { t += 500; s += "Phone - $500\n"; }
        if (c3.isSelected()) { t += 100; s += "Headphones - $100\n"; }
        s += "Total: $" + t;
        ta.setText(s);
    }

    public static void main(String[] a) {
        new Cart();
    }
}
