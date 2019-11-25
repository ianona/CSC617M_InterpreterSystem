package sample;

public class LoopStackEntry {
    private String conditionLbl;
    private String bodyLbl;
    private String endLbl;
    private String updateLbl;

    public LoopStackEntry(String conditionLbl, String bodyLbl, String endLbl, String updateLbl) {
        this.conditionLbl = conditionLbl;
        this.bodyLbl = bodyLbl;
        this.endLbl = endLbl;
        this.updateLbl = updateLbl;
    }

    public String getConditionLbl() {
        return conditionLbl;
    }

    public String getBodyLbl() {
        return bodyLbl;
    }

    public String getEndLbl() {
        return endLbl;
    }

    public String getUpdateLbl() {
        return updateLbl;
    }
}
