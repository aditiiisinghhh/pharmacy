import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class customer extends JFrame implements ActionListener {
    JButton show,add,back;
    customer(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/r.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0, 0, 500, 500);
        add(i2);

        setSize(500,500);
        show = new JButton("SHOW DETAILS");
        show.setBounds(60,175,140,100);
        show.setBackground(Color.white);
        show.addActionListener(this);
        i2.add(show);
        add = new JButton("ADD DETAILS");
        add.setBounds(280,175,140,100);
        add.setBackground(Color.white);
        add.addActionListener(this);
        i2.add(add);
        back = new JButton("BACK");
        back.setBounds(340,310,80,50);
        back.setBackground(Color.white);
        back.addActionListener(this);
        i2.add(back);


        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new customer();
    }
    public void actionPerformed(ActionEvent a){
        if(a.getSource()==show){
         new showDetails();
            this.setVisible(false);
        }
        else if(a.getSource()==add){
            new addDetails();
            this.setVisible(false);
        }
        else if(a.getSource()==back){
            new home();
            this.setVisible(false);
        }
    }
}
