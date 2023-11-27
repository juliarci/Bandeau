package effets;

import bandeau.Bandeau;

import java.awt.*;

public class Effet1 {
    private Font font;

    public Effet1() {
        this.font = new Font("ROMAN_BASELINE Bold", Font.ITALIC, 40);
    }

    public void afficheEffet1(Bandeau bandeau) {
        bandeau.setFont(font);
        bandeau.setBackground(Color.getHSBColor(101, 120, 180));
        bandeau.setMessage("H");
        bandeau.sleep(1000);
        bandeau.setMessage("HE");
        bandeau.sleep(1000);
        bandeau.setMessage("HEL");
        bandeau.sleep(1000);
        bandeau.setMessage("HELL");
        bandeau.sleep(1000);
        bandeau.setMessage("HELLO");
        bandeau.sleep(1000);
    }
}

