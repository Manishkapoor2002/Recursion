package day1;

public class count {
    public static void Counting(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        Counting(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        int n = 10;
        Counting(n);
    }
}