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

    public void setArrayValue(Object value, int index){
        switch (getData_type()){
            case Constants.DTYPE_INT_ARR:
                ((Integer[])getValue())[index] = Integer.valueOf(value.toString());
                break;
            case Constants.DTYPE_CHAR_ARR:
                ((Character[])getValue())[index] = value.toString().charAt(0);
                break;
            case Constants.DTYPE_FLOAT_ARR:
                ((Float[])getValue())[index] = Float.valueOf(value.toString());
                break;
            case Constants.DTYPE_DOUBLE_ARR:
                ((Double[])getValue())[index] = Double.valueOf(value.toString());
                break;
            case Constants.DTYPE_STRING_ARR:
                ((String[])getValue())[index] = value.toString();
                break;
            case Constants.DTYPE_BOOL_ARR:
                ((Boolean[])getValue())[index]  = Boolean.valueOf(value.toString());
                break;
        }
    }

    public Object getArrayValue(int index){
        switch (getData_type()){
            case Constants.DTYPE_INT_ARR:
                return ((Integer[])getValue())[index];
            case Constants.DTYPE_CHAR_ARR:
                return ((Character[])getValue())[index];
            case Constants.DTYPE_FLOAT_ARR:
                return ((Float[])getValue())[index];
            case Constants.DTYPE_DOUBLE_ARR:
                return ((Double[])getValue())[index];
            case Constants.DTYPE_STRING_ARR:
                return ((String[])getValue())[index];
            case Constants.DTYPE_BOOL_ARR:
                return ((Boolean[])getValue())[index];
        }
        return null;
    }
}
