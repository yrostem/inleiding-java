package h04;

import java.applet.Applet;
import java.awt.*;
import java.awt.MouseInfo;


public class Driehoek extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        int xpoints[] = {5, 105, 25, 145, 25};
        int ypoints[] = {25, 25, 145, 145, 25};
        int npoints = 5;

        g.drawPolygon(xpoints, ypoints, npoints);
    }
}