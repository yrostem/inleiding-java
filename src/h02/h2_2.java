package h02;/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek

import java.applet.Applet;
import java.awt.*;

//een klasse met de naam Show van het type Applet
public class h2_2 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.WHITE);
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Yad", 50, 60 );
        g.setColor(Color.RED);
        g.drawString("Rostem", 50, 80 );
    }

}