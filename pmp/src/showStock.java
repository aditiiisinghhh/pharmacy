import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class showStock extends JFrame implements ActionListener {
    JTable t1;
    JButton bk,sr,r;
    JTextField s;
    JScrollPane sp1;
    conn c = new conn();
    showStock(){
        setSize(800,700);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/showCust.jpg"));
        Image i3  = i1.getImage().getScaledInstance(800,700,Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0,0,800,700);
        add(i2);
        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("images/refresh.png"));
        Image i7  = i5.getImage().getScaledInstance(35,35,Image.SCALE_SMOOTH);
        ImageIcon i8 = new ImageIcon(i7);

        sp1 = new JScrollPane();
        sp1.setBounds(50,100,700,300);
        i2.add(sp1);
        bk = new JButton("BACK");
        bk.setBounds(610,470,140,60);
        bk.addActionListener(this);
        bk.setBackground(Color.white);
        i2.add(bk);
        sr= new JButton("SEARCH");
        sr.setBounds(550,50,100,30);
        sr.addActionListener(this);
        sr.setBackground(Color.white);
        i2.add(sr);
        r = new JButton(i8);
        r.setBounds(710,400,40,40);
        r.addActionListener(this);
        r.setBackground(Color.white);
        i2.add(r);
        s = new JTextField();
        s.setBounds(50,50,500,30);
        i2.add(s);

        t1 = new JTable();
        sp1.setViewportView(t1);

        try{
            String str = "select * from stock;";
            ResultSet rs = c.s.executeQuery(str);
            t1.setModel(DbUtils.resultSetToTableModel(rs));

        }catch (Exception e){
            System.out.println(e);
        }

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent a){
        if(a.getSource()==bk){
            new stocks();
            this.setVisible(false);
        }
        else if(a.getSource()==sr){
            String search = this.s.getText();
            try{
                String show = "select * from stock where name='"+search+"' ;";
                ResultSet rs =c.s.executeQuery(show);
                t1.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception e){
                System.out.println(e);
            }
        }
        else if(a.getSource()==r){
            new showStock();
            this.setVisible(false);
        }
    }
    public static void main(String[] args) {
        new showStock();
    }
}