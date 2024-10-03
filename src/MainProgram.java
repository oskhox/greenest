import java.util.*;

public class MainProgram {
    boolean continueAsking = true;

    //konstruktor
    public MainProgram() {
        ArrayList<Plants> plants = new ArrayList<>();
        plants.add(new Cactus("kaktus", "Igge"));
        plants.add(new Palm("palm", "Laura", 5.0));
        plants.add(new CarnPlant("köttätande växt", "Meatloaf", 0.7));
        plants.add(new Palm("palm", "Olof", 1.0));

        Scanner input = new Scanner(System.in);

        while (continueAsking) {
            System.out.println("Vad är namnet på växten som du vill vattna?");
            String userInput = input.nextLine();
            if (checkIfEmpty(userInput))
                continue;

            //letar efter matchning i arrayen med växtobjekten
            boolean foundPlant = false;
            for (Plants plant : plants) {
                if (userInput.equalsIgnoreCase(plant.getPlantName())) {
                    System.out.println(plant);
                    foundPlant = true;
                    continueAsking = false;
                    break;
                }
            }
            if (!foundPlant) {
                System.out.println("Det du skrev in matchade ingen växt. Pröva igen.");
            }
        }
        input.close();
    }

    //metod som kontrollerar input
    public static boolean checkIfEmpty(String input) {
        if (input.trim().isEmpty()) {
            System.out.println("Du skrev inte in något alls eller bara mellanslag. Pröva igen.");
            return true;
        }
        return false;
    }

    //main-metod
    public static void main(String[] args) {
        new MainProgram();
    }
}