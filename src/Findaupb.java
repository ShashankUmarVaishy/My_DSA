public class Findaupb {
    public static void main(String[] args) {
        int base=2,power=6,answer=1;
        while(power>0){
            int digit=power&1;
            power=power>>1;
            if(digit!=0){
                answer*=base;
            }
            base*=base;
        }
        System.out.println(answer);
    }
}
