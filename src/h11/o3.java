package h11;

import java.applet.Applet;
import java.awt.*;

public class o3 extends Applet{
    int n1,n2,n3,x,count,i;
    public void init() {
        n1 = 1;
        n2 = 1;
        count = 10;
        x = 40;
    }


    @Override
    public void paint(Graphics g) {
    g.drawString(+n1+ "",20,80);
        g.drawString(+n2+ "",x,80);
        for (i=2; i < count; i++){
            x+=20;
            n3 = n1+ n2;
            g.drawString(+n3+ "",x,80);
            n1 = n2;
            n2 = n3;
        }
    }

}