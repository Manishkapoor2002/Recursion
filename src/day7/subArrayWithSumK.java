package day7;

import java.util.ArrayList;
import java.util.*;

public class subArrayWithSumK {

    public static void helpFn(int[] nums,int idx,List<Integer> input,List<List<Integer>> ans,long k){
        if(idx == nums.length){
            return;
        }
        long currSum = 0;
        for (int i = idx;i< nums.length;i++){
            currSum += nums[i];
            input.add(nums[i]);
//            System.out.println(input);
            if(currSum == k){
                ans.add(new ArrayList<>(input));
            break;
            }else if (currSum>k){
                break;
            }
        }

        helpFn(nums,idx+1,new ArrayList<>(),ans,k);
    }

    public static List< List < Integer > > subarraysWithSumK(int []a, long k) {
        List< List < Integer > > ans = new ArrayList<>();
        List<Integer> input = new ArrayList<>();
        int idx = 0;
        helpFn(a,0,input,ans,k);
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,1,1,1};
        long k = 3;
        System.out.println(subarraysWithSumK(a,k));


    }
}