import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

public class showDetails extends JFrame implements ActionListener {
    JTable t1;
    JButton bk,sl,r;
    JScrollPane sp1;
    int row;
    public static String name;

    showDetails(){
        setSize(800,700);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/showCust.jpg"));
        Image i3  = i1.getImage().getScaledInstance(800,700,Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0,0,800,700);
        add(i2);

        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("images/refresh.png"));
        Image i7  = i5.getImage().getScaledInstance(45,45,Image.SCALE_SMOOTH);
        ImageIcon i8 = new ImageIcon(i7);

        t1 = new JTable();
        sp1 = new JScrollPane();
        sp1.setViewportView(t1);
        sp1.setBounds(50,50,700,300);
        i2.add(sp1);

        bk = new JButton("BACK");
        bk.setBounds(610,450,140,70);
        bk.addActionListener(this);
        i2.add(bk);
        bk.setBackground(Color.white);

        sl = new JButton("SELECT");
        sl.setBounds(50,450,140,70);
        sl.addActionListener(this);
        i2.add(sl);
        sl.setBackground(Color.white);

        r = new JButton(i8);
        r.setBounds(700,370,50,50);
        r.addActionListener(this);
        r.setBackground(Color.white);
        i2.add(r);

        t1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                row = t1.getSelectedRow();
                name = t1.getModel().getValueAt(row, 0).toString();
                System.out.println(name);
            }
        });

        conn c = new conn();
        try{
            String str1 = "select * from data; ";
            ResultSet rs1 = c.s.executeQuery(str1);
            t1.setModel(DbUtils.resultSetToTableModel(rs1));
        }catch (Exception e){
            System.out.println(e);
        }

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent a){
           if(a.getSource()==bk){
                  new customer();
                  this.setVisible(false);
              }
           else if(a.getSource()==sl){
               conn c = new conn();
               try{
                   String str = "select * from sale where name = '"+name+"';";
                   ResultSet rs = c.s.executeQuery(str);
                   t1.setModel(DbUtils.resultSetToTableModel(rs));
               }catch (Exception e){
                   System.out.println(e);
               }
           }
           else if(a.getSource()==r){
            new showDetails();
            this.setVisible(false);
        }
          }

    public static void main(String[] args) {
        new showDetails();

    }
}
