public class Cactus extends Plants {
    //inkapslad konstant utan default-värden
    private final String plantName;
    //inkapslade konstanter med default-värden
    private static final int DEFAULT_AMOUNT_LIQUID = 2;
    private static final String LIQUID_TYPE = "mineralvatten";
    private static final String LIQUID_MEASUREMENT = "cl";

    public Cactus(String plantType, String plantName) {
        super(plantType);
        this.plantName = plantName;
    }

    //getters och setters bidrar till inkapsling
    public String getPlantName() {
        return plantName;
    }

    public String getLiquidType() {
        return LIQUID_TYPE;
    }

    public int getAmountLiquid() {
        return DEFAULT_AMOUNT_LIQUID;
    }

    public String getLiquidMeasurement() {
        return LIQUID_MEASUREMENT;
    }

    //toString-metod i subklassen som metodöverskuggar superklassens toString-metod vilket är polymorfism genom arv
    @Override
    public String toString() {
        return "Växten är en " + super.getPlantType() +
                " som heter " + getPlantName() + ". " +
                "Den ska vattnas med " + getAmountLiquid() + " " +
                getLiquidMeasurement() + " " + getLiquidType() + " per dag.";
    }
}