package com.hongghe.algorithmexamples.algorithm.search.half;

/**
 * @author hongghe 2018/8/26
 */
public class NorecurrenceHalf {

    public static int norecurrenceHalf(int[]array, int v) {
        int start = 0;
        int end = array.length-1;
        int middle;
        while (start <= end) {
            middle = (start+end)/2;
            if (array[middle] == v) {
                return middle+1;
            } else if (array[middle] < v) {
                start = middle+1;
            } else {
                end = middle-1;
            }
        }
        return -1;
    }
}