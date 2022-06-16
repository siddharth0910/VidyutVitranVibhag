package VidyutVitaranVibhag;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

  JButton login, cancel, signup;
  JTextField username,password;
  Choice loggingIn;

    Login(){
        super("Login Page");
      new ImageIcon();

        setLayout(null);


        JLabel uname = new JLabel("Username");
        uname.setBounds(300,20,100,20);
        add(uname);
//Creating Input for username
        username = new JTextField();
        username.setBounds(400,20,150,20);
        add(username);

       JLabel pass = new JLabel("Password");
        pass.setBounds(300,60,100,20);
        add(pass);
//Creating input for password
        password = new JTextField();
        password.setBounds(400,60,150,20);
        add(password);
//creating dropdown for selecting admin/customer
       JLabel loginAs = new JLabel("Login as");
        loginAs.setBounds(300,100,100,20);
        add(loginAs);

         loggingIn= new Choice();
        loggingIn.add("Admin");
        loggingIn.add("Customer");
        loggingIn.setBounds(400,100,150,20);
        add(loggingIn);

        // creating Buttons
        login = new JButton("Login");
        login.setBounds(330,160,100,20);
        login.addActionListener(this);
        add( login);

        cancel = new JButton("Cancel");
        cancel.setBounds(390,200,100,20);
        cancel.addActionListener(this);
        add(cancel);

        signup = new JButton("Signup");
        signup.setBounds(450,160,100,20);
        signup.addActionListener(this);
        add(signup);

        setSize(640,300);
        setLocation(400,200);
        setVisible(true);




    }

  @Override
  public void actionPerformed(ActionEvent e) {
      if(e.getSource()== login){}

      else if (e.getSource() == cancel){setVisible(false);}

      else if (e.getSource() == signup){
        new Signup();
      }


  }

  public static void main(String[] args) {
        new Login();
    }
}
