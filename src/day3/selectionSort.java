package day3;
public class selectionSort {

    private static void selection(int[] nums,int i){
        if(i == nums.length){
            return;
        }

        for (int j = i+1;j<nums.length;j++){
            if(nums[i]>nums[j]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        selection(nums,i+1);

    }
    public static void main(String[] args) {
        int[] arr = {9,5,2,7,4,9,1,3};
        int n = arr.length;
        System.out.println("Before Sort");
        for (int i : arr){
            System.out.print(i +" , ");
        }

        selection(arr,0);

        System.out.println("After Sort");
        for (int i : arr){
            System.out.print(i + ", ");
        }
    }
}