package pl.ajarzab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dijkstra {
    private final List<Integer> distance ;
    private final boolean[] visited;
    private final List < List < Integer > > graph;

    public Dijkstra(List < List < Integer > > graph , Integer startVertex){
        this.graph = graph;
        this.distance = new ArrayList<>(Collections.nCopies(graph.size(), Integer.MAX_VALUE));
        this.distance.set(startVertex ,0);
        this.visited = new boolean[graph.size()];
        dijkstra();
    }
    private void dijkstra (){
        for (int i = 0; i < graph.size(); i++) {
            int currentVertex = findMinDistance();
            visited[currentVertex] = true;

            for (int j = 0; j < graph.size(); j++) {
                if (graph.get(currentVertex).get(j) != 0){
                    if (distance.get(currentVertex) + graph.get(currentVertex).get(j) < distance.get(j)) {
                        int x = distance.get(currentVertex) + graph.get(currentVertex).get(j);
                        distance.set(j, x);
                    }
                }
            }
        }
    }
    private Integer findMinDistance(){
        int minDistance = Integer.MAX_VALUE;
        int minIndex = -999; // need to be changed in for loop or will be out of range
        for( int i =0; i < distance.size(); i++){
            if(!visited[i] && distance.get(i) < minDistance){
                minDistance = distance.get(i);
                minIndex = i;

            }
        }
        return minIndex;
    }
    public int getLongestShortestPath() {
        int diameter = 0;

        for (Integer integer : distance) {
            if (integer > diameter) {
                diameter = integer;
            }
        }

        return diameter;
    }

}