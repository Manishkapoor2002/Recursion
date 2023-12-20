//Not yet completed,DP required (TLE)

package day9;
import java.util.*;
public class wordBreak {

    public static boolean helpFn(String s,List<String> wordDict,String newString,int i,boolean ans){

        if (i > s.length()){
            return false;
        }

        for (int k =0;k<i;k++){
            if (s.charAt(k) != newString.charAt(k)){
                return false;
            }
        }

        if (i == s.length()){
            return true;
        }



        for (int j = 0;j<wordDict.size();j++){
            String temp = wordDict.get(j);
            int n = temp.length();
           ans =  helpFn(s,wordDict,newString + temp,i+n,ans);
           if (ans){
               break;
           }
        }

        return ans;
    }

    public static boolean wordBreak(String s, List<String> wordDict) {

        boolean ans = false;
        wordDict.sort(Collections.reverseOrder());
        System.out.println(wordDict);


        return helpFn(s,wordDict,"",0,ans);


    }
    public static void main(String[] args) {

        String str = "aaaaaaa";
        List<String> dict = Arrays.asList("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa");
        System.out.println(wordBreak(str,dict));


    }
}