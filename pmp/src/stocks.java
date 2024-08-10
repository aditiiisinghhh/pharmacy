import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class stocks extends JFrame implements ActionListener {
    JButton show,add,back;
    stocks(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/r.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0, 0, 500, 500);
        add(i2);

        setSize(500,500);
        show = new JButton("SHOW STOCKS");
        show.setBounds(60,175,140,100);
        show.addActionListener(this);
        show.setBackground(Color.white);
        i2.add(show);
        add = new JButton("ADD STOCKS");
        add.setBounds(280,175,140,100);
        add.setBackground(Color.white);
        add.addActionListener(this);
        i2.add(add);
        back = new JButton("BACK");
        back.setBounds(340,310,80,50);
        back.addActionListener(this);
        back.setBackground(Color.white);
        i2.add(back);


        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new stocks();
    }
    public void actionPerformed(ActionEvent a){
        if(a.getSource()==show){
            new showStock();
            this.setVisible(false);
        }
        else if(a.getSource()==add){
            new addStock();
            this.setVisible(false);
        }
        else if(a.getSource()==back){
            new home();
            this.setVisible(false);
        }
    }
}

