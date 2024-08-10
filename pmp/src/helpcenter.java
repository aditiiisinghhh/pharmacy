import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class helpcenter extends JFrame implements ActionListener {
    JTextField sr;
    JButton search,b;
    JLabel l1;
    helpcenter(){
        setSize(600,400);

        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("images/search.jpg"));
        Image i7  = i5.getImage().getScaledInstance(600,400,Image.SCALE_SMOOTH);
        ImageIcon i8 = new ImageIcon(i7);
        JLabel i6 = new JLabel(i8);
        i6.setBounds(0,0,600,400);
        add(i6);

        search = new JButton("SEND");
        search.setBounds(480,180,80,30);
        search.addActionListener(this);
        search.setBackground(Color.white);
        i6.add(search);
        b= new JButton("BACK");
        b.setBounds(470,300,100,50);
        b.addActionListener(this);
        b.setBackground(Color.white);
        i6.add(b);
        sr = new JTextField();
        sr.setBounds(180,180,300,30);
        i6.add(sr);

        l1 = new JLabel("ENTER YOU PROBLEM ");
        l1.setBounds(200,100,550,100);
        l1.setFont(new Font("SERIF", Font.ITALIC, 25));
        i6.add(l1);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == search) {
            String prob = this.sr.getText();
            conn c = new conn();
            try {
                String str = "insert into help (prob) values ('" + prob + "');";
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null, ("YOUR ISSUE WILL BE SOLVED IN 48HRs"));
            } catch (Exception e) {
                System.out.println(e);
            }
            new home();
            this.setVisible(false);
        }
        else if(a.getSource()==b){
            new home();
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new helpcenter();
    }


}
