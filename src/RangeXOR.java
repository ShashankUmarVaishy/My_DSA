public class RangeXOR {
    public static void main(String[] args) {
//range xor or a-b=xor(b)^xor(a-1)
        int a =3,b=9;
        System.out.println(XOR(b)^XOR(a-1));

    }
    //xor 0-a
    static int XOR(int a ){
        if(a%4==0){

            return a;
        }
        if(a%4==1){
            return 1;
        }
        if(a%4==2){
            return a+1;
        }
        if(a%4==3){
            return 0;
        }
        return -1;
    }
}
