public class CarnPlant extends Plants {

    //inkapslade variabler
    private String plantName, liquidType, liquidMeasurement;
    private int amountLiquid; //till interface sen, inte arv

    public CarnPlant (String plantType, String plantName, String liquidType, String liquidMeasurement, int amountLiquid) {
        super(plantType);
        this.plantName = plantName;
        this.liquidType = liquidType;
        this.liquidMeasurement = liquidMeasurement;
        this.amountLiquid = amountLiquid;
    }

    //getters och setters bidrar till inkapsling
    public String getPlantName() {
        return plantName;
    }

    @Override
    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public String getLiquidType() {
        return liquidType;
    }

    public void setLiquidType(String liquidType) {
        this.liquidType = liquidType;
    }

    public String getLiquidMeasurement() {
        return liquidMeasurement;
    }

    public void setLiquidMeasurement(String liquidMeasurement) {
        this.liquidMeasurement = liquidMeasurement;
    }

    //till interfacet, inte arvet
    public int getAmountLiquid() {
        return amountLiquid;
    }

    public void setAmountLiquid(int amountLiquid) {
        this.amountLiquid = amountLiquid;
    }

    //toString-metod i subklassen som metodöverskuggar superklassens toString-metod vilket är polymorfism genom arv
    //lägg till så att även skriver ut interfacet
    @Override
    public String toString() {
        return "Växten är en " + super.getPlantType() +
                " som heter " + getPlantName() + ". " +
                "Den ska vattnas med " + amountLiquid + " " +
                liquidMeasurement + " " + liquidType + ".";
    }
}

