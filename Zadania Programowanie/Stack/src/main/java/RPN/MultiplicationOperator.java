package main.java.RPN;

import main.java.Stack.Stack;

public class MultiplicationOperator implements Operator
{
    @Override
    public float calculate ( Stack stack ){
        float x = Float.parseFloat(stack.pop());
        float y = Float.parseFloat(stack.pop());
        return y * x;
    }
}
