package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if(array.length % 2 ==0) {
            return true;
        }
        return false;
    }

    public Integer[] range(int start, int stop) {

        int[]result = new int[stop-start];

        for (int i = start; i < stop; i++) {
//            int result += range[i];
        }


        return null;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        int total = 0;

        for (int i = array [0]; i < array [2]; i++) {
            total+= array[i];

        }


        return total;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

        int total = 0;

        for (int i = array[0]; i < array[2]; i++) {
            total = array[i] * array[i];

        }
        return total;
    }
}
