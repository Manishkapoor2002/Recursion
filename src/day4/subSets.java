package day4;

import java.util.ArrayList;
import java.util.List;

public class subSets {



        public static void solve(int[] nums,int idx,List<Integer> list,List<List<Integer>> result){
            if(idx == nums.length){
                result.add(new ArrayList<>(list));
                return;
            }

    //        exclusive::
            solve(nums,idx+1,new ArrayList<>(list),result);

    //        inclusive:
            int element  = nums[idx];
            list.add(element);
            solve(nums,idx+1,new ArrayList<>(list),result);
            list.remove(list.size()-1);
        }


    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<Integer> list1 = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        solve(arr,0,list1,result);

        System.out.println(result);
        solve(new int[]{2, 3, 4, 5},0,list1,result);
        System.out.println(result);

    }


}