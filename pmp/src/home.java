import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class home extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
   int x=120;
    home(){
        setSize(800,800);
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("images/home.jpg"));
        Image ii3  = ii1.getImage().getScaledInstance(900,800,Image.SCALE_SMOOTH);
        ImageIcon ii4 = new ImageIcon(ii3);
        JLabel ii2 = new JLabel(ii4);
        ii2.setBounds(-100,0,900,800);
        add(ii2);
        ImageIcon ii5 = new ImageIcon(ClassLoader.getSystemResource("images/logoo.png"));
        Image ii7  = ii5.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ImageIcon ii8 = new ImageIcon(ii7);
        JLabel ii6 = new JLabel(ii8);
        ii6.setBounds(720,55,x,x);
        ii2.add(ii6);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/settings.jpg"));
        Image i3  = i1.getImage().getScaledInstance(130,130,Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0,0,x,x);


        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("images/out.png"));
        Image i7  = i5.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ImageIcon i8 = new ImageIcon(i7);
        JLabel i6 = new JLabel(i8);
        i6.setBounds(0,0,x,x);

        ImageIcon i9 = new ImageIcon(ClassLoader.getSystemResource("images/analytics.png"));
        Image i11  = i9.getImage().getScaledInstance(110,110,Image.SCALE_SMOOTH);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel i10 = new JLabel(i12);
        i10.setBounds(0,0,x,x);

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("images/group.png"));
        Image i15  = i13.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ImageIcon i16 = new ImageIcon(i15);
        JLabel i14 = new JLabel(i16);
        i14.setBounds(0,0,x,x);

        ImageIcon i17 = new ImageIcon(ClassLoader.getSystemResource("images/stock.jpg"));
        Image i19  = i17.getImage().getScaledInstance(120,120,Image.SCALE_SMOOTH);
        ImageIcon i20 = new ImageIcon(i19);
        JLabel i18 = new JLabel(i20);
        i18.setBounds(0,0,x,x);

        ImageIcon i21 = new ImageIcon(ClassLoader.getSystemResource("images/sales.png"));
        Image i23  = i21.getImage().getScaledInstance(120,100,Image.SCALE_SMOOTH);
        ImageIcon i24 = new ImageIcon(i23);
        JLabel i22 = new JLabel(i24);
        i22.setBounds(0,0,x,x);

        b6=new JButton(i24);
        b6.setBounds(530,440,x,x);
        b6.setBackground(Color.white);
        b6.addActionListener(this);
        ii2.add(b6);
        b5=new JButton(i20);
        b5.setBounds(360,440,x,x);
        b5.setBackground(Color.white);
        b5.addActionListener(this);
        ii2.add(b5);
        b1=new JButton(i4);
        b1.setBounds(360,250,x,x);
        b1.setBackground(Color.white);
        b1.addActionListener(this);
        ii2.add(b1);
        b3=new JButton(i12);
        b3.setBounds(530,250,x,x);
        b3.setBackground(Color.white);
        b3.addActionListener(this);
        ii2.add(b3);
        b2=new JButton(i8);
        b2.setBounds(700,250,x,x);
        b2.setBackground(Color.white);
        ii2.add(b2);
        b2.addActionListener(this);
        b4=new JButton(i16);
        b4.setBounds(700,440,x,x);
        ii2.add(b4);
        b4.setBackground(Color.white);
        b4.addActionListener(this);

        l1 = new JLabel("CARE POINT ");
        l1.setBounds(300,60,550,100);
        l1.setFont(new Font("SERIF", Font.ITALIC, 70));
        ii2.add(l1);
        l11 = new JLabel("__________ ");
        l11.setBounds(300,65,550,100);
        l11.setFont(new Font("Script", Font.ITALIC, 70));
        ii2.add(l11);
        l2 = new JLabel("SETTINGS");
        l2.setBounds(360,365,150,50);
        l2.setFont(new Font("Serif", Font.ITALIC, 25));
        ii2.add(l2);
        l3 = new JLabel("ANALYTICS");
        l3.setBounds(525,365,150,50);
        l3.setFont(new Font("Serif", Font.ITALIC, 25));
        ii2.add(l3);
        l4 = new JLabel("SIGN OUT");
        l4.setBounds(702,365,150,50);
        l4.setFont(new Font("Serif", Font.ITALIC, 25));
        ii2.add(l4);
        l5 = new JLabel("CUSTOMERS");
        l5.setBounds(685,550,170,50);
        l5.setFont(new Font("Serif", Font.ITALIC, 25));
        ii2.add(l5);
        l6 = new JLabel("STOCKS");
        l6.setBounds(370,550,150,50);
        l6.setFont(new Font("Serif", Font.ITALIC, 25));
        ii2.add(l6);
        l7 = new JLabel("SALES");
        l7.setBounds(550,550,150,50);
        l7.setFont(new Font("Serif", Font.ITALIC, 25));
        ii2.add(l7);
        l8 = new JLabel("Pharmacists exist because society says  ");
        l8.setBounds(420,650,500,50);
        l8.setFont(new Font("Serif",Font.ITALIC,20));
        ii2.add(l8);
        l9 = new JLabel(" there needs to be someone in the health- ");
        l9.setBounds(450,680,500,50);
        l9.setFont(new Font("Serif",Font.ITALIC,20));
        ii2.add(l9);
        l10 = new JLabel(" care system to oversee the drug-use process!!");
        l10.setBounds(480,710,500,50);
        l10.setFont(new Font("Serif",Font.ITALIC,20));
        ii2.add(l10);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);


    }
    public void actionPerformed(ActionEvent a){
        if(a.getSource()==b4){
            new customer();
            this.setVisible(false);
        }
        else if(a.getSource()==b2){
            new main();
            this.setVisible(false);
        }
        else if(a.getSource()==b6){
            new sale();
            this.setVisible(false);
        }
        else if(a.getSource()==b5){
            new stocks();
            this.setVisible(false);
        }
        else if(a.getSource()==b1){
            new settings();
            this.setVisible(false);
        }
        else if(a.getSource()==b3){
            new analytics();
            this.setVisible(false);
        }
    }
    public static void main(String[] agrs){
        new home();
    }

}
