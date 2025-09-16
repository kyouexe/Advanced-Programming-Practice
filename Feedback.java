import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Feedback extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4,r5;
    JTextArea ta;
    JButton sub;
    ButtonGroup g;

    Feedback(){
        setTitle("Feedback");
        setSize(300,300);
        setLayout(new FlowLayout());

        add(new JLabel("Rate (1-5):"));
        r1=new JRadioButton("1"); r2=new JRadioButton("2");
        r3=new JRadioButton("3"); r4=new JRadioButton("4"); r5=new JRadioButton("5");
        g=new ButtonGroup(); g.add(r1); g.add(r2); g.add(r3); g.add(r4); g.add(r5);
        add(r1); add(r2); add(r3); add(r4); add(r5);

        ta=new JTextArea(5,20);
        sub=new JButton("Submit");
        add(new JLabel("Comments:")); add(new JScrollPane(ta));
        add(sub);

        sub.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(this,"Thanks for your feedback!");
        ta.setText(""); g.clearSelection();
    }

    public static void main(String[] a){ new Feedback(); }
}
