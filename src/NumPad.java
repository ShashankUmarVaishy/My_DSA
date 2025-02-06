import java.util.*;
public class NumPad {
    public static List<String> list=new ArrayList<>();
    public static void main(String[] args) {
    adder("","13");
        System.out.println(list);
    }
    static void adder(String p,String up){
        if(up.isEmpty()){
            if(!p.isEmpty()){
                list.add(p);
            }
            return;
        }else{
            int digit=up.charAt(0)-'0';

            String toAdd=map(digit);
            System.out.println(digit+">>"+toAdd);

           if(!toAdd.isEmpty()){
               for (int i = 0; i < toAdd.length(); i++) {
                   String newUP=up.substring(1);
                    adder(p+toAdd.charAt(i),newUP);
               }
           }
            adder(p,up.substring(1));
        }
    }
    static String map(int i){
        if(i==2){
            return new String("abc");
        }else if (i==3){
            return new String("def");
        }else if (i==4){
            return new String("ghi");
        }else if (i==5){
            return new String("jkl");
        }else if (i==6){
            return new String("mno");
        }else if (i==7){
            return new String("pqrs");
        }else if (i==8){
            return new String("tuv");
        }else if (i==9){
            return new String("wxyz");
        }else {
            return new String();
        }
    }
}
