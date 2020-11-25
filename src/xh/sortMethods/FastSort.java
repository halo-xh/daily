package sortMethods;

import java.util.Arrays;

public class FastSort {

    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 8, 2, 10, 3};//6,5,8,2,10,3,26
        System.out.println(Arrays.toString(sort(arr, 0, arr.length - 1)));
        System.out.println(Arrays.toString(QuickSort(arr, 0, arr.length - 1)));
    }


    private static int[] sort(int[] arr, int begin, int end) {
        if (begin < end) {
            int key = arr[begin];
            int i = begin;
            int j = end;
            while (i < j) {
                while (i < j && arr[j] >= key) {
                    j--;
                }
                if (i < j) {
                    arr[i] = arr[j];
                }
                while (i < j && arr[i] <= key) {
                    i++;
                }
                if (i < j) {
                    arr[j] = arr[i];
                    j--;
                }
            }
            arr[i] = key;
            sort(arr, begin, i - 1);
            sort(arr, i + 1, end);
        }
        return arr;
    }

    private static int[] QuickSort(int[] arr, int left, int right) {
        if (left < right) {
            int temp; //for exchange
            int flag = arr[right];
            int smalleridex = left - 1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < flag) {
                    smalleridex++;
                    temp = arr[i];
                    arr[i] = arr[smalleridex];
                    arr[smalleridex] = temp;
                }

            }
            temp = arr[right];
            arr[right] = arr[smalleridex + 1];
            arr[smalleridex + 1] = temp;
            QuickSort(arr, left, smalleridex);
            QuickSort(arr, smalleridex + 2, right);
        }
        return arr;
    }

}
