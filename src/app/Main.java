package app;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File input1 = new File("input1.txt");
        double task1Result = Task1.getMedian(input1);
        System.out.println("Task 1 result: " + task1Result);


        File input2 = new File("input2.txt");
        long task2Result = Task2.getFirstIndex(input2);
        System.out.println("Task 2 result: " + task2Result);

    }
}
