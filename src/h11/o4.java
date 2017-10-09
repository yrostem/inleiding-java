package h11;

import java.applet.Applet;
import java.awt.*;

public class o4 extends Applet{
    int tafel, teller, count, antwoord, y;
    public void init() {
        tafel = 3;
        count = 10;
        int y = 20;

    }


    @Override
    public void paint(Graphics g) {
        for (teller = 1; teller <= count; teller++) {
            antwoord = teller * tafel;
            y+= 20;
            g.drawString(+antwoord+"", 20,y);
        }
        }

}