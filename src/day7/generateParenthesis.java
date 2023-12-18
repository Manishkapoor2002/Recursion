package day7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class generateParenthesis {

    public static void helpfN(int n,int open,int close,String paren,List<String> ans){

        if(n == open && open == close){
            ans.add(paren);
            return;
        }


        if (open<n){
//            put open bracket:
            helpfN(n,open+1,close,paren+'(',ans);
        }

        if(close<open){
//            put closes bracket:
            helpfN(n,open,close+1,paren+')',ans);

        }

    }
    public static List<String> generateParen(int n) {

        List<String> ans = new ArrayList<>();
        String paren = "";
        helpfN(n,0,0,paren,ans);
        return ans;


    }
    public static void main(String[] args) {
        int n = 2;

        System.out.println(generateParen(n));

    }
}