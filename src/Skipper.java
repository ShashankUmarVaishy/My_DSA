public class Skipper {
    public static void main(String[] args) {
        String mainStr="appleHajjiAppleapples";
        String ans=answer(mainStr,"");
        System.out.println(ans);
    }
    static String answer(String mainStr,String str){
        if(mainStr.length()==0){
            return str;
        }
        else if(mainStr.startsWith("apple")){
            return answer(mainStr.substring(5),str);
        }else{
            return answer(mainStr.substring(1),str+mainStr.charAt(0));
        }
    }
}

