import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame implements ActionListener {
    JButton b1;
    main(){
        setSize(800,700);
        //Adding a background image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/start.jpg"));
        Image i3  = i1.getImage().getScaledInstance(800,700,Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0,0,800,700);
        add(i2);
        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("images/logo.png"));
        Image i7  = i5.getImage().getScaledInstance(300,100,Image.SCALE_SMOOTH);
        ImageIcon i8 = new ImageIcon(i7);
        JLabel i6 = new JLabel(i8);
        i6.setBounds(250,80,300,100);
        i2.add(i6);
        b1 = new JButton("Login...");
        b1.setBounds(560,570,90,50);
        b1.setBackground(Color.white);
        b1.addActionListener(this);
        i2.add(b1);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            new login();
            this.setVisible(false);
        }
    }
    public static void main(String[] args) {
        new main();
    }
}



