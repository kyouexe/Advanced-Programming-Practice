import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calc extends JFrame implements ActionListener {
    JTextField tf;
    String cur="";
    int val=0;
    char op=' ';

    Calc(){
        setTitle("Calc"); setSize(250,300); setLayout(new BorderLayout());
        tf=new JTextField(); tf.setEditable(false);
        add(tf,"North");
        JPanel p=new JPanel(new GridLayout(4,4));
        String[] b={"7","8","9","/","4","5","6","*","1","2","3","-","0","C","=","+"};
        for(String s:b){ JButton bt=new JButton(s); bt.addActionListener(this); p.add(bt); }
        add(p);
        setDefaultCloseOperation(EXIT_ON_CLOSE); setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String k=e.getActionCommand();
        if("0123456789".contains(k)){
            cur+=k; tf.setText(cur);
        } else if("+-*/".contains(k)){
            try{
                if(!cur.isEmpty()){
                    if(op==' ') val=Integer.parseInt(cur);
                    else val=calc(val,Integer.parseInt(cur),op);
                }
                op=k.charAt(0); cur=""; tf.setText(val + String.valueOf(op));
            }catch(Exception ex){ tf.setText("Err"); cur=""; op=' '; val=0; }
        } else if(k.equals("=")){
            try{
                if(op!=' ' && !cur.isEmpty()){
                    val=calc(val,Integer.parseInt(cur),op);
                    tf.setText(String.valueOf(val));
                    cur=""; op=' ';
                }
            }catch(ArithmeticException ae){ tf.setText("Div0"); cur=""; op=' '; val=0;
            }catch(Exception ex){ tf.setText("Err"); cur=""; op=' '; val=0; }
        } else if(k.equals("C")){
            cur=""; op=' '; val=0; tf.setText("");
        }
    }

    int calc(int a,int b,char o){
        switch(o){
            case '+': return a+b;
            case '-': return a-b;
            case '*': return a*b;
            case '/': return a/b;
        }
        return 0;
    }

    public static void main(String[]a){ new Calc(); }
}
