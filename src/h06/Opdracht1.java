package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet{
    int salaris;
    double bedrag;

    public void init() {
        salaris = 113;
        bedrag = salaris / 4;
    }

    public void paint(Graphics g) {
        g.drawString("Jan €" + bedrag, 20,20);
        g.drawString("Ali €" + bedrag, 20,40);
        g.drawString("Jeannette €" + bedrag, 20,60);
        g.drawString("Ik €" + bedrag, 20,80);
        g.drawString("Er is €" + salaris+ " verdiend, gedeeld door 4 kom je uit op € " +bedrag, 20,110);


    }
}