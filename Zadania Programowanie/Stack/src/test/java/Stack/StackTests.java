package test.java.Stack;

import main.java.Stack.Stack;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StackTests
{
    @Test
    public void testPop()
    {
        Stack stack = new Stack();
        String popReturn = stack.pop();
        assertNull("Delete last element from stack and return value", popReturn);
    }

    @Test
    public void testPeek()
    {
        Stack stack = new Stack();
        stack.push("something");
        String popReturn = Stack.peek();
        assertEquals("Return value from last element","something", popReturn);
    }

    @Test
    public void testPush()
    {
        Stack stack = new Stack();
        stack.push("somethingElse");
        stack.push("something");
        Assert.assertEquals("Add new value to stack","something", Stack.peek());
    }

}
