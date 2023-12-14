package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputScanner{
    private final List < List < Integer> > input;
    private List < List < Integer > > inputWithOutStartVertex = new ArrayList<>();
    private final Integer startVertex;
    public InputScanner (){
        input = readInput();
        inputWithOutStartVertex = input.stream()
                .map(ArrayList::new)
                .collect(Collectors.toList());
        inputWithOutStartVertex.removeLast();
        startVertex = input.getLast().getLast();
    }


    private List<List<Integer>> readInput() {
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> input = new ArrayList<>();

        while (scanner.hasNextLine()) {
            List<Integer> row = new ArrayList<>();
            String scanRow = scanner.nextLine();
            if (scanRow.isEmpty()) {
                break;
            }
            Scanner rowScanner = new Scanner(scanRow);
            while (rowScanner.hasNext()) {
                int number = rowScanner.nextInt();
                row.add(number);
            }
            input.add(row);
        }
        return input;
    }
    public Integer getStartVertex(){
        if(CheckData.checkIsStartVertexIsFine(inputWithOutStartVertex, startVertex)){
            return startVertex;
        }
        throw new IllegalArgumentException("Invalid start vertex");
    }

    public List < List < Integer >> getAdjacencyList(){
        if(CheckData.checkIsAdjacencyListIsFine(inputWithOutStartVertex)){
            return input.stream().limit(input.size() - 1)
                    .map(List::stream)
                    .map(stream -> stream.skip(1)
                            .collect(Collectors.toList())).collect(Collectors.toList());
        }
        throw new IllegalArgumentException("Adjacency list have wrong data");
    }
    public List < List < Integer > > getInput (){
        return input;
    }
}
