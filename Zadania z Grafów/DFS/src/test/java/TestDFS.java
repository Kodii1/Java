import org.example.DFS;
import org.example.Graph;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;


public class TestDFS{
    private Graph graph;
    @Test
    public void test(){
        List < List < Integer > > adjacencyList = new ArrayList <>();
        List < Integer > row = new ArrayList <>(Arrays.asList(3, 4, 6));
        adjacencyList.add(row);
        row = new ArrayList <>(Arrays.asList(5, 6));
        adjacencyList.add(row);
        row = new ArrayList <>(Arrays.asList(1, 5, 7, 8));
        adjacencyList.add(row);
        row = new ArrayList <>(Arrays.asList(1, 5, 7, 8));
        adjacencyList.add(row);
        row = new ArrayList <>(Arrays.asList(2, 3, 4, 7));
        adjacencyList.add(row);
        row = new ArrayList <>(Arrays.asList(1, 2, 7));
        adjacencyList.add(row);
        row = new ArrayList <>(Arrays.asList(3, 4, 5, 6));
        adjacencyList.add(row);
        row = new ArrayList <>(Arrays.asList(3, 4 ));
        adjacencyList.add(row);


        graph = new Graph(adjacencyList, 1);
        List < Integer > answer = new ArrayList <>(Arrays.asList(1, 3, 5, 2, 6 ,7, 4, 8));
        DFS dfs = new DFS(graph);
        assertEquals(answer,dfs.getDFSList());
    }
    @Test
    public void testV2(){
        List < List < Integer > > adjacencyList = new ArrayList <>();
        List < Integer > row = new ArrayList <>(List.of());
        adjacencyList.add(row);
        row = new ArrayList <>(Arrays.asList(6, 7));
        adjacencyList.add(row);
        row = new ArrayList <>(List.of());
        adjacencyList.add(row);
        row = new ArrayList <>(Arrays.asList(6, 8));
        adjacencyList.add(row);
        row = new ArrayList <>(List.of());
        adjacencyList.add(row);
        row = new ArrayList <>(Arrays.asList(2, 4, 7));
        adjacencyList.add(row);
        row = new ArrayList <>(Arrays.asList(2, 6));
        adjacencyList.add(row);
        row = new ArrayList <>(List.of(4));
        adjacencyList.add(row);


        graph = new Graph(adjacencyList, 1);
        List < Integer > answer = new ArrayList <>(List.of(1));
        DFS dfs = new DFS(graph);
        assertEquals(answer,dfs.getDFSList());
    }
    @Test
    public void testV3(){
        List < List < Integer > > adjacencyList = new ArrayList <>();
        List < Integer > row = new ArrayList <>(Arrays.asList(2, 3));
        adjacencyList.add(row);
        row = new ArrayList <>(Arrays.asList(1, 3, 5));
        adjacencyList.add(row);
        row = new ArrayList <>(Arrays.asList(1, 2, 4, 5));
        adjacencyList.add(row);
        row = new ArrayList <>(List.of(3));
        adjacencyList.add(row);
        row = new ArrayList <>(Arrays.asList(2, 3));
        adjacencyList.add(row);


        graph = new Graph(adjacencyList, 3);
        List < Integer > answer = new ArrayList <>(Arrays.asList(3 ,1, 2 ,5, 4));
        DFS dfs = new DFS(graph);
        assertEquals(answer,dfs.getDFSList());
    }

}
