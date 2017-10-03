package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class o_05 extends Applet{
    TextField tv1;
    Button knop;
    double invoer;
    String uitslag;

    public void init() {
        tv1 = new TextField(20);
        knop = new Button("Ok");

       knop.addActionListener( new knopListener());

        add(tv1);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("Uw cijfer is " + uitslag, 20,50);
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invoer = Double.parseDouble(tv1.getText());
            if(invoer>= 5.5 && invoer <= 10.0 ){
                uitslag = "Geslaagd";
            }else{
                uitslag = "Gezakt";
            }
            repaint();
        }
    }
}