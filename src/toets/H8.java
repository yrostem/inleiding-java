package toets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H8 extends Applet {
    private Button toon;
    private TextField valerieTxtVeld, jeroenTxtVeld, hansTxtVeld;
    private int valerieHeight, jeroenHeight, hansHeight;

    @Override
    public void init() {
        toon = new Button("Toon");
        valerieTxtVeld = new TextField(10);
        jeroenTxtVeld = new TextField(10);
        hansTxtVeld = new TextField(10);
        add(toon);
        add(valerieTxtVeld);
        add(jeroenTxtVeld);
        add(hansTxtVeld);
        toon.addActionListener(new toonKnopListener());
    }

    public class toonKnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            valerieHeight = Integer.parseInt(valerieTxtVeld.getText());
            jeroenHeight = Integer.parseInt(jeroenTxtVeld.getText());
            hansHeight = Integer.parseInt(hansTxtVeld.getText());
            repaint();
        }
    }


        @Override
        public void paint (Graphics g){
            toon.setLocation(600,5);
            valerieTxtVeld.setLocation(100,5);
            jeroenTxtVeld.setLocation(300,5);
            hansTxtVeld.setLocation(500,5);
            setSize(700, 500);
            g.drawLine(50, 50, 50, 200);
            g.drawLine(50, 200, 400, 200);

            g.drawString("20", 5 , 180);
            g.drawString("40", 5 , 160);
            g.drawString("60", 5 , 140);
            g.drawString("80", 5 , 120);
            g.drawString("100", 5 , 100);
            g.drawString("120", 5 , 80);

            g.drawString("--", 50,180);
            g.drawString("--", 50,160);
            g.drawString("--", 50,140);
            g.drawString("--", 50,120);
            g.drawString("--", 50,100);
            g.drawString("--", 50,80);

            g.drawString("Valerie",50,20);
            g.drawString("jeroen",230,20);
            g.drawString("hans",450,20);
            int valerieY = (200 - valerieHeight);
            int jeroenY = (200 - jeroenHeight);
            int hansY = (200 - hansHeight);
            g.setColor(Color.red);

            g.fillRect(120, valerieY,50, valerieHeight );

            g.drawString("Valerie", 120, 220);

            g.fillRect(220, jeroenY, 50, jeroenHeight);

            g.drawString("Jeroen", 220, 220);

            g.fillRect(320, hansY, 50, hansHeight);

            g.drawString("Hans", 320, 220);
        }
    }