package day1;

public class sumOfArray {

    public static int sumArray(int[] arr,int size){

        if(arr.length == 1){
            return arr[0];
        }
        if(size == 0){
            return arr[0];
        }

        return arr[size] + sumArray(arr,size-1);
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0};
        int size = arr.length;
        int ans = sumArray(arr,size-1);
        System.out.println(ans);
    }
}