import java.util.Arrays;

public class countSort {
   public static void cs(int[] arr){
       if(arr.length == 0) return;
       int largest=arr[0];
       for(int i=1;i<arr.length;i++){
           if(arr[i]>largest){
               largest=arr[i];
           }
       }
       int [] countArr =new int[largest+1];
       for(int num:arr){
           countArr[num]++;
       }
       int index=0;
       for(int i=0;i<largest;i++){
           while(countArr[i]>0){
               arr[index++]=i;
               countArr[i]--;
           }
       }
   }
    public static void main(String[] args) {
    int[] arr={1,34,56,43,2,1,90,87,65,59};
    cs(arr);
        System.out.println(Arrays.toString(arr));
    }
}
