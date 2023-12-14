package pl.ajarzab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputScanner inputScanner = new InputScanner();
        List < List < Integer > > matrix = inputScanner.getInput();
        List < Integer > listOfDiameters = new ArrayList<>();

        for(int i = 0; i < matrix.size(); i++){
            Dijkstra dijkstra = new Dijkstra( matrix,i );
            listOfDiameters.add(dijkstra.getLongestShortestPath());
        }

        listOfDiameters.sort(Collections.reverseOrder());
        System.out.println(listOfDiameters.get(0));
    }
}
