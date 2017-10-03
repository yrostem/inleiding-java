package h11;

import java.applet.Applet;
import java.awt.*;

public class o_1 extends Applet{
    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {
        int teller;
        int x = 50;

        for (teller = 0; teller < 6; teller++) {
            x += 20;
            g.drawLine(x, 50, x, 150);
        }
    }
}
