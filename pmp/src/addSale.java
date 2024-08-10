import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class addSale extends JFrame implements ActionListener {

    JButton s, b,r;
    JTextField n, i, p,q;
    JLabel n1, q1, p1,d1,it1;
    JDateChooser d;
    addSale() {

        setSize(600, 600);
JFrame.setDefaultLookAndFeelDecorated(true);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/addsale.jpg"));
        Image i3 = i1.getImage().getScaledInstance(250, 600, Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0, 0, 250, 600);
        add(i2);

        n1 = new JLabel("NAME:");
        n1.setBounds(280, 60, 80, 50);
        n1.setFont(new Font("Tahoma", Font.PLAIN, 19));
        add(n1);
        d1 = new JLabel("DATE:");
        d1.setBounds(280, 150, 100, 50);
        d1.setFont(new Font("Tahoma", Font.PLAIN, 19));
        add(d1);
        q1 = new JLabel("ITEM:");
        q1.setBounds(280, 240, 100, 50);
        q1.setFont(new Font("Tahoma", Font.PLAIN, 19));
        add(q1);
        p1 = new JLabel("PRICE:");
        p1.setBounds(280, 330, 80, 50);
        p1.setFont(new Font("Tahoma", Font.PLAIN, 19));
        add(p1);
        it1 = new JLabel("Quantity");
        it1.setBounds(280,410,100,50);
        it1.setFont(new FontUIResource("Tahoma",Font.PLAIN,19));
        add(it1);

        s = new JButton("Submit");
        s.setBounds(430, 475, 120, 50);
        s.addActionListener(this);
        add(s);
        s.setBackground(Color.white);
        b = new JButton("BACK");
        b.setBounds(280, 475, 120, 50);
        b.addActionListener(this);
        add(b);
        b.setBackground(Color.white);

        n = new JTextField();
        n.setBounds(400, 60, 120, 50);
        add(n);
        i= new JTextField();
        i.setBounds(400, 240, 120, 50);
        add(i);
        p = new JTextField();
        p.setBounds(400, 330, 120, 50);
        add(p);
        q = new JTextField();
        q.setBounds(400,410,120,50);
        add(q);

        d = new JDateChooser();
        d.setBounds(400, 150, 120, 50);
        add(d);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == b) {
            new sale();
            this.setVisible(false);
        } else if (a.getSource() == s) {
            String name = this.n.getText();
            String item = this.i.getText();
            String price = this.p.getText();
            String quantity = this.q.getText();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
            String d = dateFormat.format(this.d.getDate());

            conn c = new conn();
            try {
                String str = "insert into sale (name,date,item,price,quantity) values ('" + name + "','"+d+"','" + item + "','" + price + "','"+quantity+"');";
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "Data is Successfully entered!!");
                String string ="Update stock set quantity = (quantity - '"+quantity+"') where name = '"+item +"';";
                c.s.executeUpdate(string);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public static void main(String[] args) {
        new addSale();
    }
}
