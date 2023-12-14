package main.java.RPN;

import main.java.Stack.Stack;
import java.util.HashMap;

public class RPN{


    private static final Stack stack = new Stack();
    private final HashMap <String, Operator > operatorMap = new HashMap <String,Operator>();

    public RPN ()
    {
        operatorMap.put("+",new AdditionOperator());
        operatorMap.put("-", new SubtractionOperator());
        operatorMap.put("*",new MultiplicationOperator());
        operatorMap.put("/",new DivisionalOperator());

    }

    public double calculate ( String input )
    {
        String[] numbers = input.split(" ");

        for( String number : numbers ){
            try{
                Float.parseFloat(number);
                stack.push(number);
            } catch( Exception e ){
                if( isOperator(number) ){
                    Operator operator = operatorMap.get(number);
                    float result = operator.calculate(stack);
                    stack.push(String.valueOf(result));
                }
                else
                {
                    throw new IllegalArgumentException("Wrong input: " + number);
                }
            }
        }
        return Double.parseDouble(stack.pop());

    }
    public boolean isOperator(String input)
    {
        return operatorMap.containsKey(input);
    }
}
