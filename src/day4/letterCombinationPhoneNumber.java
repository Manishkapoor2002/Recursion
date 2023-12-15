package day4;

import java.util.ArrayList;
import java.util.List;

public class letterCombinationPhoneNumber {
    public static String[] arr = {" ", " " ,"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static String resetString(String str){
        int n =str.length()-1;
        StringBuilder s = new StringBuilder();
        for (int i = 0;i<n;i++){
            s.append(str.charAt(i));
        }

        return s.toString();
    }
    public static void solve(String str,int idx,String ans,List<String> list){
    if(idx >= str.length()){
        list.add(ans);
        return;
    }
    int currIdx = str.charAt(idx);
    String currStr = arr[currIdx - 48];
    for (int i = 0;i<currStr.length();i++){
        char ch = currStr.charAt(i);
        ans+=ch;
        solve(str,idx+1,ans,list);
        StringBuilder temp = new StringBuilder();
        ans = resetString(ans);
    }

    }

    public static void main(String[] args) {
        String str = "23";
        String ans = "";
        List<String> list = new ArrayList<>();
        solve(str,0,ans,list);
//        System.out.println(arr.length);
        System.out.println(list);
    }
}