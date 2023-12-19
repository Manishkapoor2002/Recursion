package day8;
public class subsetSumExist {

    public static boolean helpFn(int[] nums,int len,int tar,int idx,int currSum,boolean ans){
        if (idx == len){
            if (currSum == tar){
                return true;
            }else {
                return ans;
            }
        }


        if (currSum + nums[idx] == tar){
            System.out.println("1111");
            return true;
        }

        if (currSum + nums[idx]<=tar && !ans){
//            System.out.print(currSum);
//            take:
                ans =  helpFn(nums,len,tar,idx+1,currSum+nums[idx],ans);


        }

//            not take:
    return helpFn(nums,len,tar,idx+1,currSum,ans);

    }


    public static boolean isSubsetPresent(int n, int tar,int []a) {
        boolean ans = false;
        return helpFn(a,n,tar,0,0,ans);

    }
    public static void main(String[] args) {
        int[] arr = {42 ,46, 43, 28, 37, 42, 5, 3, 4};
        int n = arr.length;
        int tar = 3;
        boolean ans = isSubsetPresent(n,tar,arr);
        System.out.println(ans);

    }
}