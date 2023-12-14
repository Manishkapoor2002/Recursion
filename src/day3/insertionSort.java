package day3;
public class insertionSort {
    public static void insertion(int[] nums,int i){

            int n = nums.length;
            if(n == 1){
                return;
            }

            if(i == n){
                return;
            }


            int j = i;
            while (j>=1 && nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;

                    j--;
            }

        insertion(nums,i+1);

    }
    public static void main(String[] args) {
        int[] arr = {9,5,2,7,-4,9,1,3};
        int n = arr.length;
        insertion(arr,1);
        for (int i : arr){
            System.out.print(i + " , ");
        }
    }
}