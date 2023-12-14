package org.example;

import java.util.List;

import java.util.*;

public class  DFS{
    private final List < List < Integer > > adjacencyList;
    private final Stack<Integer> stack = new Stack <>();
    private final int startVertex;
    private final int numberOfVertexes;
    private final List < Integer > DFSList = new ArrayList <>();

    public DFS ( Graph graph ){
        startVertex = graph.getStartVertex();
        adjacencyList = graph.getAdjacencyList();
        numberOfVertexes = graph.getNumberOfVertexes();
        DFSAlgorithm();
    }


    private void DFSAlgorithm(){
        boolean[] visited = new boolean[numberOfVertexes + 1];

        stack.push(startVertex);

        while(DFSList.size() != adjacencyList.size() && !stack.isEmpty()){
            int startVertex = stack.peek();

            if(!visited[startVertex]){ // grab 1st one
                visited[startVertex] = true;
                DFSList.add(startVertex);
            }
            boolean check = true;
            for (int currentNeighbour : adjacencyList.get(startVertex - 1)) {
                if (!visited[currentNeighbour]) {
                    visited[currentNeighbour] = true;
                    stack.push(currentNeighbour);
                    DFSList.add(currentNeighbour);
                    check = false;
                    break;
                }
            }
            if(check){
                stack.pop();
            }
        }
    }

    public void getAnswer(){
        if(DFSList.size() != numberOfVertexes){
            System.out.println("Graf jest niespójny");
        }else{
            System.out.print("Porządek DFS: ");
            for(Integer vertex : DFSList){
                System.out.print(vertex);
                if(!vertex.equals(DFSList.getLast())){
                    System.out.print(" ");
                }
            }
            System.out.println();
            System.out.println("Graf jest spójny");
        }
    }
    public List < Integer > getDFSList(){
        return DFSList;
    }
}