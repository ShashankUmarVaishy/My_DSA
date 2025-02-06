public class BitWise {
    public static void main(String[] args) {
        int n=5,magicNum=0,base=5;
        while(n>0){
            int lastDigit=n&1;
            magicNum+=lastDigit*base;
            n=n>>1;
            base*=5;
        }
        System.out.println(magicNum);
    }
}
