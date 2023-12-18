package day7;
import java.util.ArrayList;
import java.util.*;
public  class combinationSum {

    public static void helpFn(int[] nums,int idx,int tar,List<Integer> input,List<List<Integer>> ans){

        if (idx == nums.length){
            if(tar == 0){
                ans.add(new ArrayList<>(input));
            }
            return;
        }
        

//        stay on the same idx:

        if(tar>=nums[idx]){
            input.add(nums[idx]);
            helpFn(nums,idx,tar-nums[idx],input,ans);
            input.remove(input.size()-1);
        }

//        go to the next index:
        helpFn(nums,idx+1,tar,input,ans);


//        if (idx == nums.length) {
//            return;
//        }
//
////        stay on the same index:
//        if ((currCount + nums[idx]) < tar){
//            input.add(nums[idx]);
//            helpFn(nums,idx,tar,currCount+nums[idx],input,ans);
//            input.remove(input.size()-1);
//        }
//
//
////go to next idx:
//        helpFn(nums,idx+1,tar,currCount,input,ans);
//
//
//
//    if(currCount + nums[idx] == tar){
//        input.add(nums[idx]);
//        ans.add(new ArrayList<>(input));
//        input.remove(input.size()-1);
//        return;
//    }

    }


    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> input  = new ArrayList<>();
            helpFn(candidates,0,target,input,ans);
            return ans;


    }
    public static void main(String[] args) {

        int[] nums = {2,3,6,7};
        int tar = 7;
        System.out.println(combinationSum(nums,tar));

    }
}