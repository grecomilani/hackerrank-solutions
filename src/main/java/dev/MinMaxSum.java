package dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMaxSum {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(256741038,623958417,
                467905213,714532089,938071625));

        //Expected Output - 2063136757 2744467344

        miniMaxSum(arr);
    }

    public static void miniMaxSum(List<Integer> arr) {


        // Lembrar do estouro de limite de inteiros
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        long sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(arr.get(i) < min){
                min = arr.get(i);
            }
            if(arr.get(i) > max){
                max = arr.get(i);
            }
        }

        System.out.printf("%d %d",(sum - max),(sum - min));

    }

}
