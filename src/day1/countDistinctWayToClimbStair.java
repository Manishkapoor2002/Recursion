package day1;

public class countDistinctWayToClimbStair {
    public static int count(int n ){

        int ways = 0;


        if(n == 0){
            return 1;
        }else if(n <0){
            return 0;
        }

        ways += (count(n-1) + count(n-2));
        return  ways;
    }
    public static void main(String[] args) {
        System.out.print(count(20));
    }
}
