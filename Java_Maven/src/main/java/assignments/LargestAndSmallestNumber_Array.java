package assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestAndSmallestNumber_Array {

    public static void main(String[] args) {


        int[] array = {11, 21, 33, 44, 52, 16, 73};


        Arrays.sort(array);

        System.out.println("Smallest : " +array[0]);

        System.out.println(array[array.length-2]);








    }
}

