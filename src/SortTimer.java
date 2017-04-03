import java.util.Scanner;
import java.util.Arrays;

/**
This program measures how long it takes to sort an
array of a user-specified size with the selection
sort algorithm.
 */
public class SortTimer
{  
    public static void main(String[] args)
    {  
        final int ARRAY_SIZE = 10;

        // Construct random array
        int[] a = ArrayUtil.randomIntArray(ARRAY_SIZE, 10000);

        if (a.length <= 10)
            System.out.println(Arrays.toString(a)); //print unsorted array

        // Use stopwatch to time selection sort
        StopWatch timer = new StopWatch();

        timer.start();
        SelectionSorter.sort(a);  //sort the array
        timer.stop();

        System.out.println("Elapsed time: " 
            + timer.getElapsedTime() + " milliseconds");
            
        if (a.length <= 10)
            System.out.println(Arrays.toString(a)); //print sorted array
    }
}

