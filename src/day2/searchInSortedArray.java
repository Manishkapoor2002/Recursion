package day2;

public class searchInSortedArray {

    public static int helpFn(int[] nums,int low,int high,int target){
        if(low>high){
            return -1;
        }

        int mid = (low+high)/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]>=nums[low]){

            if(target<nums[mid] &&target>=nums[low]){
                return helpFn(nums,low,mid-1,target);
            }else{
                return helpFn(nums,mid+1,high,target);
            }
        }else {
            if(target>nums[mid] &&target<=nums[high]){
                return helpFn(nums,mid+1,high,target);
            }else {
                return helpFn(nums,low,mid-1,target);
            }
        }


    }


//    5 , 1 -> target= 5

    public static int search(int[] nums, int target) {


        return helpFn(nums,0,nums.length-1,target);


//        int low = 0;
//        int high = nums.length-1;
//
//        while(low<=high){
//            int mid = (low+high)/2;
//            if(nums[mid] == target){
//                return mid;
//            }else if(nums[mid]>=nums[low]){
//
//                if(target<nums[mid] &&target>=nums[low]){
//                    high = mid-1;
//                }else{
//                    low = mid+1;
//                }
//            }else {
//                if(target>nums[mid] &&target<=nums[high]){
//                    low = mid+1;
//                }else {
//                    high = mid-1;
//                }
//            }
//        }
//
//        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 2;

    int ans = search(arr,target);
        System.out.println(ans);
    }
}