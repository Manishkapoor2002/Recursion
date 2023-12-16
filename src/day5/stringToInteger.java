package day5;
public class stringToInteger {
    public static int helpFn(String str,int idx,int sign ,int ans){
        if(idx == str.length()) {
            return sign * ans;

        }

        int currNum = str.charAt(idx);
        if (currNum<48 || currNum>57 ){
            return sign * ans;
        }

        long num = ((long) ans*10) + (currNum-48);

        if (num > Integer.MAX_VALUE){
            return (sign == 1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
        return helpFn(str,idx+1,sign,(int)num);
    }
    public static void main(String[] args) {
        String s = "  -0012a42";
        s = s.trim();//it will remove all extra space from start unitl it reaches a character like:-  "   bs" -> "bs"

//        if(s.length() == 0){
//            return 0;
//        }
//        System.out.println(s.length());
        int sign = 1;
        int idx = 0;
        if (s.charAt(0) == '-'){
            sign = -1;
            idx++;
        } else if (s.charAt(0) == '+') {
            idx++;
        }

        int ans = helpFn(s,idx,sign,0);
        System.out.println(ans);

    }
}