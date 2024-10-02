public class CarnPlant extends Plants implements Calculate {
    //inkapslade konstanter utan default-värden
    private final String plantName;
    private final double height;
    //inkapslade konstanter med default-värden
    private static final double DEFAULT_AMOUNT_LIQUID_PER_DAY = 0.1;
    private static final double DEFAULT_AMOUNT_LIQUID_PER_METER = 0.2;
    private static final String LIQUID_TYPE = "proteindryck";
    private static final String LIQUID_MEASUREMENT = "liter";

    public CarnPlant (String plantType, String plantName, double height) {
        super(plantType);
        this.plantName = plantName;
        this.height = height;
    }

    //getters bidrar till inkapsling
    public String getPlantName() {
        return plantName;
    }

    public double getHeight() {
        return height;
    }

    public double getDefaultAmountLiquidPerDay() {
        return DEFAULT_AMOUNT_LIQUID_PER_DAY;
    }

    public double getDefaultAmountLiquidPerMeter() {
        return DEFAULT_AMOUNT_LIQUID_PER_METER;
    }

    public String getLiquidType() {
        return LIQUID_TYPE;
    }

    public String getLiquidMeasurement() {
        return LIQUID_MEASUREMENT;
    }

    //implementerar interface Calculate
    @Override
    public double calculateLiquid() {
        return getDefaultAmountLiquidPerMeter() * getHeight() + getDefaultAmountLiquidPerDay();
    }

    //toString-metod i subklassen som metodöverskuggar superklassens toString-metod vilket är polymorfism genom arv
    @Override
    public String toString() {
        return "Växten är en " + super.getPlantType() +
                " som heter " + getPlantName() + ". " +
                "Den ska vattnas med " + calculateLiquid() + " " +
                getLiquidMeasurement() + " " + getLiquidType() + " per dag.";
    }
}