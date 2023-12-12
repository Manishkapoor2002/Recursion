package day1;

public class factorial {

    public static int fact(int n){

       if(n ==1)
           return 1;

        return n * (fact(n-1));
    }
    public static void main(String[] args) {
        int factVal = 5;

//        System.out.println(fact(factVal));
        print(8);
    }
    public static void print(int n ){
        for(int i = 2;i<n;i++){
            System.out.println(fact(i));
        }
    }

}