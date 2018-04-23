package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr4 extends Applet {
    boolean gevonden;
    int[] salaris = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int getal;
    int teller;
    int invoer;
    TextField textField;
    Button button;

    public void init() {
        textField = new TextField();
        add(textField);
        button = new Button("Ok");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                invoer = Integer.parseInt(textField.getText());
                gevonden = false;
                int i = 0;
                while (i < salaris.length) {
                    if (salaris[i] == invoer) {
                        gevonden = true;
                    }
                    i++;
                }
                repaint();
            }
        });
        add(button);
    }

    public void paint(Graphics g) {
        if (invoer != 0) {
            int x1 = 50;
            int x2 = 150;
            int y = 70;
            if (gevonden) {
                g.drawString("De waarde = " + invoer + "  De index = " + invoer, x1, y);
                y += 20;

            } else {
                g.drawString("De waarde is niet gevonden.", x2, y);
            }
        }
    }
}