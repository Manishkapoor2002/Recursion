package day1;

public class findPeak {

    public static int findIdx(int[] arr,int low,int high){

        int mid = (low+high)/2;
        if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
            return mid;
        }else if(arr[mid]<arr[mid-1]){
            return findIdx(arr,low,mid+1);
        }else{
            return findIdx(arr,mid,high);
        }

    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,4,1};
        int low = 0;
        int high = nums.length;
        int ans = findIdx(nums,low,high);
        System.out.println(ans);

    }
}