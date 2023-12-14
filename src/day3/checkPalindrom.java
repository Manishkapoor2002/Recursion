package day3;
public class checkPalindrom {

    public static boolean check(String str,int low){
        if(str.length() == 1){
            return true;
        }
        if (low>str.length()-low-1){
            return true;
        }

        if (str.charAt(low) == str.charAt(str.length()-low -1)){
            return check(str,low+1);
        }else {
            return false;
        }

    }


    public static void main(String[] args) {

        String str  = "manish";
        System.out.println(check(str,0));
    }
}