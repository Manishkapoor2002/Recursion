package day7;

import java.util.ArrayList;
import java.util.List;

public class generateAllBinaries {

    public static void helpFn(int n,int idx,String binary,List<String> ans){
        if(idx == n){
            ans.add(binary);
            return;
        }

//        add zero:
            helpFn(n,idx+1,binary+'0',ans);

//        add one:
        if (idx == 0 || binary.charAt(binary.length()-1) !='1'){
            helpFn(n,idx+1,binary+'1',ans);
        }

    }

    public static List< String > generateString(int N) {
    List<String> ans = new ArrayList<>();
    String binary = "";
    helpFn(N,0,binary,ans);
    return ans;


    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(generateString(n));
    }
}