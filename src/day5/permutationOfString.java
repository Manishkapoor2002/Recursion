package day5;

import java.util.ArrayList;

public class permutationOfString {

    public static String swap(String str,int i,int j){
        char[] chars = new char[str.length()];
        for (int k = 0;k<str.length();k++){
            chars[k] = str.charAt(k);
        }

        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;

        StringBuilder s = new StringBuilder();

        for (char c : chars){
            s.append(c);
        }

        return s.toString();

    }

    public static void helpFn(String str,int idx,ArrayList<String> list){
        if(idx >= str.length()-1){
            list.add(str);
            return;
        }

        for (int i = idx;i<str.length();i++){
                helpFn(swap(str,idx,i),idx+1,list);
        }

    }
    public static void main(String[] args) {
        String str = "asdf";
        int idx = 0;
        String ans = "";
        ArrayList<String> list = new ArrayList<>();
        helpFn(str,idx,list);

        System.out.println(list);

    }
}