package h12;
import java.awt.*;
import java.applet.Applet;

public class Opdr2 extends Applet{
    public void init () {

       for (int i = 0; i < 25; i++){
           Button knop = new Button("knop " + (i + 1));
           add(knop);
       }
    }

    @Override
    public void paint(Graphics g) {

    }
}


