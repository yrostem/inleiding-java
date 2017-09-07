package h04;
import java.applet.Applet;
import java.awt.*;

public class Vlag extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillRect(150,150, 10, 130);//stok
        g.setColor(Color.RED);
        g.fillRect(160,150, 50, 20);//rood
        g.setColor(Color.WHITE);
        g.fillRect(160,180, 50, 20);//wit
        g.setColor(Color.blue);
        g.fillRect(160,190, 50, 20);//blauw

    }
}
