package sample;

public class Symbol {
    private String name;
    private String type;
    private String data_type;
    private Object value;
    private Boolean isConst;
    private String scope;

    public Symbol(String name, String type, String data_type, String scope) {
        this.name = name;
        this.type = type;
        this.data_type = data_type;
        this.scope = scope;
        this.isConst = false;
    }

    public Symbol(String name, String type, String data_type, String scope, Object value) {
        this.name = name;
        this.type = type;
        this.data_type = data_type;
        this.scope = scope;
        this.value = value;
        this.isConst = false;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getData_type() {
        return data_type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Boolean getConst() {
        return isConst;
    }

    public void setConst(Boolean aConst) {
        isConst = aConst;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
