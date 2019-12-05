package sample;

public class Key {
    private String name;
    private String info;
    private String[] info2;

    public Key(String name, String info) {
        this.name = name;
        this.info = info;
    }


    public Key(String name, String info, String[] info2) {
        this.name = name;
        this.info = info;
        this.info2 = info2;
    }

    public String[] getInfo2() {
        return info2;
    }

    public void setInfo2(String[] info2) {
        this.info2 = info2;
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
