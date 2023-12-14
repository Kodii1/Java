package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class InputScanner{
    private final List < List < Integer> > input = new ArrayList<>();


    public void readInput() {
        Scanner scanner = new Scanner(System.in);

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
    }
    public boolean checkIfTheInputIsCorrect(){
        return CheckData.checkMatrix(input);
    }
     public List < List < Integer > > getInput (){
        return input;
     }
}
