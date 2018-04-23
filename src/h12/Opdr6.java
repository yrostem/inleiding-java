package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Opdr6 extends Applet {

    TextField textField;
    Button button;
    int[] getallen = {5, 5, 6, 7, 7, 8, 9, 9, 9};
    int input;
    int aantal;
    boolean geklikt;

    @Override
    public void init() {
        textField =  new TextField(6);
        add(textField);
        button = new Button("ok");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aantal = 0;
                geklikt = true;
                input = Integer.parseInt(textField.getText());



                for (int i = 0; i < getallen.length; i++) {
                    int getal = getallen[i];
                    if (getal == input) {
                        aantal++;
                    }
                }
                repaint();
            }
        });
        add(button);
    }

    @Override
    public void paint(Graphics g) {
        if (geklikt) {
            g.drawString("Waarde " + input + " komt " + aantal + " voor", 50, 70);
        }
    }
}