

import java.util.Arrays;

public class SelectionSort {
    static int[] selectionSort(int[] arr){
        // if(arr==null){
        //     return new int[]{};
        // }
        for (int i = 0; i < arr.length; i++) {
            int minIdx=i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<arr[minIdx]){
                    minIdx=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;

        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,02,54,-87,-952,22,35,94,25,1};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
