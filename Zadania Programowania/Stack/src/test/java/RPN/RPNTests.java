package test.java.RPN;

import main.java.RPN.RPN;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class RPNTests
{
    @Test
    public void testAddition()
    {
        RPN RPN = new RPN();

        assertEquals("(2 + 7 + 3 + 14 = 26", 26,  RPN.calculate("2 7 + 3 + 14 +"), 0.001f);

    }

    @Test
    public void testDivisional()
    {
        RPN RPN = new RPN();

        assertEquals("26 - 13 - 24 = -11", -11, RPN.calculate("26 13 - 24 -"), 0.001f);

    }

    @Test
    public void testMultiplication()
    {
        RPN RPN = new RPN();

        assertEquals("4 * 2 * 3= 16", 24, RPN.calculate("4 2 * 3 *"), 0.001f);

    }

    @Test
    public void testSubtraction()
    {
        RPN RPN = new RPN();


        assertEquals("20 10 / 2 / = 5", 1, RPN.calculate("20 10 / 2 /"), 0.001f);

    }

    @Test
    public void testFull()
    {
        RPN RPN = new RPN();

        assertEquals("(2 + 7 + 3 + 14 = 26", 23.5, RPN.calculate("2 7 + 3 / 14 3 - 4 * + 2 /"), 0.001f);
    }

    @Test
    public void testWrongInput()
    {
        RPN RPN = new RPN();

        assertThrows(IllegalArgumentException.class, () -> RPN.calculate("z w"));
    }

}
