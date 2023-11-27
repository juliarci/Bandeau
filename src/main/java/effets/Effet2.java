package effets;

import bandeau.Bandeau;

public class Effet2{
    private double rotation;
    private String mot;

    public Effet2(){
        this.rotation = 50;
        this.mot = "Bonjour";
    }

    public void afficheEffet2(Bandeau bandeau) {
        String variableMot="";
        for (int i = 0; i < mot.length(); i++) {
            bandeau.setRotation(rotation + 5 * i);
            variableMot= variableMot + String.valueOf(mot.charAt(i));
            bandeau.setMessage(variableMot);
            bandeau.sleep(1000 - 100 * i);
        }
    }
}
