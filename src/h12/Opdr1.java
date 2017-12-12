package h12;

import java.applet.Applet;

        import java.applet.Applet;
        import java.awt.*;
        import java.text.DecimalFormat;

        public class Opdr1 extends Applet {

            public void init() {
            }

            public void paint(Graphics g) {

                double[] nummers = {1, 4, 12, 23, 5, 22,7, 17, 77, 97};
                double avg;
                double midValue = 0;
                int xStart = 50;
                int yStart = 50;
                String displayValue;

                DecimalFormat df = new DecimalFormat("#");

                for (int i = 0; i < nummers.length; i++) {

                    displayValue = df.format(nummers[i]);
                    midValue = (midValue + nummers[i]);
                    avg = midValue / nummers.length;

                    g.drawString("Getal " + i + " in de array is " + displayValue, xStart, yStart);

                    if (i == 9) g.drawString("Het gemiddelde is " + avg, xStart, 270);

                    yStart += 20;
                }
            }

        }