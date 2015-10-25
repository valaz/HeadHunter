package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Azat on 24.10.2015.
 */
public class Task1 {

    public static double getMedian(List<Double> firstList, List<Double> secondList){
        List<Double> unionList = new ArrayList<Double>();
        unionList.addAll(firstList);
        unionList.addAll(secondList);
        Collections.sort(unionList);
        int unionListSize = unionList.size();
        if(unionListSize % 2 == 1){
            return unionList.get(unionListSize/2);
        }else{
            double sum =  unionList.get(unionListSize/2 - 1) + unionList.get(unionListSize/2);
            return sum/2;
        }
    }

    public static double getMedian(File inputFile) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(inputFile);
        String firstLine = fileScanner.nextLine();
        String secondLine = fileScanner.nextLine();
        List<Double> firstList = getList(firstLine);
        List<Double> secondList = getList(secondLine);

        return getMedian(firstList, secondList);
    }

    private static List<Double> getList(String line){
        String[] stringArray = line.split(" ");
        List<Double> doubleList = new ArrayList<Double>();
        for (int i = 0; i < stringArray.length; i++) {
            doubleList.add(Double.valueOf(stringArray[i]));
        }

        return doubleList;
    }

}
