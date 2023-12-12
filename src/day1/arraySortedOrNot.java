package day1;

public class arraySortedOrNot {

    public static boolean sortedOrNot(int[] nums,int n){
        if(n == 0 || n == 1){
            return true;
        }

        if(nums[0] >nums[1]){
            return false;
        }else{
            int[] subArray = new int[n-1];
            System.arraycopy(nums,1,subArray,0,n-1);
            return sortedOrNot(subArray,n-1);
        }

    }
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5,7,8,9,10};
        int n = arr.length;

        System.out.println(sortedOrNot(arr,n));
    }
}