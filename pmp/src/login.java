import org.python.util.PythonInterpreter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class login extends JFrame implements ActionListener {
    JLabel l1, l2;
    JTextField username;
    JButton s, c;
    JPasswordField password;
    login() {
        setSize(600, 400);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/login.jpg"));
        Image i3 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0, 0, 600, 400);
        add(i2);
        l1 = new JLabel("Username:- ");
        l1.setBounds(200, 100, 120, 40);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
        i2.add(l1);
        l2 = new JLabel("Password:- ");
        l2.setBounds(200, 160, 120, 40);
        l2.setFont(new Font("SERIF", Font.BOLD, 20));
        i2.add(l2);
        username = new JTextField();
        username.setBounds(350, 100, 150, 40);
        i2.add(username);
        password = new JPasswordField();
        password.setBounds(350, 160, 150, 40);
        i2.add(password);
        s = new JButton("SignIn");
        s.setBounds(200, 250, 140, 50);
        s.addActionListener(this);
        i2.add(s);
        c = new JButton("Cancel");
        c.setBounds(360, 250, 140, 50);
        c.addActionListener(this);
        i2.add(c);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
        username.setText("admin");
        password.setText("admin");
    }
    public static void main(String[] args) {
        new login();
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == s) {
            JOptionPane.showMessageDialog(null, "Login Successful!!!");
            PythonInterpreter pythonInterpreter = new PythonInterpreter();
            //pythonInterpreter.exec("C:\\Users\\Rishabh\\IdeaProjects\\pmp\\src\\hello.py");
            pythonInterpreter.execfile("C:\\Users\\Rishabh\\IdeaProjects\\pmp\\src\\hello.py");
            new home();
            this.setVisible(false);
        } else if (ae.getSource() == c) {
            new main().setVisible(true);//going back to homepage
            this.setVisible(false);
        }
    }
}