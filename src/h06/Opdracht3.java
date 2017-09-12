package h06;
import java.awt.*;
import java.applet.*;
public class Opdracht3 extends Applet {
    int a,b,uitkomst;
    public void init(){
        a = 2147483647;
        b = 1;
        uitkomst = a+b;
    }
    public void paint(Graphics g){
        g.drawString("Ints langer dan 2147483647 niet mogelijk, negatieve resultaat als gevolg.",20,50);
        g.drawString("resultaat:"+uitkomst,20,70);


    }
}
