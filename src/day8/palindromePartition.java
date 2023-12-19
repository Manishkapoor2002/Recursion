package day8;
import java.util.*;
public class palindromePartition {


    public static String subString(String str,int i ,int j){
        StringBuilder s = new StringBuilder();
        for (int k=i;k<=j;k++){
            s.append(str.charAt(k));
        }
        return s.toString();
    }


    public static boolean isPalindromeOrNot(String str,int i ,int j){
        int low = i;
        int high = j;
        while (low<=high){
            if (str.charAt(low) != str.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public static void helpFn(String str,int idx,List<String> input,List<List<String>> result){
        if (idx == str.length()){
            result.add(new ArrayList<>(input));
            return;

        }

            for (int i = idx;i<str.length();i++){
                    if (isPalindromeOrNot(str,idx,i)){
                        input.add(subString(str,idx,i));
                        helpFn(str,i+1,input,result);
                        input.remove(input.size()-1);
                    }
        }


    }
    public static List<List<String>> partition(String s) {
    List<List<String>> result = new ArrayList<>();
        helpFn(s,0,new ArrayList<>(),result);
        return result;
    }
    public static void main(String[] args) {

        String s = "aabb";
        System.out.println(partition(s));

    }
}