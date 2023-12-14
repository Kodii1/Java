package org.example;

import java.util.List;

public class Graph {
    private final List < List < Integer > > adjacencyList;
    private final Integer numberOfVertexes;
    private final Integer startVertex;
    public Graph(List < List < Integer > > adjacencyList, Integer startVertex ){
        this.adjacencyList = adjacencyList;
        this.startVertex = startVertex;
        this.numberOfVertexes = adjacencyList.size();
    }

    public List < List < Integer > > getAdjacencyList(){
        return adjacencyList;
    }
    public Integer getNumberOfVertexes(){
        return numberOfVertexes;
    }
    public Integer getStartVertex(){
        return startVertex;
    }

}
