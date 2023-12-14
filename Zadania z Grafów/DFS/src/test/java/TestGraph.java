import org.example.Graph;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
public class TestGraph {

    private final Integer startVertex = 1;
    private final List < List < Integer > > adjacencyList = new ArrayList <>();
    @Before
    public void setUp(){
        adjacencyList.add(List.of(3, 4, 6));
        adjacencyList.add(List.of(5, 6));
        adjacencyList.add(List.of(1, 5, 7, 8));
        adjacencyList.add(List.of(1, 5, 7, 8));
        adjacencyList.add(List.of(2, 3, 4, 7));
        adjacencyList.add(List.of(1, 2, 7));
        adjacencyList.add(List.of(3, 4, 5, 6));
        adjacencyList.add(List.of(3, 4));
    }
    @Test
    public void testGetAdjacencyList(){
        Graph graph = new Graph(adjacencyList, startVertex);
        assertEquals("getAdjacencyList",adjacencyList,graph.getAdjacencyList());
    }
    @Test
    public void testGetStartVertex(){
        Graph graph = new Graph(adjacencyList, startVertex);
        assertEquals("getStartVertex",startVertex, graph.getStartVertex());
    }
    @Test
    public void testGetNumberOfVertexes(){
        Graph graph = new Graph(adjacencyList, startVertex);
        assertEquals("getNumberOfVertexes", adjacencyList.size(),(long) graph.getNumberOfVertexes());
    }

}