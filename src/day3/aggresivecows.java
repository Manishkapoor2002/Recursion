package day3;

import java.util.Arrays;

public class aggresivecows {

    public static boolean isPossible(int[] nums,int mid,int k){
        int cowCount = 1;
        int lastPosition  = nums[0];
        for (int i = 1;i<nums.length;i++){
            if(nums[i] - lastPosition >=mid){
                cowCount++;
                lastPosition = nums[i];
            }

            if(cowCount == k){
                return true;
            }
        }
        return false;
    }


    public static int helpFn(int[] stalls,int k,int low,int high){


        if(low>high){
            return high;
        }


        int mid = (low+high)/2;

        if(isPossible(stalls,mid,k)){
            return helpFn(stalls,k,mid+1,high);
        }else {
            return helpFn(stalls,k,low,mid-1);
        }

    }


    public static int aggressiveCows(int []stalls, int k) {

        if(k>stalls.length){
            return -1;
        }

        Arrays.sort(stalls);

        int low = 0;
        int high = stalls[stalls.length-1];
        int ans = -1;


        return helpFn(stalls,k,low,high);

//        while (low<=high){
//            int mid = (low+high)/2;
//            if(isPossible(stalls,mid,k)){
//                ans = mid;
//                low = mid+1;
//            }else{
//                high = mid-1;
//            }
//        }
//
//        return ans;

    }
    public static void main(String[] args) {

        int[] arr = {4,2,1,3,6};
        int k = 3;
        int ans =aggressiveCows(arr,k);
        System.out.println(ans);

    }
}