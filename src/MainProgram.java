import java.util.*;

public class MainProgram {
    //inkapsling
    final String p = "palm";
    final String kv = "köttätande växt";
    final String ka = "kaktus";
    final String ask = "Vilken växt ska få vätska?";
    Boolean continueAsking = true;

    Scanner input = new Scanner(System.in);

    //konstruktor som tillsammans med main-metoden bryter den statiska kontexten
    public MainProgram() {

        //enbart för test, att den skriver ut objekten korrekt
        Palm laura = new Palm("Palm", "Laura", "vatten", "liter", 1);
        System.out.println(laura);
        CarnPlant sven = new CarnPlant("Köttätande växt", "Sven", "mineraldryck", "cl", 3);
        System.out.println(sven);
        Cactus nisse = new Cactus("Kaktus", "Nisse", "vatten", "dl", 2);
        System.out.println(nisse);

        //while loop, terminalapp som fortsätter fråga
        while (continueAsking) {
            System.out.println(ask);
            String userInput = (input.nextLine());

            if (!checkInput(userInput)) {
                continue; //om ogiltig, hoppas till nästa iteration av loopen
            }

            switch (userInput) { //fast gör ej hårdkodad
                case p -> {
                    System.out.println("Det blev palm");
                    continueAsking = false;
                }
                case kv -> {
                    System.out.println("Det blev köttätande");
                    continueAsking = false;
                }
                case ka -> {
                    System.out.println("Det blev kaktus");
                    continueAsking = false;
                }
                default -> System.out.println("Det du skrev in matchade ingen växt. Pröva igen");
            }
        }
    }

    //hjälpmetod för att kolla input, skicka tillbaks in i switch case
    public static Boolean checkInput(String input) {
        if (input.trim().isEmpty()) {
            System.out.println("Du skrev inte in något alls eller bara mellanslag. Pröva igen.");
            return false;
        } else
            return true;
    }

    //main-metod som tillsammans med konstruktorn bryter den statiska kontexten
    public static void main(String[] args) {
        MainProgram m = new MainProgram();
    }
}

//INTERFACE:
//en interface metod som beräknar mängden vätska som sen implementeras olika i alla instansieringar av interfacet. Hade kunnat vara i subklass med.
//sen switch-case som matchar och i sin tur skapar objekt av respektive subklass. Få in enums sen här.

//ENUMS:
//gör enums i egen fil och bygg in i switch-case

//HÅRDKODNING:
//rensa på hårdkodning utifrån en bred definition, både namnet + utskrift i toString. Gör om. Alla strängar och siffror ska lagras i variabler, gör om brett

//rensa upp i getters och setters som inte används

