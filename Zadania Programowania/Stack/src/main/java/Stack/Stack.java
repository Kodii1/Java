package main.java.Stack;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Stack
{
    private static String[] elements = {} ;
    public void push (String words)
    {
        String[] temp = new String[elements.length + 1];
        temp[elements.length] = words;

        System.arraycopy(elements, 0, temp, 0, elements.length);
            temp[elements.length] = words;

        elements = temp;

    }
    public String pop()
    {
        if( elements.length > 0 )
        {
            String[] temp = new String[elements.length - 1];
            System.arraycopy(elements, 0, temp, 0, temp.length);
            String tempReturn = elements[ elements.length - 1];
            elements = temp;
            return tempReturn;
        }else return null; // Stack is Empty


    }
    public static String peek ()
    {
        if( elements.length == 0 )
        {
            return null;
        }
        else return elements[ elements.length - 1 ];
    }

    public String[] getStack ()
    {
        if( elements.length > 0  )
        {
            for( String index : elements )
            {
                System.out.println( index );
            }
            return elements;
        }else return null; // Stack is Empty
    }
}
