public enum LiquidType {
    WATER("vatten"),
    MINERAL_WATER("mineralvatten"),
    PROTEIN_DRINK("proteindryck");

    //variabel som kommer lagra namn på vätskan
    private final String liquid;

    //konstruktor som sätter namnet
    LiquidType(String liquid) {
        this.liquid = liquid;
    }

    //getter för åtkomst
    public String getLiquid() {
        return liquid;
    }
}