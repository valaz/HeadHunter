package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Azat on 24.10.2015.
 */
public class Task2 {

    public static long getFirstIndex(String sequence){
        int seqSize = sequence.length();
        long rootIndex = 0;
        long beginIndex = 1;
        long endIndex = seqSize;
        String curSegment = getSegment(beginIndex, endIndex);

        while(!curSegment.contains(sequence)){
            rootIndex += String.valueOf(beginIndex).length();
            beginIndex++;
            endIndex++;
            curSegment = getSegment(beginIndex, endIndex);
        }
        long internalIndex = getInternalIndex(curSegment,sequence);

        return rootIndex + internalIndex;
    }

    public static long getFirstIndex(File inputFile) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(inputFile);
        String input = fileScanner.next();
        return getFirstIndex(input);
    }

    private static String getSegment(long beginIndex, long endIndex) {
        StringBuffer stringBuffer = new StringBuffer();
        for (long i = beginIndex; i <= endIndex ; i++) {
            stringBuffer.append(String.valueOf(i));
        }

        return stringBuffer.toString();
    }

    private static long getInternalIndex(String segment, String sequence) {
        long i = segment.indexOf(sequence);
        return i + 1;
    }
}
