package sortMethods;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5,6,7,10,13};
        int[] sort = sort(arr);
        System.out.println(Arrays.toString(sort));
    }

    private static int[] sort(int[] arr){
        for (int i = 1; i <arr.length ; ++i) {
            int newi = arr[i]; // 要插入的数
            int j = i-1;//前一个索引
            while (j>=0 && arr[j] < newi){
                arr[j+1] = arr[j];
                j--;
                System.out.println(newi);
                System.out.println(Arrays.toString(arr));
            }
            arr[j+1] = newi;
        }
        return arr;
    }

    private static int[] sort2(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int index = i-1;
            while (index>=0 && key>arr[index]){
                arr[index+1] = arr[index];
                index--;
            }
            arr[index+1] = key;
        }
        return arr;
    }



}
