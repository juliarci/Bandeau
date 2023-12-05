package effets;

import bandeau.Bandeau;

import java.awt.*;

public class Effet3 extends Effet {
    private int nbrCligne;
    private String mot;
    private Font font;
    public Effet3() {
        this.nbrCligne = 4;
        this.mot = "Holà";
        this.font=new Font("ROMAN_BASELINE Bold", Font.BOLD, 40);
    }

    public void afficheEffet(Bandeau bandeau){
        bandeau.setRotation(0);
        bandeau.setFont(font);
        for (int i=0; i <=nbrCligne; i++){
            bandeau.setBackground(Color.getHSBColor(80,117,255-50*i));
            bandeau.setForeground(Color.getHSBColor(160,117+80*i,255));
            bandeau.setMessage(mot);
            bandeau.sleep(1000);
        }

    }
}
