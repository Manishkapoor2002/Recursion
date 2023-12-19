package day8;
import java.util.*;
public class subsetSum2 {

public static void helpFn(int[] nums,int idx,List<Integer> output,List<List<Integer>> ans){

        ans.add(new ArrayList<>(output));
    for (int i = idx;i<nums.length;i++){
        if(i>idx && nums[i] == nums[i-1]){
            continue;
        }
        output.add(nums[i]);
        helpFn(nums,i+1,output,ans);
        output.remove(output.size()-1);
    }



}
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        helpFn(nums,0,new ArrayList<>(),ans);

        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(subsetsWithDup(arr));

    }
}