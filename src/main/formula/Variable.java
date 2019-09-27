package main.formula;

public class Variable implements Formula{
    private String name;
    private Double value;

    public Variable(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String asString() {
        return getName();
    }

    public Double asValue(){
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
