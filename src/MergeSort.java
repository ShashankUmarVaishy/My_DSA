import java.util.Arrays;

public class MergeSort {

    static void merge(int[]arr,int start,int mid,int end){
        int[] newArr=new int[end-start+1];
        int size1=mid-start+1;
        int size2=end-mid;
        int i=0,j=0,k=0;
        while (i<size1 && j<size2) {
            if(arr[start+i]<arr[mid+1+j]){
                newArr[k++]=arr[start+i++];
            }else{
                newArr[k++]=arr[mid+1+j++];
            }
        }
        if(i<size1){
            while(i<size1){
                newArr[k++]=arr[start+i++];
            }
        }else if(j<size2){
            while(j<size2){
                newArr[k++]=arr[mid+1+j++];
            }
        }

        for ( i = 0; i < end-start+1; i++) {
            arr[i+start]=newArr[i];
        }

    }
    static void divide(int[]arr,int start,int end){
        if(start==end){
            return;
        }
        int mid=start+(end-start)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
      merge(arr,start,mid,end);

    }
    public static void main(String[] args) {
        int[]arr={8,75,4,32,1,-12,-54,12,789,67};
        divide(arr,0,arr.length-1);

            System.out.print(Arrays.toString(arr));

    }
}
