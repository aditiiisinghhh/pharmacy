import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

public class settings extends JFrame implements ActionListener {
    JRadioButton e,h,m,on,off;
    ButtonGroup lan,noti;
    JLabel l,n,hc,a;
    JButton hc1,a1,b;
    settings(){
        setSize(500,500);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/r.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0, 0, 500, 500);
        add(i2);
        l = new JLabel("LANGUAGE");
        l.setBounds(70, 50, 100, 50);
        l.setFont(new Font("Tahoma", Font.PLAIN, 20));
        i2.add(l);
        n = new JLabel("NOTIFICATIONS");
        n.setBounds(70, 150, 150, 50);
        n.setFont(new Font("Tahoma", Font.PLAIN, 20));
        i2.add(n);
        hc = new JLabel("HELP CENTER");
        hc.setBounds(70, 250, 130, 50);
        hc.setFont(new Font("Tahoma", Font.PLAIN, 20));
        i2.add(hc);
        a = new JLabel("ABOUT");
        a.setBounds(70, 350, 100, 50);
        a.setFont(new Font("Tahoma", Font.PLAIN, 20));
        i2.add(a);

        noti = new ButtonGroup();
        on = new JRadioButton("ON");
        on.setBounds(250, 160, 70, 30);
        noti.add(on);
        i2.add(on);
        off = new JRadioButton("OFF");
        off.setBounds(330, 160, 70, 30);
        noti.add(off);
        i2.add(off);

        lan = new ButtonGroup();
        e = new JRadioButton("ENGLISH");
        e.setBounds(200,60,85,30);
        lan.add(e);
        i2.add(e);
        h = new JRadioButton("HINDI");
        h.setBounds(300,60,85,30);
        lan.add(h);
        i2.add(h);
        m = new JRadioButton("MARATHI");
        m.setBounds(400,60,85,30);
        lan.add(m);
        i2.add(m);

        e.setSelected(true);
        off.setSelected(true);

        hc1 = new JButton("CLICK");
        hc1.setBounds(250, 250, 100, 50);
        hc1.addActionListener(this);
        hc1.setBackground(Color.white);
        i2.add(hc1);
        a1 = new JButton("CLICK");
        a1.setBounds(250, 350, 100, 50);
        a1.addActionListener(this);
        a1.setBackground(Color.white);
        i2.add(a1);
        b= new JButton("BACK");
        b.setBounds(370,400,100,50);
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
        else if (a.getSource()==hc1){
            new helpcenter();
            this.setVisible(false);
        }
        else if(a.getSource()==a1){
            new about();
            this.setVisible(false);
        }
    }

public static void main(String[] args){
        new settings();
}
}
