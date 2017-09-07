package h04;

import java.applet.Applet;
import java.awt.*;

public class Driehoek extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        ///gelijkbenige driehoek
        g.drawLine(100, 150, 200, 150); //Onderste lijn
        g.drawLine(100, 150, 150, 50); //Linker lijn
        g.drawLine(200, 150, 150, 50); //Rechter lijn
        ///Einde gelijkbenige driehoek

    }
}