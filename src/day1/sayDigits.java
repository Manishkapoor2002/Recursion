package day1;

public class sayDigits {

    public static String sayDigits(int n ){

        if(n == 0){
            return "" ;
        }
        String curr  = "";

        int num = n % 10;

        if(num == 0){
            curr = "Zero";
        }else if( num == 1){
            curr = "One";
        }else if( num == 2){
            curr = "Two";
        } else if (num == 3) {
            curr = "Three";
        }else if(num ==4){
            curr = "Four";
        }else if(num ==5){
            curr = "Five";
        }else if(num ==6){
            curr = "Six";
        }else if(num == 7){
            curr = "Seven";
        }else if(num ==8){
            curr = "Eight";
        }else if(num ==9){
            curr = "Nine";
        }


        return  sayDigits(n/10) +" "+ curr ;

    }

    public static void main(String[] args) {
        int n = 100;
        String ans= sayDigits(n);
        System.out.println(ans);
    }
}