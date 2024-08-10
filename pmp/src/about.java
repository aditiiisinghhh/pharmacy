import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class about extends JFrame implements ActionListener{
    JLabel l1, l2,l3,l4,l5;
    JButton b;
    about() {
        setSize(600, 400);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/showCust.jpg"));
        Image i3 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0, 0, 600, 400);
        add(i2);

        l1 = new JLabel(":-Our system help's any pharmacy store to maintain records.\n ");
        l1.setBounds(50, 70, 600, 40);
        l1.setFont(new Font("Serif", Font.BOLD, 18));
        i2.add(l1);
        l2 = new JLabel(":-The user can keep the sale's data , stock's data , ");
        l2.setBounds(50, 120, 600, 40);
        l2.setFont(new Font("SERIF", Font.BOLD, 18));
       i2. add(l2);
        l3 = new JLabel("and customer's data in a very easy and efficient way.");
        l3.setBounds(50, 150, 600, 40);
        l3.setFont(new Font("Serif", Font.BOLD, 18));
        i2.add(l3);
        l4 = new JLabel(":-Using this , there wouldn't be any mess in maintaining\n ");
        l4.setBounds(50, 190, 600, 40);
        l4.setFont(new Font("Serif", Font.BOLD, 18));
        i2.add(l4);
        l5 = new JLabel("any books or files or any written data .\n ");
        l5.setBounds(50, 220, 600, 40);
        l5.setFont(new Font("Serif", Font.BOLD, 18));
        i2.add(l5);
        b= new JButton("BACK");
        b.setBounds(470,300,100,50);
        b.addActionListener(this);
        b.setBackground(Color.white);
        i2.add(b);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == b) {
            new home();
            this.setVisible(false);
        }
    }
    public static void main(String[] args) {
        new about();
    }

}