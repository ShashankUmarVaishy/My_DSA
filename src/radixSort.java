import java.util.Arrays;

public class radixSort {
    public static void RadixSort(int[] arr) {
        int max= Arrays.stream(arr).max().getAsInt();
        //do count sort for every digits place
        for(int exp=1;max/exp>0;exp*=10){
            countSort(arr,exp);
        }
    }
    private static void countSort(int[] arr, int exp) {
        int[] output=new int[arr.length];
        int[]count=new int[10];
        Arrays.fill(count,0);
        //traverse and fill the count
        for (int j : arr) {
            count[(j / exp) % 10]++;
        }
        //add'em to get correct positioning
        for (int i = 0; i < 9; i++) {
            count[i+1]+=count[i];
        }
        //fill values in output
        for(int i=arr.length-1;i>=0;i--){
            output[--count[(arr[i]/exp)%10]]=arr[i];
        }
        //copy output
        System.arraycopy(output, 0, arr, 0, arr.length);


    }
    public static void main(String[] args) {
        int[] arr={23,56,87,32,1,0,909,323};
        System.out.println(Arrays.toString(arr));
        RadixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
