import org.example.InputScanner;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TestInputScanner{
    private final List < List < Integer > > inputList = new ArrayList <>();
    private final List < List < Integer > > adjacencyList = new ArrayList <>();
    @Before
    public void setUp(){
        inputList.add(List.of(1 ,3, 4, 6));
        inputList.add(List.of(2 ,5, 6));
        inputList.add(List.of(3 ,1, 5, 7, 8));
        inputList.add(List.of(4 ,1, 5, 7, 8));
        inputList.add(List.of(5 ,2, 3, 4, 7));
        inputList.add(List.of(6 ,1, 2, 7));
        inputList.add(List.of(7 ,3, 4, 5, 6));
        inputList.add(List.of(8 ,3, 4 ));
        inputList.add(List.of(1));

        adjacencyList.add(List.of(3, 4, 6));
        adjacencyList.add(List.of(5, 6));
        adjacencyList.add(List.of(1, 5, 7, 8));
        adjacencyList.add(List.of(1, 5, 7, 8));
        adjacencyList.add(List.of(2, 3, 4, 7));
        adjacencyList.add(List.of(1, 2, 7));
        adjacencyList.add(List.of(3, 4, 5, 6));
        adjacencyList.add(List.of(3, 4 ));
    }
    @Test
    public void testReadInput(){
        String input = """
                1 3 4 6
                2 5 6
                3 1 5 7 8
                4 1 5 7 8
                5 2 3 4 7
                6 1 2 7
                7 3 4 5 6
                8 3 4
                1""";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        InputScanner inputScanner = new InputScanner();

        assertEquals(inputList,inputScanner.getInput());
    }
    @Test
    public void testGetAdjacencyList(){
        String input = """
                1 3 4 6
                2 5 6
                3 1 5 7 8
                4 1 5 7 8
                5 2 3 4 7
                6 1 2 7
                7 3 4 5 6
                8 3 4
                1""";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        InputScanner inputScanner = new InputScanner();

        assertEquals(adjacencyList,inputScanner.getAdjacencyList());
    }
    @Test
    public void testGetStartVertex(){
        String input = """
                1 3 4 6
                2 5 6
                3 1 5 7 8
                4 1 5 7 8
                5 2 3 4 7
                6 1 2 7
                7 3 4 5 6
                8 3 4
                1""";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        InputScanner inputScanner = new InputScanner();

        assertEquals( inputList.getLast().getLast(),inputScanner.getStartVertex());
    }
}
