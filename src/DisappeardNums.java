import java.util.*;
public class DisappeardNums {


    public static List<Integer> findDisappearedNumbers(int[] nums){
        //sort num
        List<Integer>list=new ArrayList<>(nums.length);

        int i=0;
        while(i<nums.length){
            int corrIdx=nums[i]-1;
            if(nums[i]==nums[corrIdx]){
                i++;
            }else{

                int temp=nums[corrIdx];
                nums[corrIdx]=nums[i];
                nums[i]=temp;
                System.out.println(Arrays.toString(nums));
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=(i+1)){
                list.add(i+1);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{1,1}));
    }

}
