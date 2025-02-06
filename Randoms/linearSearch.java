public class linearSearch {
    static int MAxWealth(int[][]info){
        int aadmiIndex=0;
        int ameerAadmiKaDhan=Integer.MIN_VALUE;
        for (int i = 0; i < info.length; i++) {
            int dhan=0;
            for (int j = 0; j<info[i].length; j++) {
             dhan+=info[i][j];
            }
            if(dhan>ameerAadmiKaDhan){
                ameerAadmiKaDhan=dhan;
                aadmiIndex=i;
            }
        }
        return ameerAadmiKaDhan;
}
public static void main(String[] args) {
    int[][]info={
        {1,2,3},
        {3,2,1},
        {4,5,6}
    };
   System.out.println( MAxWealth(info));
}
}
