package day1;

public class power {

    public static int power(int n ,int m){
        if( m == 1){
            return n;
        }


        return n * (power(n,m-1));


    }
    public static void main(String[] args) {
        int n = 3;
        int m = 5;
        int ans  = power(n,m);
        System.out.println(ans);
    }

//    n^m
}