public class Plants {
    //inkapslade variabler
    private String plantType;

    public Plants(String plantType) {
        this.plantType = plantType;
    }

    //getters och setters bidrar till inkapsling
    public String getPlantType() {
        return plantType;
    }

    public void setPlantName(String plantName) {
        this.plantType = plantType;
    }

    //superklassens toString-metod som alltid skriv över av subklasserna
    @Override
    public String toString() {
        return "Plants{" +
                "plantType='" + plantType + '\'' +
                '}';
    }
}

//kolla om getter eller setter bli grå och ta i så fall bort