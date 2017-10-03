package h11;

import java.applet.Applet;
import java.awt.*;

public class o_02 extends Applet{
    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {
        int teller;
        int x = 50;

        for (teller = 20; teller >= 10 ; teller--) {
            g.drawString(String.valueOf(+teller), x,10);
            x += 20;
        }
    }
}
