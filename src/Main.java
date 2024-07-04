import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        testSelectionDialogue();

    }

    private static void testSelectionDialogue(){
        Map<String, String> map = new HashMap<>();
        map.put("1", "Choix1");
        map.put("2", "Choix2");

        Dialogue dialogue = new Dialogue("Pour commencer l'aventure, choisissez un starter", map);
        try {
            System.out.println(dialogue.afficherSelection());
        } catch (ChoixIncorrectDialogueException e) {
            throw new RuntimeException(e);
        }
    }

    public static void testAffichageDialogue() {
        Map<String, String> map = new HashMap<>();

        map.put("1", "Bulbizarre");
        map.put("2", "Carapuce");

        Dialogue dialogue = new Dialogue("Pour commencer l'aventure, choisissez un starter", map);
        System.out.println(dialogue);
    }



}