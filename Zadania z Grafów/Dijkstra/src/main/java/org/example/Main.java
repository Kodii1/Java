package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputScanner inputScanner = new InputScanner();
        List < List < Integer > > matrix = inputScanner.getMatrix();
        Integer startVertex = inputScanner.getStartVertex();
        new Dijkstra( matrix, startVertex - 1);
    }
}
