package day5;
public class powerXN {

    public static double helpFn(double x,int n){
        if (n == 0){
            return 1;
        }else if(n == 1){
            return x;
        }

        double ans = helpFn(x,n/2);

        if(n % 2 == 0){
            return ans * ans;
        }else {
            return x * ans * ans;
        }
    }
    public static void main(String[] args) {
        double x = 2.0000;
        int n  = 5;


        if(x == 0){
            return 0.00;
        } else if (n == 0) {
            return 1;

        }
        if(n < 0){
           double y = x * x;
            x = (x) * (1/y);
            n = n * -1;
        }

    double ans =helpFn(x,n);
        System.out.println(ans);

    }
}