package day4;

import java.util.ArrayList;

public class subSequence {

    public static void sequence(String str,int idx,ArrayList<String > list,String temp){

        if(idx>=str.length()){
            if(!temp.isEmpty()){
                list.add(temp);
            }
            return;
        }

//        exclusive:
        sequence(str,idx+1,list,temp);

//        inclusive:
        char ch =str.charAt(idx);
        temp += ch;
        sequence(str,idx+1,list,temp);



    }
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> list = new ArrayList<>();
        String temp  = "";

        sequence(str,0,list,temp);

        System.out.println(list);

    }
}