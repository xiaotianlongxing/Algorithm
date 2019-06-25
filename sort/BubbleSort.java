package com.algorithm;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        // 记录最后一次交换的位置
        int lastExchangeIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isSorted = true;
            // 无序数组的边界
            int sortBorder = arr.length - 1;
            for (int j = 0; j < sortBorder; j++) {
                if (arr[j + 1] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    isSorted = false;
                    sortBorder = j;
                }
            }
            sortBorder = lastExchangeIndex;
            if (isSorted) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 4, 7, 1, 2, };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
