import java.util.*;

public class MainProgram {
    //inkapsling
    final String ask = "Vilken växt ska få vätska?";
    Boolean continueAsking = true;

    //Växter som bor på hotellet
    Cactus igge = new Cactus("Kaktus", "Igge");
    Palm laura = new Palm("Palm", "Laura", 5.0);
    CarnPlant meatloaf = new CarnPlant("Köttätande växt", "Meatloaf", 0.7);
    Palm olof = new Palm("Palm", "Olof", 1.0);

    //konstruktor som tillsammans med main-metoden bryter den statiska kontexten
    public MainProgram() {
        Scanner input = new Scanner(System.in);

        //while loop, terminalapp som fortsätter fråga
        while (continueAsking) {
            System.out.println(ask);
            String userInput = (input.nextLine().toLowerCase());

            if (!checkInput(userInput)) {
                continue; //om ogiltig, hoppas till nästa iteration av loopen, annars fortsätter till switch case
            }

            switch (userInput) { //fast gör ej hårdkodad
                case "igge" -> {
                    System.out.println(igge);
                    continueAsking = false;
                }
                case "laura" -> {
                    System.out.println(laura);
                    continueAsking = false;
                }
                case "meatloaf" -> {
                    System.out.println(meatloaf);
                    continueAsking = false;
                }
                case "olof" -> {
                    System.out.println(olof);
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