package day5;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class permutation {

    public static int[] swap(int[] nums,int idx,int i){

        int[] arr = new int[nums.length];

        System.arraycopy(nums, 0, arr, 0, nums.length);
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;

        return arr;
    }

    public static void helpFn(int[] nums,int idx,List<List<Integer>> ans){
        List<Integer> output = new ArrayList<>();
        for (int i: nums){
            output.add(i);
        }

        if(idx >= nums.length-1){
            ans.add(output);
            return;
        }

        for(int i = idx;i<nums.length;i++){
            helpFn(swap(nums,idx,i),idx+1,ans);
        }
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
//        List<Integer> output = new ArrayList<>();
//        for (int i: nums){
//            output.add(i);
//        }

        helpFn(nums,0,ans);
        System.out.println(ans);

    }
}