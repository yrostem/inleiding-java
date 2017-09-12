package h06;
import java.awt.*;
import java.applet.*;

public class Praktijk extends Applet{
    double a,b,c,gemiddelde,resultaat;

    public void init(){
        a=5.9;
        b=6.3;
        c=6.9;
        gemiddelde = (a+b+c) / 3;
        resultaat = (int) (gemiddelde * 10);
        resultaat = resultaat/10;
    }
    public void paint(Graphics g){
        g.drawString("gemiddelde:"+resultaat, 50,10);
    }
}
