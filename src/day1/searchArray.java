package day1;

public class searchArray {
    public static int findIdx(int[] arr,int i,int key){


//        last index
//        i = i-1;
//        if(i == 0){
//            return -1;
//        }
//
//        if(arr[i] == key){
//            return i;
//        }else {
//            return findIdx(arr,i-1,key);
//        }



//        first Index:


        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }else {
            return findIdx(arr,i+1,key);
        }


    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,6,7,8,9,10,12};
        int ans = findIdx(arr,0,9);
        System.out.println(ans);
    }
}