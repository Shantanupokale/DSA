package array;

public class Solution {
        static int evenlyDivides(int N){
           int nor = N;
           int count = 0 ;
           while(N>0){
               int digit = N%10;
               if (digit !=0 && nor%digit == 0){
                   count++;
               }
               N /= 10;
           }
            return count;
        }
        public static void main(String[] args) {
            System.out.println(evenlyDivides(1012));
        }
    }

