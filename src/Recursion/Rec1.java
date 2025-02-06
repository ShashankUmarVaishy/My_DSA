package Recursion;

import jdk.jfr.consumer.RecordedEvent;

public class Rec1 {
    public static void main(String[] args) {


        System.out.println(count(1020304050,0));
    }
    static long factorial(int n){
        if(n==0||n==1){
            return n;
        }
        return n*factorial(n-1);
    }
    static int SumTillN(int n){
        if(n<=1){
            return n;
        }
        return n+SumTillN(n-1);
    }
    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumOfDigits(n/10);
    }
    static long DigitProduct(int n){
//        if(n<=9){
//            return n ;
//        }
        if(n%10==n){
            return n;
        }
        return (n%10)*DigitProduct(n/10);
    }
    static int revNumbewr(int n,int ans) {
        //1234
        if(n==0){
            return ans;
        }else{
            return revNumbewr(n/10,(10*ans)+n%10);
        }


    }
    static int count(int n,int zeroes){
     if(n==0){
         return zeroes;
     }else{
         if(n%10==0){
             zeroes++;
         }
        return count(n/10,zeroes);
     }
  }
}
