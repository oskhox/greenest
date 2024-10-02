import java.util.*;

public class MainProgram {
    boolean continueAsking = true;

    public MainProgram() {
        Scanner input = new Scanner(System.in);

        Cactus igge = new Cactus("kaktus", "Igge");
        Palm laura = new Palm("palm", "Laura", 5.0);
        CarnPlant meatloaf = new CarnPlant("köttätande växt", "Meatloaf", 0.7);
        Palm olof = new Palm("palm", "Olof", 1.0);

        while (continueAsking) {
            System.out.println("Vad är namnet på växten som du vill vattna?");
            String userInput = (input.nextLine().toLowerCase());

            if (!checkIfEmpty(userInput)) {
                continue; //om tom, hoppas till nästa iteration av loopen, annars fortsätter till switch case
            }

            switch (userInput) {
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
        input.close();
    }

    public static boolean checkIfEmpty(String input) {
        if (input.trim().isEmpty()) {
            System.out.println("Du skrev inte in något alls eller bara mellanslag. Pröva igen.");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        new MainProgram();
    }
}