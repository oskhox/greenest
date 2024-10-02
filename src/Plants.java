public class Plants {
    //inkapslad konstant
    private final String plantType;

    public Plants(String plantType) {
        this.plantType = plantType;
    }

    //getter bidrar till inkapsling
    public String getPlantType() {
        return plantType;
    }

    @Override
    public String toString() {
        return "Växten är av typen " + plantType + ".";
    }
}