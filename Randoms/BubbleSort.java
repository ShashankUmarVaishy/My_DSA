public class BubbleSort {

    static void bubble_sort(int[]arr){
        if(arr==null){
            System.out.println("Empty");
            return;
        }
       
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[j+1]){
                    //swap
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
                }
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }
public static void main(String[] args) {
        int[] arr={1,2,02,54,-87,-952,22,35,94,25,1};
        bubble_sort(arr);
    }
}
