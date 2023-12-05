package effets;

import bandeau.Bandeau;

public class Effet4 extends Effet {
    private String mot;

    public Effet4() {
        this.mot = "Ciao";
    }

    public void afficheEffet(Bandeau bandeau ){
         bandeau.setMessage(mot);
         bandeau.sleep(100);
         bandeau.setMessage("");
         bandeau.sleep(100);
     }
}
