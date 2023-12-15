package day4;

public class quickSort {

    public static int partition(int[] nums,int low,int high){
       int pivot  = nums[low];

       int pivotIndex = low;

       for(int i = low+1;i<=high;i++){
           if(nums[i]<=pivot){
               pivotIndex++;
           }
       }

       int temp = nums[low];
       nums[low] = nums[pivotIndex];
       nums[pivotIndex] = temp;


       int i = low;
       int j = high;

       while (i<pivotIndex && j>pivotIndex){
           while (nums[i]<=nums[pivotIndex]){
               i++;
           }

           while (nums[j]>nums[pivotIndex]){
               j--;
           }

           if(i<pivotIndex && j>pivotIndex){
               int temp2 = nums[i];
               nums[i] = nums[j];
               nums[j] = temp;
               i++;
               j--;
           }

       }

            return pivotIndex;

    }

    public static void quick(int[] nums,int low,int high){
        if(low>=high)
            return;


        int p  = partition(nums,low,high);

        quick(nums,low,p-1);
        quick(nums,p+1,high);
    }

    public static void main(String[] args) {
        int[] arr = {6,9,5,3,4,92,8,8,26,3,98,26,9,26};
        int n = arr.length;
        quick(arr,0,n-1);
        for (int i : arr){
            System.out.print(i + "  ");
        }

    }
}