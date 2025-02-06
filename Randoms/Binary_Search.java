public class Binary_Search {
    static int search(int[] arr,int startIdx,int endIdx,int target){
        if(arr==null){
            
            return -1;
        }
        System.out.println(startIdx+ " -> "+endIdx);
        int ans=-1;
        if(startIdx-endIdx>0){
           ans= -1;
        }else{
            int mid=startIdx+(endIdx-startIdx)/2;
            if(target>arr[mid]){
                ans= search(arr, mid+1, endIdx, target);
            }else if(target<arr[mid]){
                ans= search(arr, startIdx,mid-1, target);
            }else if(target==arr[mid]){
                return mid;
            }
        }
        
        return ans; 
    }
    public static void main(String[] args) {
        int[] arr={};
        
        System.out.println("Index is "+search(arr, 0, arr.length-1,1));                                                                     
    }
}
