public class Plants {
    //inkapsling
    private final String plantType;
    private final String plantName;

    public Plants(String plantType, String plantName) {
        this.plantType = plantType;
        this.plantName = plantName;
    }

    //getter bidrar till inkapsling
    public String getPlantType() {
        return plantType;
    }

    public String getPlantName() {
        return plantName;
    }

    @Override
    public String toString() {
        return "Växten " + getPlantType() + " är av typen " + getPlantType() + ".";
    }
}