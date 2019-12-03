package sample;

public class Key {
    private String name;
    private String info;

    public Key(String name, String info) {
        this.name = name;
        this.info = info;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
