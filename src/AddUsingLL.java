import java.util.*;
public class AddUsingLL {

    public static void main(String[] args) {
        int[]coeff1={1,3,4};
        int[]coeff2={2,5,6};
        LinkedList<Integer> px1=new LinkedList<>();
        LinkedList<Integer> px2=new LinkedList<>();
        for (int k : coeff1) {
            px1.add(k);
        }
        for (int j : coeff2) {
            px2.add(j);
        }
        LinkedList<Integer> ans=new LinkedList<>();
       for(int i=0;i<px1.size();i++){
           int sum=px1.get(i)+px2.get(i);
           ans.add(sum);
       }
       System.out.println(ans);
    }

}
