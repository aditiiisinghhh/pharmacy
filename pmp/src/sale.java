import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class sale extends JFrame implements ActionListener {

    JButton n,s,b;

    sale(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/r.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0, 0, 500, 500);
        add(i2);

        setSize(500,500);
        s = new JButton("SHOW HISTORY");
        s.setBounds(60,175,140,100);
        s.setBackground(Color.white);
        s.addActionListener(this);
        i2.add(s);
        n = new JButton("ADD NEW SALE");
        n.setBounds(280,175,140,100);
        n.addActionListener(this);
        i2.add(n);
        n.setBackground(Color.white);
        b = new JButton("BACK");
        b.setBounds(340,310,80,50);
        b.addActionListener(this);
        b.setBackground(Color.white);
        i2.add(b);


        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        new sale();
    }
    public void actionPerformed(ActionEvent a){
        if(a.getSource()==s){
new showSale();
            this.setVisible(false);
        }
        else if(a.getSource()==n){
new addSale();
            this.setVisible(false);
        }
        else if(a.getSource()==b){
            new home();
            this.setVisible(false);
        }
    }
}
