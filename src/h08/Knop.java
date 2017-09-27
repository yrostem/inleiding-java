import org.w3c.dom.Text;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Knop extends Applet {
    TextField tekstvak;
    Button knop;
    Button knop2;
    String schermtekst;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        knop2 = new Button("Reset");
        knop.addActionListener( new KnopListener() );
        knop2.addActionListener( new ResetKnopListener() );
        add(tekstvak);
        add(knop);
        add(knop2);
    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50,100);
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            schermtekst = tekstvak.getText();
            repaint();
            tekstvak.setText("");
        }
    }

    class ResetKnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText(" ");
        }
    }


}