public class removeA{
   
    public static StringBuilder answer(String mainStr, StringBuilder required){
        if(mainStr==""){
            return required;
        }
        if(mainStr.charAt(0)!='a'){
            required.append(mainStr.charAt(0));
        }
        
       return answer(mainStr.substring(1), required);
    }
    public static void main(String[] args) {
        String mainStr="baccaha";
        StringBuilder required=new StringBuilder();
       System.out.println( answer(mainStr,required));
        
    }
    // public static void main(String[] args) {
    //     String mainStr="baccad";
    //     if(mainStr.length()!=0){
    //         System.out.println();
    //     }
    // }
}