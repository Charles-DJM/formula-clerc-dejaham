package test;

import main.formula.Formula;
import main.formula.Product;
import main.formula.Sum;
import main.formula.Variable;
import org.junit.Test;

import static org.junit.Assert.*;

public class FormulaTest {

    @Test
    public void asString() {
        Variable x = new Variable("x", 2.5);
        Variable y = new Variable("y", 4.0);

        Formula formula = new Sum(x, new Product(y, new Sum(x,y)));

        assertEquals("(x + (y * (x + y)))", formula.asString());
    }

    @Test
    public void asValue() {
        Variable x = new Variable("x", 2.5);
        Variable y = new Variable("y", 4.0);

        Formula formula = new Sum(x, new Product(y, new Sum(x,y)));

        Double value = 28.5;
        assertEquals(value, formula.asValue());

        x.setValue(5.0);
        value = 41.0;
        assertEquals(value, formula.asValue());
    }
}