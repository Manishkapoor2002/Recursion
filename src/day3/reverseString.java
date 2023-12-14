package day3;
public class reverseString {

    public static String subString(String str){
        StringBuilder newString = new StringBuilder();
        for(int i =1;i<str.length();i++){
            char ch = str.charAt(i);
            newString.append(ch);
        }

        return newString.toString();
    }
    public static String reverse(String str){
        if(str.isEmpty()){
            return "";
        }

//        String newString = "";
//        newString += str.charAt(0);
//        return reverse(subString(str)) + newString;
        return reverse(subString(str)) + str.charAt(0);

    }

    public static void main(String[] args) {
        String str = "abcde";
        String ans = reverse(str);
        System.out.println(ans);
    }
}