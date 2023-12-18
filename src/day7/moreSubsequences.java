//Not optimised ,becuase to clear all test case DP required!!!



package day7;

import java.util.HashSet;

public class moreSubsequences {

    static HashSet<String> hSet = new HashSet<>();
    public static void countHelpFn(String str,int idx,int n,String ans){
        if(idx == n){
            hSet.add(ans);
            return;
        }

//        include:
            countHelpFn(str,idx+1,n,ans + str.charAt(idx));

//        exclude:
            countHelpFn(str,idx+1,n,ans);


    }
    public static String moreSubsequence(int n, int m, String a, String b) {
        countHelpFn(a,0,n,"");
        int countS1 = hSet.size();
        hSet.clear();
        countHelpFn(b,0,m,"");
        int countS2 = hSet.size();

        if(countS1>= countS2){
            return a;
        }else {
            return b;
        }

    }
    public static void main(String[] args) {
        String s1 = "abcaaaavvvv";
        String s2 = "aaaaabbbbbbbbbaaaaa";
        int n = s1.length();
        int m = s2.length();
        String ans = moreSubsequence(n,m,s1,s2);
        System.out.println(ans);


    }
}