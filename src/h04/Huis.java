package h04;

import java.applet.Applet;
import java.awt.*;

public class Huis extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
        g.drawRect(100,80,200,200); //vierkant
        g.drawRect(110, 130, 50, 50); //linker raam
        g.drawRect(240, 130, 50, 50); //rechter raam
        g.drawRect(190, 200, 30, 70); //deur

    }
}
