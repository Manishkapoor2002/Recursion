package day8;

import java.util.*;
public class combinationSum2 {




    public static void helpFn(int[] nums,int idx,int tar,List<Integer> input,List<List<Integer>> ans){


        if(idx == nums.length){

            if (tar == 0){
                ans.add(new ArrayList<>(input));
            }
            return;
        }

        if (tar == 0){
            ans.add(new ArrayList<>(input));
            return;
        }



        for (int i = idx;i<nums.length;i++){

            if(i>idx && nums[i] == nums[i-1]){
               continue;
            }
            if (tar<nums[i]) {
                break;
            }


                input.add(nums[i]);
                helpFn(nums,i+1,tar-nums[i],input,ans);
                input.remove(input.size()-1);



        }


    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);

        helpFn(candidates,0,target,new ArrayList<>(),ans);
        return ans;


    }
    public static void main(String[] args) {
        int[] arr ={1,2,1,1,2};
        int tar = 4;
        System.out.print(combinationSum2(arr,tar));
    }
}