package h11;

import java.applet.Applet;
import java.awt.*;

public class o7 extends Applet{
    int count,w,h, teller,x,y;
    public void init() {
        count = 50;
        y = 100;
        x = 100;
        w = 20;
        h = 20;

    }


    @Override
    public void paint(Graphics g) {
        for (teller = 1; teller <= count; teller++) {
            w+= 10;
            h+=10;
            x-=5;
            y-=5;
            g.drawOval(x,y,w,h);
        }


    }}