package VidyutVitaranVibhag;


import javax.swing.*;

public class Splash extends JFrame implements  Runnable{
        Thread t = new Thread(this);
        Splash(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/Image1.png"));
        JLabel i2 = new JLabel(i1);
        add(i2);
        setSize(520,520);
        setVisible(true);
        setLocation(600,250);
        t.start();
    }

    public void run(){
        try {
            Thread.sleep(2000);
            setVisible(false);
    }
        catch(Exception e){
        e.printStackTrace();
        }
        new Login();
    }
    public static void main(String[] args) {
        new Splash();
    }
}
