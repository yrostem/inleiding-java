import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Btw extends Applet {
    TextField tekstveld;
    Button knop;
    Label text;

    public void init() {
        setSize(500,400);
        text = new Label("Typ het bedrag in" );
        tekstveld = new TextField("", 30);
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        add(text);
        add(tekstveld);
        add(knop);
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String resultaat = tekstveld.getText();
            double bedragexBtw = Double.parseDouble(resultaat);
            double bedragInBtw = Double.parseDouble(String.valueOf(bedragexBtw * 1.21));
            tekstveld.setText(String.valueOf(bedragInBtw));
        }
    }
    class EnterListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String resultaat = tekstveld.getText();
            double bedragexBtw = Double.parseDouble(resultaat);
            double bedragInBtw = Double.parseDouble(String.valueOf(bedragexBtw * 1.21));
            tekstveld.setText(String.valueOf(bedragInBtw));
        }
    }

}