public class binary_sort{
    public static void main(String[] args) {
        int[]arr={0,1,2,3,4,5,6,7,8,9,10};
        int start=0;
        int end=arr.length-1;
        int target=6;
        boolean found=false;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                found=true;
                System.out.println("found at "+mid);
                break;
            }else if (arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }if(!found){
            System.out.println("Not Found");
        }
    }
}
