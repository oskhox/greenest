import java.util.*;

public class MainProgram {
    //inkapsling
    private final String p = "palm";
    private final String kv = "köttätande växt";
    private final String ka = "kaktus";
    private String ask = "Vilken växt ska få vätska?";
    private Boolean continueAsking = true;

    Scanner input = new Scanner(System.in);

    //konstruktor som tillsammans med main-metoden bryter den statiska kontexten
    public MainProgram() {
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

//ARV:
//separat fil med superklass växter. Superklass variabel växtnamn (tom standard), incheckad (ja standard)
//variabler görs till private och skriv kommentar att inkapslad
//superkonstruktor med växtnamn och incheckad. Getter och setters (se sen om någon blir grå), motivera getters och setters som inkapsling
//superklass-metod toString (växtnamn, incheckad) som alltid kommer skrivas över av subklassernas toString
//(men testa även denna enskilt)

//separata filer med subklasser kaktus, palm, köttätande växt. (Polymorfism genom arvet enbart dvs subklass-metoder)
//variabler namn, växttyp vätsketyp, (arv) int mängd = 0 (interface)
//skriv även här att variabler är private och kommentar att inkapslad
//konstruktor och getter och setters (se sen om någon blir grå), motivera getters och setters som inkapsling
//subkonstruktorn anropar superklassens konstruktor, nämn på redovisning oavsett
//(behövs inga getters och setters för variablerna i superklassen då de ärvs)
//subklassmetod toString i var och en som sedan kommenteras som polymorfism genom arv, bara denna skriver ut allt - ingen hårdkodning

//sen switch-case som matchar och i sin tur skapar objekt av respektive subklass. Få in enums sen här

//INTERFACE:
//en interface metod som beräknar mängden vätska som sen implementeras olika i alla instansieringar av interfacet. Hade kunnat vara i subklass med.

//HÅRDKODNING:
//tänk verkligen på ingen hårdkodning utifrån en bred definition, både namnet + utskrift i toString. Gör om.

//ENUMS:
//gör enums i egen fil och bygg in när allt annat är klart, med switch-case


