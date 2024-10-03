public class CarnPlant extends Plants implements Calculate {
    //inkapsling
    private final double height;
    private static final double DEFAULT_AMOUNT_LIQUID_PER_DAY = 0.1;
    private static final double DEFAULT_AMOUNT_LIQUID_PER_METER = 0.2;
    private static final String DEFAULT_LIQUID_MEASUREMENT = "liter";
    private static final LiquidType liquid = LiquidType.PROTEIN_DRINK;

    public CarnPlant(String plantType, String plantName, double height) {
        super(plantType, plantName);
        this.height = height;
    }

    //getters bidrar till inkapsling
    public double getHeight() {
        return height;
    }

    public double getDefaultAmountLiquidPerDay() {
        return DEFAULT_AMOUNT_LIQUID_PER_DAY;
    }

    public double getDefaultAmountLiquidPerMeter() {
        return DEFAULT_AMOUNT_LIQUID_PER_METER;
    }

    public LiquidType getLiquidType() {
        return liquid;
    }

    public String getLiquidMeasurement() {
        return DEFAULT_LIQUID_MEASUREMENT;
    }

    //implementerar interface Calculate
    @Override
    public double calculateLiquid() {
        return getDefaultAmountLiquidPerMeter() * getHeight() + getDefaultAmountLiquidPerDay();
    }

    //toString-metod i subklassen som vid användning är polymorfism genom arv
    @Override
    public String toString() {
        return "Växten är en " + super.getPlantType() +
                " som heter " + super.getPlantName() + ". " +
                "Den ska vattnas med " + calculateLiquid() + " " +
                getLiquidMeasurement() + " " + getLiquidType().getLiquid() + " per dag.";
    }
}