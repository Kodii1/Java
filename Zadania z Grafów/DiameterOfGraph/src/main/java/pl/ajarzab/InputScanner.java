package pl.ajarzab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputScanner{
    private final List < List < Integer> > input;

    public InputScanner (){
        input = readInput();

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
    public List < List < Integer > > getInput(){
        if(CheckData.checkAdjacencyList(input)){
            return input;
        }
        throw new IllegalArgumentException("Invalid adjacency list");
    }

}