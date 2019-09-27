package main.formula;

public class Sum implements Formula{
    private Formula variable1;
    private Formula variable2;

    public Sum(Formula variable1, Formula variable2) {
        this.variable1 = variable1;
        this.variable2 = variable2;
    }

    @Override
    public Double asValue(){
        return Double.sum(variable1.asValue(),variable2.asValue());
    }

    @Override
    public String asString() {
        return  "(" + variable1.asString() + " + " + variable2.asString() + ")";
    }
}
