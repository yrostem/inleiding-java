package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rekenmachine extends Applet {
    TextField tv1, tv2;
    Button plusknop, minKnop, keerKnop, deelKnop;
    @Override
    public void init() {
        setSize(500, 400);
        tv1 = new TextField(4);
        tv2 = new TextField(4);

        plusknop = new Button("+");
        minKnop = new Button("-");
        keerKnop = new Button("X");
        deelKnop = new Button("/");

        plusknop.addActionListener(new PlusKnopListener());
        minKnop.addActionListener(new MinKnopListener());
        keerKnop.addActionListener(new KeerKnopListener());
        deelKnop.addActionListener(new DeelKnopListener());



        add(tv1);
        add(tv2);
        add(plusknop);
        add(minKnop);
        add(keerKnop);
        add(deelKnop);
    }

    class PlusKnopListener implements ActionListener	{

        @Override
        public void actionPerformed(ActionEvent e) {
            String invoer1 = tv1.getText();
            String invoer2 = tv2.getText();
            double Vak1 = Double.parseDouble(invoer1);
            double Vak2 = Double.parseDouble(invoer2);
            double uitkomst = Vak1 + Vak2;
            tv1.setText(String.valueOf(uitkomst));
            tv2.setText(" ");

        }
    }class MinKnopListener implements ActionListener	{

        @Override
        public void actionPerformed(ActionEvent e) {
            String invoer1 = tv1.getText();
            String invoer2 = tv2.getText();
            double Vak1 = Double.parseDouble(invoer1);
            double Vak2 = Double.parseDouble(invoer2);
            double uitkomst = Vak1 - Vak2;
            tv1.setText(String.valueOf(uitkomst));
            tv2.setText(" ");

        }
    }class KeerKnopListener implements ActionListener	{

        @Override
        public void actionPerformed(ActionEvent e) {
            String invoer1 = tv1.getText();
            String invoer2 = tv2.getText();
            double Vak1 = Double.parseDouble(invoer1);
            double Vak2 = Double.parseDouble(invoer2);
            double uitkomst = Vak1 * Vak2;
            tv1.setText(String.valueOf(uitkomst));
            tv2.setText(" ");

        }
    }class DeelKnopListener implements ActionListener	{

        @Override
        public void actionPerformed(ActionEvent e) {
            String invoer1 = tv1.getText();
            String invoer2 = tv2.getText();
            double Vak1 = Double.parseDouble(invoer1);
            double Vak2 = Double.parseDouble(invoer2);
            double uitkomst = Vak1 / Vak2;
            tv1.setText(String.valueOf(uitkomst));
            tv2.setText(" ");

        }
    }

}
