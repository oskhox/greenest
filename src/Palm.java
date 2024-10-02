public class Palm extends Plants implements Calculate {
    //inkapslade konstanter utan default-värden
    private final String plantName;
    private final double height;
    //inkapslade konstanter med default-värden
    private static final double DEFAULT_AMOUNT_LIQUID_PER_METER = 0.5;
    private static final String LIQUID_TYPE = "vatten";
    private static final String LIQUID_MEASUREMENT = "liter";

    public Palm(String plantType, String plantName, double height) {
        super(plantType);
        this.plantName = plantName;
        this.height = height;
    }

    //getters och setters bidrar till inkapsling
    public String getPlantName() {
        return plantName;
    }

    public double getHeight() {
        return height;
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
        return DEFAULT_AMOUNT_LIQUID_PER_METER * getHeight();
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