package h04;

import java.applet.Applet;
import java.awt.*;

public class Driehoek extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(50, 50, 10, 40);
        g.drawLine(50, 120, 270, 120);
    }
}