package day3;
public class bubbleSort {
    public static void bubble(int[] nums,int n){


        if(n == 0 || n<0){
            return;
        }


        boolean swapOrNot = false;


            for (int i = 1;i<n;i++){
                if(nums[i]<nums[i-1]){

                    swapOrNot = true;
                    int temp = nums[i];
                    nums[i] = nums[i-1];
                    nums[i-1] = temp;
                }
            }

            if (!swapOrNot){
                return;
            }

    bubble(nums,n-1);

    }
    public static void main(String[] args) {
        int[] arr = {9,5,2,7,4,9,1,3};
        int n = arr.length;
        System.out.println("Before Sort");
        for (int i : arr){
            System.out.print(i +" , ");
        }

        bubble(arr,n);
        System.out.println("After Sort");
        for (int i : arr){
            System.out.print(i + ", ");
        }
    }
}