import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class addStock extends JFrame implements ActionListener {

    JButton s, b,r;
    JTextField n, q, p;
    JLabel n1, q1, d1;
    JDateChooser d;

    addStock() {
        setSize(600, 600);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/stockpage.jpg"));
        Image i3 = i1.getImage().getScaledInstance(250, 600, Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0, 0, 250, 600);
        add(i2);
        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("images/refresh.png"));
        Image i7  = i5.getImage().getScaledInstance(35,35,Image.SCALE_SMOOTH);
        ImageIcon i8 = new ImageIcon(i7);

        n1 = new JLabel("NAME :");
        n1.setBounds(280, 100, 100, 60);
        n1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(n1);
        q1 = new JLabel("QUANTITY :");
        q1.setBounds(280, 200, 150, 60);
        q1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(q1);
        d1 = new JLabel("DATE:");
        d1.setBounds(280, 300, 100, 60);
        d1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(d1);

        s = new JButton("Submit");
        s.setBounds(430, 450, 120, 60);
        s.addActionListener(this);
        s.setBackground(Color.white);
        add(s);
        b = new JButton("BACK");
        b.setBounds(280, 450, 120, 60);
        b.addActionListener(this);
        b.setBackground(Color.white);
        add(b);
        r = new JButton(i8);
        r.setBounds(510,400,40,40);
        r.addActionListener(this);
        r.setBackground(Color.white);
        add(r);

        n = new JTextField();
        n.setBounds(400, 100, 120, 60);
        add(n);
        q = new JTextField();
        q.setBounds(400, 200, 120, 60);
        add(q);
        d = new JDateChooser();
        d.setBounds(400, 300, 120, 60);
        add(d);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == b) {
            new stocks();
            this.setVisible(false);
        } else if (a.getSource() == s) {
            String name = this.n.getText();
            String quantity = this.q.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
            String date = dateFormat.format(this.d.getDate());
            conn c = new conn();
            try {
                String str = "insert into stock (name,quantity,date) values ('" + name + "','" + quantity + "','" + date + "');";
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "Data is Successfully entered!!");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        else if(a.getSource() == r){
            new addStock();
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new addStock();
    }
}