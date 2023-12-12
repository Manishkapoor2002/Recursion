package day1;

import java.util.HashMap;

public class fibonacci {

    static HashMap<Integer,Integer> hm = new HashMap<>();
    public static int fib(int n){
        
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        return fib(n-1) + fib(n-2);

    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println("fibonaci number of " +n +" is : " + fib(n));
    }
}