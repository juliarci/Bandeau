package effets;

import bandeau.Bandeau;

import java.awt.*;

public class Effet2 extends Effet {
    private double rotation;
    private String mot;

    public Effet2(){
        this.rotation = 50;
        this.mot = "Bonjour";
    }

    public void afficheEffet(Bandeau bandeau) {
        bandeau.setBackground(Color.getHSBColor(101, 120, 180));
        for (int i = 0; i < mot.length()+2; i++) {
            bandeau.setRotation(rotation*50*i);
            bandeau.setMessage(mot);
            bandeau.sleep(1000 - 100 * i);
        }
    }
}
