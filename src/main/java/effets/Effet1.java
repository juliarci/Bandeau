package effets;

import bandeau.Bandeau;

import javax.swing.*;
import java.awt.*;

public class Effet1 extends Effet {
    private Font font;
    private String mot;

    public Effet1() {

        this.font = new Font("ROMAN_BASELINE Bold", Font.ITALIC, 40);
        this.mot="HELLO";
    }

    public void afficheEffet(Bandeau bandeau) {
        bandeau.setFont(font);
        String variableMot="";
        bandeau.sleep(1000);
        for (int i = 0; i < mot.length(); i++) {
            variableMot= variableMot + String.valueOf(mot.charAt(i));
            bandeau.setForeground(Color.getHSBColor(50*i, 120+50*i, 180+25*i));
            bandeau.setMessage(variableMot);
            bandeau.sleep(1000);
        }
    }
}

