package sample;

public class Key {
    private String name;
    private String label;

    public Key(String name, String label) {
        this.name = name;
        this.label = label;
    }

    public Key(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
