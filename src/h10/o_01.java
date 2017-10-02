import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class o_01 extends Applet {
    TextField tekstvak;
    Button knop;
    int invoer;
    int uitslag;
    public void init() {
        setSize(500,400);

        tekstvak = new TextField(10);
        knop = new Button("Bereken");

        add(tekstvak);
        add(knop);

        knop.addActionListener(new knoplistener());
    }



    public class knoplistener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Integer.parseInt(String.valueOf(invoer));
            invoer = Integer.parseInt(tekstvak.getText());
            if (invoer > uitslag ) {
                uitslag = invoer;
                repaint();
            }
            }
        }

    @Override
    public void paint(Graphics g) {
        g.drawString("Hoogste getal tot nu toe:" + uitslag, 100, 100);
    }

}