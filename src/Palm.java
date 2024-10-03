public class Palm extends Plants implements Calculate {
    //inkapsling
    private final double height;
    private static final double DEFAULT_AMOUNT_LIQUID_PER_METER = 0.5;
    private static final String DEFAULT_LIQUID_MEASUREMENT = "liter";
    private static final LiquidType liquid = LiquidType.WATER;

    public Palm(String plantType, String plantName, double height) {
        super(plantType, plantName);
        this.height = height;
    }

    //getters bidrar till inkapsling
    public double getHeight() {
        return height;
    }

    public double getDefaultAmountLiquidPerMeter() {
        return DEFAULT_AMOUNT_LIQUID_PER_METER;
    }

    public String getLiquidMeasurement() {
        return DEFAULT_LIQUID_MEASUREMENT;
    }

    public LiquidType getLiquidType() {
        return liquid;
    }

    //implementerar interface Calculate
    @Override
    public double calculateLiquid() {
        return getDefaultAmountLiquidPerMeter() * getHeight();
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