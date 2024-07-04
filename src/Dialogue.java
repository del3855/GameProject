import java.util.Map;
import java.util.Scanner;

public class Dialogue {
    private String text;
    private Map<String,String> options;
    private Scanner scanner = new Scanner(System.in);


    public Dialogue(String text, Map<String, String> options) {
        this.text = text;
        this.options = options;
    }

    @Override
    public String toString() {
        String resultat = text + " : " + "\n\r";
        for (Map.Entry<String, String>entry : options.entrySet() ) {
            resultat += formatEntry(entry);
        }
        return resultat;
    }

    private String formatEntry(Map.Entry<String, String> entry){
        return "- " + entry.getKey() + " : " + entry.getValue() + "\n\r";
    }

    public String afficherSelection() throws ChoixIncorrectDialogueException {
        System.out.println(this);
        String input = afficherInput();

        // convert
        if(!options.containsKey(input)){
            throw new ChoixIncorrectDialogueException("choix incorrect : " + input);
        }
        return options.get(input);
    }

    private String afficherInput(){
        System.out.print("> ");
        return scanner.next();
    }


}
