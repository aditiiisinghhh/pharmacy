import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class showSale extends JFrame implements ActionListener {
    JTable t1;
    JButton bk;
    JScrollPane sp1;
    showSale(){
        setSize(800,700);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/showCust.jpg"));
        Image i3  = i1.getImage().getScaledInstance(800,700,Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0,0,800,700);
        add(i2);

        sp1 = new JScrollPane();
        sp1.setBounds(50,50,700,300);
        i2.add(sp1);
        bk = new JButton("BACK");
        bk.setBounds(600,450,140,70);
        bk.addActionListener(this);
        bk.setBackground(Color.white);
        i2.add(bk);

        t1 = new JTable();
        sp1.setViewportView(t1);

        conn c = new conn();
        try{
            String str = "select * from sale;";
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
            new sale();
            this.setVisible(false);
        }
    }
    public static void main(String[] args) {
        new showSale();
    }
}