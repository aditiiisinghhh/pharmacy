import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Format;
import java.text.SimpleDateFormat;

public class addDetails extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6;
    JTextField name, aadhar, contact;
    JButton submit, back;
    JRadioButton male, female;
    JDateChooser dob;
    ButtonGroup gen;
    Font fLabel = new Font("Tahoma", Font.PLAIN, 19);
    //size variables
    int labX = 120;
    int labH = 50;
    int labW = 100;
    int txtX = 250;
    int txth = 40;
    int txtW = 150;

    addDetails() {
        setSize(500, 600);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/details.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 600, Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0, 0, 500, 600);
        add(i2);

        l1 = new JLabel("Name");
        l1.setBounds(labX, 45, labW, labH);
        l1.setFont(fLabel);
        i2.add(l1);

        l2 = new JLabel("D.O.B");
        l2.setBounds(labX, 105, labW, labH);
        l2.setFont(fLabel);
        i2.add(l2);

        l3 = new JLabel("Gender");
        l3.setBounds(labX, 165, labW, labH);
        l3.setFont(fLabel);
        i2.add(l3);

        l4 = new JLabel("Aadhar");
        l4.setBounds(labX, 230, labW, labH);
        l4.setFont(fLabel);
        i2.add(l4);

        l5 = new JLabel("Contact");
        l5.setBounds(labX, 290, labW, labH);
        l5.setFont(fLabel);
        i2.add(l5);

        //textfields
        name = new JTextField();
        name.setBounds(txtX, 45, txtW, txth);
        i2.add(name);

        dob = new JDateChooser();
        dob.setBounds(txtX, 105, txtW, txth);
        i2.add(dob);

        aadhar = new JTextField();
        aadhar.setBounds(txtX, 240, txtW, txth);
        i2.add(aadhar);

        contact = new JTextField();
        contact.setBounds(txtX, 300, txtW, txth);
        i2.add(contact);

        //radiobuttons
        gen = new ButtonGroup();

        male = new JRadioButton("Male");
        male.setBounds(250, 170, 60, txth);
        gen.add(male);
        i2.add(male);

        female = new JRadioButton("Female");
        female.setBounds(330, 170, 70, txth);
        gen.add(female);
        i2.add(female);

        //button
        submit = new JButton("Submit");
        submit.setBounds(300, 450, 150, 60);
        submit.addActionListener(this);
        submit.setBackground(Color.white);
        i2.add(submit);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

        back = new JButton("BACK");
        back.setBounds(115, 450, 150, 60);
        back.addActionListener(this);
        back.setBackground(Color.white);
        i2.add(back);
    }

    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == back) {
            new customer();
            this.setVisible(false);
        } else if (a.getSource() == submit) {
            String name = this.name.getText();
            String aadhar = this.aadhar.getText();
            String contact = this.contact.getText();
            String gender = null;

            if (male.isSelected()) {
                gender = "Male";
            } else if (female.isSelected()) {
                gender = "Female";
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
            String dob = dateFormat.format(this.dob.getDate());

            conn c = new conn();
            try {
                String str = "insert into data (name, dob,gender,aadhar,contact) values ('" + name + "','" + dob + "','" + gender + "','" + aadhar + "','" + contact + "');";
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "Data is Successfully entered!!");
            } catch (Exception e) {
                System.out.println(e);
            }


        }
    }
    public static void main(String[] args) {
        new addDetails();
    }
    }
