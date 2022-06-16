package VidyutVitaranVibhag;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup extends JFrame implements ActionListener {
    JButton back, create;
    JLabel username,name, pass, meter,createAccount;
    Choice signup;
    JTextField txtMeter,txtUsername, txtPass,txtName;

    Signup() {
        super("Signup");
        setLayout(null);createAccount = new JLabel("Create Account as - ");
        createAccount.setBounds(100,20, 150,20);
        add(createAccount);

         signup= new Choice();
        signup.add("Admin");
        signup.add("Customer");
        signup.setBounds(250,20,250,20);
        add(signup);

         username = new JLabel("Username - ");
        username.setBounds(100,60,150,20);
        add(username);

         txtUsername = new JTextField();
        txtUsername.setBounds(250, 60, 150,20);
        add(txtUsername);

         name  = new JLabel("Name -" );
        name.setBounds(100, 100, 150,20);
        add(name);

         txtName = new JTextField();
        txtName.setBounds(250,100,150,20);
        add(txtName);

         pass = new JLabel("Password - ");
        pass.setBounds(100,140,150,20);
        add(pass);

        txtPass = new JTextField();
        txtPass.setBounds(250, 140, 150,20);
        add(txtPass);

         meter = new JLabel("Meter no-");
        meter.setBounds(100,170,150,20);
        add(meter);

         txtMeter = new JTextField();
        txtMeter.setBounds(250,170,150,20);
        add(txtMeter);

        create = new JButton("Create");
        create.setBackground(Color.darkGray);
        create.setForeground(Color.white);
        create.addActionListener(this);
        create.setBounds( 120,250,150,20);
        add(create);

         back = new JButton("BAck");
        back.setBackground(Color.darkGray);
        back.setForeground(Color.white);
        back.addActionListener(this);
        back.setBounds( 290,250,150,20);
        add(back);


        setSize(700,400);
        setLocation(400,200);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==create){
            String atype = signup.getSelectedItem();
            String cusername = txtUsername.getText();
            String cname = txtName.getText();
            String cpass = txtPass.getText();
            String cmeter = txtMeter.getText();

            try{ config c = new config();
            String query = "Insert into login values('" + cmeter+"','"+cusername+"','"+cname+"','" +cpass+"','"+atype+"')";
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Account Created ...");
            setVisible(false);
            new Login();
            }
            catch(Exception v){
                v.printStackTrace();
            }

        }
        else if (e.getSource()== back){setVisible(false);
        new Login();}

    }

    public static void main(String[] args) {
        new Signup();
    }
}
