package day1;

public class binarySearch {

    public static int findIdx(int[] nums,int key,int low,int high){
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;

        if(nums[mid] == key){
            return mid;
        }

        if(nums[mid]<key){
          return findIdx(nums,key,mid+1,high);
        }else {
            return findIdx(nums,key,low,mid-1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int key = 8;
        int low = 0;
        int high = nums.length-1;

        int ans = findIdx(nums,key,low,high);
        System.out.println(ans);
    }
}