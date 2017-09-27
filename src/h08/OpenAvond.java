import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class OpenAvond extends Applet {
    int manAantal;
    int vrouwAantal;
    int manLlAantal;
    int vrouwLlAantal;
    int  totaal = manAantal + vrouwAantal + manLlAantal + vrouwLlAantal;
    Button m,v,ml,vl;

    public void init() {
        setSize(500,400);
        m = new Button("Man");
        v = new Button("Vrouw");
        ml = new Button("Man Leerling");
        vl = new Button("Vrouw Leerling");

        add(m);
        add(v);
        add(ml);
        add(vl);

        m.addActionListener( new manListener() );
        v.addActionListener( new vrouwListener() );
        ml.addActionListener( new manllListener() );
        vl.addActionListener( new vrouwllListener() );

    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Aantal mannen:" + manAantal, 100, 100);
        g.drawString("Aantal vrouwen: " + vrouwAantal, 100, 130);
        g.drawString("Aantal man leerlingen:" + manLlAantal, 100, 160);
        g.drawString("Aantal vrouw leerlingen:" +  vrouwLlAantal, 100, 190);
        g.drawString("Totaal: " + totaal,  100, 220);
    }

    class manListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
          manAantal ++;
          totaal++;
            repaint();
        }
    }
    class vrouwListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            vrouwAantal ++;
            totaal++;
            repaint();
        }
    }
    class manllListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
           manLlAantal ++;
           totaal++;
            repaint();
        }
    }
    class vrouwllListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            vrouwLlAantal ++;
            totaal++;
            repaint();
        }
    }

}