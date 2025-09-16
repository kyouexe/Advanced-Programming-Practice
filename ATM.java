import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ATM extends JFrame implements ActionListener {
    JPasswordField pf;
    JButton ok, cb, dp, wd;
    JTextArea ta;
    JTextField amt;
    int bal = 1000;

    ATM() {
        setTitle("ATM");
        setSize(260, 260);
        setLayout(new FlowLayout());

        pf = new JPasswordField(10);
        ok = new JButton("OK");
        ta = new JTextArea(5, 18);

        add(new JLabel("PIN:"));
        add(pf); add(ok); add(new JScrollPane(ta));

        ok.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ok) {
            String pin = new String(pf.getPassword());
            if (pin.equals("1234")) {
                getContentPane().removeAll();
                cb = new JButton("Balance");
                dp = new JButton("Deposit");
                wd = new JButton("Withdraw");
                amt = new JTextField(10);
                ta = new JTextArea(5, 18);

                add(new JLabel("Amount:"));
                add(amt); add(cb); add(dp); add(wd);
                add(new JScrollPane(ta));

                cb.addActionListener(this);
                dp.addActionListener(this);
                wd.addActionListener(this);

                revalidate(); repaint();
            } else ta.setText("Wrong PIN");
        } else if (e.getSource() == cb) {
            ta.setText("Balance: $" + bal);
        } else if (e.getSource() == dp) {
            try {
                int x = Integer.parseInt(amt.getText());
                bal += x;
                ta.setText("Deposited $" + x + "\nBalance: $" + bal);
            } catch (Exception ex) { ta.setText("Enter valid amt"); }
        } else if (e.getSource() == wd) {
            try {
                int x = Integer.parseInt(amt.getText());
                if (bal >= x) {
                    bal -= x;
                    ta.setText("Withdrew $" + x + "\nBalance: $" + bal);
                } else ta.setText("Insufficient Bal");
            } catch (Exception ex) { ta.setText("Enter valid amt"); }
        }
    }

    public static void main(String[] a) {
        new ATM();
    }
}
