import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addana extends JFrame implements ActionListener {
    JLabel l1,l2;
    JTextField y,p;
    JButton s,c;

    addana() {
        setSize(600, 400);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/userbg.jpg"));
        Image i3 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0, 0, 600, 400);
        add(i2);

        l1 = new JLabel("YEAR:- ");
        l1.setBounds(150, 100, 150, 40);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
        i2.add(l1);

        l2 = new JLabel("TOTAL PROFIT:- ");
        l2.setBounds(150, 160, 200, 40);
        l2.setFont(new Font("SERIF", Font.BOLD, 20));
        i2.add(l2);

        y = new JTextField();
        y.setBounds(350, 100, 150, 40);
        i2.add(y);

        p = new JTextField();
        p.setBounds(350, 160, 150, 40);
        i2.add(p);

        s = new JButton("SUBMIT");
        s.setBounds(180, 250, 140, 50);
        s.addActionListener(this);
        i2.add(s);
        s.setBackground(Color.white);
        c = new JButton("Cancel");
        c.setBounds(360, 250, 140, 50);
        c.addActionListener(this);
        i2.add(c);
        c.setBackground(Color.white);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == s) {
            String year = this.y.getText();
            String profit = this.p.getText();
            conn c = new conn();
            try {
                String str = "insert into analytics (year,profit) values ('" + year + "','"+profit+"');";
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null, ("DATA ENTERED SUCCESSFULLY!!"));
            } catch (Exception e) {
                System.out.println(e);
            }
            new analytics();
            this.setVisible(false);

        }
        else if (ae.getSource() == c) {
            new home().setVisible(true);//going back to homepage
            this.setVisible(false);
        }

    }

    public static void main(String[] args){
        new addana();
    }
}
