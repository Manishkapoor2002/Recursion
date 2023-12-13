package day2;

import java.util.ArrayList;

public class allotmnetOfBooks {

    public static boolean isPossible(int[] nums,int mid,int noOfStudents){

        int pageCount = 0;
        int currStudent = 1;

        for(int i = 0;i<nums.length;i++){
            if(pageCount + nums[i] <= mid) {
                pageCount += nums[i];
            }else {
                currStudent++;
                if (currStudent>noOfStudents || nums[i]>mid){
                    return false;
                }
                pageCount = nums[i];
            }
        }
            return true;

    }



    public static int helpFn(int[] nums,int low,int high,int noOfStudents){
        if(low>high){
            return low;
        }
        int mid = (low+high)/2;

        if (isPossible(nums,mid,noOfStudents)){
            return helpFn(nums,low,mid-1,noOfStudents);
        }else {
            return helpFn(nums,mid+1,high,noOfStudents);
        }


    }

    public static int findMaxOfMin(int[] nums,int noOfStudents){
        if(noOfStudents>nums.length){
            return -1;
        }


        int low = Integer.MAX_VALUE;
        int high =0;
        int ans = -1;

        for (int i : nums){
            low = Math.min(low,i);
            high += i;
        }

        return helpFn(nums,low, high,noOfStudents);

////        System.out.println(low +"   = = = = =" + high   );
//
//        while (low<=high){
//            int mid = (low+high)/2;
//            if (isPossible(nums,mid,noOfStudents)){
//                ans = mid;
//                high = mid-1;
//            }else {
//                low = mid+1;
//            }
//        }
//
//        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        int n = 2;

        int ans = findMaxOfMin(arr,n);
        System.out.println(ans);
    }
}