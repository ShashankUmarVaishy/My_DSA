import java.util.*;

public class Subset {
//    public static void main(String[] args) {
//        set("abc","");
//        System.out.println(list.toString());
//    }
//    static ArrayList<String> list=new ArrayList<>();
//    static void set(String mainStr, String required){
//        if(mainStr==""){
//            if(required=="") list.add("ø");
//
//
//            else list.add(required);
//            return;
//        }
//        set(mainStr.substring(1),required);
//        set(mainStr.substring(1),required+mainStr.charAt(0));
//    }
public static void main(String[] args) {
    int[]arr={1,2,2,2,2,2};
    List<List<Integer>>list=sets(arr);
    System.out.println(list);
    }
     static List<List<Integer>> sets(int[]arr){
         Arrays.sort(arr);
         List<List<Integer>> outer=new ArrayList<>();
         outer.add(new ArrayList<>());
        int start=0,end=0;
         for (int i = 0; i <arr.length; i++) {
             start=0;
             //if curr is same as previous >>start=end+1
             if(i>0 && arr[i]==arr[i-1]){
                 start=end+1;
             }
             end=outer.size()-1;
             int size=outer.size();
             for (int j = start; j < size; j++) {
                 List<Integer> internal=new ArrayList<>(outer.get(j));

                 internal.add(arr[i]);
                 outer.add(internal);
             }
         }

    return outer;
     }
}
