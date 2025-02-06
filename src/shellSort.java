//import java.util.Arrays;
//
//public class shellSort {
//    public static void main(String[] args) {
//        int[] arr = {1, 34, 56, 43, 2, 1, 90, 87, 65, 59};
//        int N = arr.length;
//
//        for (int gap = N / 2; gap >= 1; gap /= 2) {
//            for (int j = gap; j < N; j++) {
//                for (int i = j - gap; i >= 0; i -= gap) {
//                    if (arr[i + gap] >= arr[i]) {
//                        break;
//                    } else {
//                        int temp = arr[i+gap];
//                        arr[i+gap] = arr[i];
//                        arr[i] = temp;
//                    }
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));
//    }
//}
//
import java.util.Arrays;

public class shellSort {
    public static void main(String[] args) {
        int[]arr={1,34,56,43,2,1,90,87,65,59};
        int N=arr.length;
        for(int gap=N/2;gap>=1;gap=gap/2){
            for(int j=0;j<N;j++){
                for (int i = j-gap; i >=0 ; i=i-gap) {
                    if(arr[i+gap]>arr[i]){
                        break;
                    }else{
                        int temp = arr[i+gap];
                        arr[i+gap] = arr[i];
                        arr[i] = temp;
                    }

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}