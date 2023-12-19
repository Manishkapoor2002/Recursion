package day8;
import java.util.*;
public class subsetSum1 {
    public static void helpFn(int[] nums,int idx,int currSum,ArrayList<Integer> list){
        if (idx == nums.length){
            list.add(currSum);
            return;
        }

// taking the idx number:
    helpFn(nums,idx+1,currSum+nums[idx],list);
//  Not taking the idx number:
    helpFn(nums,idx+1,currSum,list);



    }

    public static ArrayList<Integer> subsetSum(int num[]) {
    ArrayList<Integer> list = new ArrayList<>();
    helpFn(num,0,0,list);
    Collections.sort(list);

    return list;

    }
    public static void main(String[] args) {

        int[] arr = {1,2};
        System.out.println(subsetSum(arr));
    }
}