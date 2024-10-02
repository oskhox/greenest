public enum LiquidType {
    WATER("vatten"),
    MINERAL_WATER("mineralvatten"),
    PROTEIN_DRINK("proteindryck");

    private final String liquid;

    LiquidType(String liquid) {
        this.liquid = liquid;
    }

    public String getLiquid() {
        return liquid;
    }
}