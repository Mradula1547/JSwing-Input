import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jswing2 {
    public static void main(String[] args) {
        swng2 obj = new swng2();
    }
}

class swng2 extends JFrame implements ActionListener {
    JTextField t1, t2;
    JButton btn;
    JLabel lb1, lb2, lb3;
    public swng2(){
        t1 = new JTextField(30);
        t2 = new JTextField(30);
        btn = new JButton("OK");
        lb1 = new JLabel("First Name : ");
        lb2 = new JLabel("Last Name : ");
        lb3 = new JLabel("Name : ");

        add(lb1);
        add(t1);
        add(lb2);
        add(t2);
        add(btn);
        add(lb3);

        btn.addActionListener(this);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(3);
    }

    public void actionPerformed(ActionEvent actn) {
        String fn = t1.getText();
        String ln = t2.getText();

    }

}
