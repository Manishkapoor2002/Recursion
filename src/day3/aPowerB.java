package day3;
public class aPowerB {

    public static long power(int a,int b){
        if(b == 0){
            return 1;
        }
        if(b==1){
            return a;
        }
        long ans  = power(a,b/2);

       if(b%2==0){
           return ans * ans;
       }else{
           return (a * ans * ans);
       }


    }
    public static void main(String[] args) {
        int a = 2;
        int b = 10;

        long ans = power(a,b);
        System.out.println(ans);
    }
}