public class Cactus extends Plants {
    //inkapsling
    private static final int DEFAULT_AMOUNT_LIQUID = 2;
    private static final String DEFAULT_LIQUID_MEASUREMENT = "cl";
    private static final LiquidType liquid = LiquidType.MINERAL_WATER;

    public Cactus(String plantType, String plantName) {
        super(plantType, plantName);
    }

    //getters bidrar till inkapsling
    public LiquidType getLiquidType() {
        return liquid;
    }

    public int getAmountLiquid() {
        return DEFAULT_AMOUNT_LIQUID;
    }

    public String getLiquidMeasurement() {
        return DEFAULT_LIQUID_MEASUREMENT;
    }

    //toString-metod i subklassen som vid användning är polymorfism genom arv
    @Override
    public String toString() {
        return "Växten är en " + super.getPlantType() +
                " som heter " + super.getPlantName() + ". " +
                "Den ska vattnas med " + getAmountLiquid() + " " +
                getLiquidMeasurement() + " " + getLiquidType().getLiquid() + " per dag.";
    }
}