package day6;
public class countGoodNumber {


    public static long pow(int num,long x){
        if (x == 0) {
            return 1;
        }
        if (x == 1) {
            return num;
        }

        long ans = pow(num, x / 2);
        ans *= ans;
        if (x % 2 != 0) {
            ans = (num * ans);
        }

        return ans % 1_000_000_007;
    }



    public static void main(String[] args) {
        long n = 51;

        long oddPlace = (n/2);
        long evenPlace =  n/2 + n%2;

        long even = pow(5,evenPlace);
        long odd  = pow(4,oddPlace);
//        System.out.println(even);
//        System.out.println(odd);
//        System.out.println(evenPlace);
//        System.out.println(oddPlace);

        long e = (even * odd);
        int ans = (int )(e%1_000_000_007);
        System.out.println(ans);





    }


}