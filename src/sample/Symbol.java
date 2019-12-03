package sample;

public class Symbol {
    private String name;
    private String type;
    private String data_type;
    private Object value;

    public Symbol(String name, String type, String data_type) {
        this.name = name;
        this.type = type;
        this.data_type = data_type;
    }

    public Symbol(String name, String type, String data_type, Object value) {
        this.name = name;
        this.type = type;
        this.data_type = data_type;
        this.value = value;
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
}
