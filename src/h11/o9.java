package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;



public class o9 extends Applet {

    public void paint(Graphics g) {

        setBackground(Color.gray);

        int y;
        int x;
        int width = 20;
        int height = 20;

        y = 50;
        x = 50;

        for (int teller = 0; teller < 4; teller++) {

            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, width, height);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, width, height);
                }

                x += width;
            }

            x = 50;
            y += height;

            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, width, height);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, width, height);

                }

                x += width;
            }

            x = 50;
            y += height;

        }

    }

}
