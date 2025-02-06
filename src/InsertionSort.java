import java.util.Arrays;

public class InsertionSort {
    static void shift(int[]arr,int idx,int i){
        for (int j = idx; j>i ; j--) {
            arr[j]=arr[j-1];
        }

   }

    static void selSort(int[]arr, int idx){
        int currEle=arr[idx];

    }
    public static void main(String[] args) {
    int[]arr={1,5,3,2,6};
    int i=1;
    while(i<arr.length){
        selSort(arr,i);
        System.out.println(Arrays.toString(arr));        i++;
    }

    }
}
