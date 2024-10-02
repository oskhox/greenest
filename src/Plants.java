public class Plants {
    //inkapslade konstant utan default-värden
    private final String plantType;

    public Plants(String plantType) {
        this.plantType = plantType;
    }

    //getter bidrar till inkapsling
    public String getPlantType() {
        return plantType;
    }

    //superklassens toString-metod som alltid överskuggas av subklasserna
    @Override
    public String toString() {
        return "Växten är av typen " + plantType + ".";
    }
}