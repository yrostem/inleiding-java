package toets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10 extends Applet{

    private int x=20, y=50;
    private TextField tv1 = new TextField(10);
    private Button toon = new Button("Toon tijden");
    private int londonTijd ;
    private int tokyoTijd ;
    private int sidneyTijd;
    private int newyorkTijd;
    private int invoer;

    public class toonKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            invoer = Integer.parseInt(tv1.getText());
            londonTijd = (invoer - 1);
            tokyoTijd = (invoer + 7 );
            sidneyTijd = (invoer + 9);
            newyorkTijd = (invoer - 6);


            repaint();
        }

    }
    public void init() {
        setSize(400,400);
        toon.addActionListener(new toonKnopListener());
        add(tv1);
        add(toon);
    }

    @Override
    public void paint(Graphics g) {
        if (newyorkTijd < 0) {
            newyorkTijd = (newyorkTijd + 24);
        }
        if(tokyoTijd > 24){
            tokyoTijd = (tokyoTijd -24);
        }
        if (sidneyTijd > 24){
            sidneyTijd = (sidneyTijd -24);
        }
        if (invoer >= 0 && invoer <= 24){
            x = 20;
            y = 50;
            getGraphics().drawString("Tijd in London:"+ londonTijd + ":00 uur",x,y);
            y += 20;
            getGraphics().drawString("Tijd in Tokyo:"+tokyoTijd+ ":00 uur",x,y);
            y += 20;
            getGraphics().drawString("Tijd in New York:"+newyorkTijd+ ":00 uur",x,y);
            y += 20;
            getGraphics().drawString("Tijd in Sidney:"+sidneyTijd+ ":00 uur",x,y);
        }
        else{
            getGraphics().drawString("Ongeldig invoer",x,y);
        }
    }
}
