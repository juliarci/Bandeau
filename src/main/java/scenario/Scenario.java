package scenario;

import bandeau.Bandeau;
import effets.*;
import java.util.ArrayList;

public class Scenario {
    private ArrayList<Effet> effets;

    public Scenario() {
        effets = new ArrayList<>();
    }

    public void addEffect(Effet effet) {
        effets.add(effet);
    }

    public void jouerScenario(Bandeau bandeau) {
        for (Effet effet : effets) {
            effet.afficheEffet(bandeau);
        }
    }

    public static void main(String[] args) {
        Bandeau bandeau = new Bandeau();
        Scenario scenario = new Scenario();
        scenario.addEffect(new Effet1());
        scenario.addEffect(new Effet2());
        scenario.addEffect(new Effet3());
        for (int i = 0; i <= 10; i++) {
            scenario.addEffect(new Effet4());
        }
        scenario.jouerScenario(bandeau);
    }
}
