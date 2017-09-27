package h06;
import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {
    int seconden,uur, dag, jaar;

    public void init(){
        seconden = 60;
        uur = seconden*60;
        dag = uur*24;
        jaar = dag*365;
    }
    public void paint(Graphics g){
        g.drawString("In een uur zitten: "+uur+" seconden",20,50);
        g.drawString("In een dag (24 uur) zitten: "+dag+" seconden",20,80);
        g.drawString("In een jaar (365 dgn) zitten: "+jaar+" seconden",20,110);
    }
}
