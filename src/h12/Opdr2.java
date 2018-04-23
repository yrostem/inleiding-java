package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdr2 extends Applet {

    Button knop[];


    public void init() {
        knop = new Button [25];

        for (int teller = 0; teller < knop.length; teller ++) {
            Button b = new Button();
            knop[teller] = b;
            add(b);
        }
    }

    //public void paint(Graphics g) {
    //for (int teller = 0; teller < gemiddelde.length; teller ++) {
    //g.drawString("" + gemiddelde[teller], 50, 20 * teller + 20);
    //g.drawString("gemiddelde:" + uitkomst[teller], 90, 20* teller + 20);
    //}
    //}
}