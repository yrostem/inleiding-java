package h11;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class praktijk extends Applet {

    int getal;
    int teller;
    int teller2;
    int getal2;
    TextField tekstvak;
    Button knop1, knop2;
    Label label;
    String tekst1, tekst2;

    public void init() {
        tekstvak = new TextField("0", 5);
        knop1 = new Button("OK");
        knop2 = new Button("Tafels knop");
        knop1.addActionListener(new Knoplistener1());
        knop2.addActionListener(new Knoplistener2());
        tekst1 = "";
        tekst2 = "";
        label = new Label("Geef uw cijfer en druk op OK");
        add(label);
        add(tekstvak);
        add(knop1);
        add(knop2);
    }

    public void paint(Graphics g) {

        int y = 20;

        for (teller = 1; teller <= 10; teller++) {
            y += 20;

            tekst1 = ("" + teller + "*" + getal + "=" + (teller * getal));
            g.drawString(tekst1, 50, y);
        }

        g.drawString("Tafels:", 50, 240);

        for (teller2 = 1; teller2 <= 10; teller2++) {
            y += 20;

            tekst2 = ("" + teller2 + "*" + getal2 + "=" + (teller2 * getal2));
            g.drawString(tekst2, 50, y + 20);
        }
    }

    class Knoplistener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            s = tekstvak.getText();
            getal = Integer.parseInt(s);

            for (teller = 1; teller <= 10; teller++) {

                tekst1 = ("" + teller + "*" + getal + "=" + (teller * getal));
            }
            repaint();
        }
    }

    class Knoplistener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal2++;
            if (getal2 > 10) {
                getal2 = 1;
            }
            for (teller2 = 1; teller2 <= 10; teller2++) {
                tekst2 = ("" + teller2 + "*" + getal2 + "=" + (teller2 * getal2));
            }
            repaint();
        }
    }
}