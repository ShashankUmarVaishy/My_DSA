import java.util.Arrays;

public class CyclicSort {
//    static void swap(int[]arr,int i){
//        int correctIdx=arr[i]-1;
//        int temp=arr[correctIdx];
//        arr[correctIdx]=arr[i];
//        arr[i]=temp;
//        check(arr,i);
//    }
//static boolean check(int[]arr,int i){
//    if(arr[i]==(i+1)){
//        return true;
//    }else{
//        swap(arr,i);
//    }
//    return true;
//}
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int corrIdx=arr[i]-1;
            if(arr[i]==arr[corrIdx]){
                i++;
            }else{
                //swap
                int temp=arr[corrIdx];
                arr[corrIdx]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
    int[] arr={3,5,2,1,4,6};
//        for (int i = 0; i < arr.length-1; i++) {
//            check(arr,i);
//        }
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
