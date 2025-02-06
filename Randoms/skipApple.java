

public class skipApple {
    public static void main(String[] args) {
        String mainStr="applehaiji AappleHai";
        //StringBuilder required=new StringBuilder();
        skipper(mainStr, "");

    }
    public static void skipper(String mainStr,String required){
        if(mainStr==""){
            System.out.println(required);
            return;
        }
        if(mainStr.startsWith("apple")){
            skipper(mainStr.substring(5), required);
        }else{
            skipper(mainStr.substring(1), required+mainStr.charAt(0));
        }
    }
}
