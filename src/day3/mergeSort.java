package day3;

import java.util.ArrayList;

public class mergeSort {

    public static void merge(int[] nums,int low,int mid,int high){

        ArrayList<Integer> list = new ArrayList<>();
        int i = low;
        int j = mid+1;
        while (i<=mid && j<=high){
            if(nums[i]<=nums[j]){
                list.add(nums[i]);
                i++;
            }else {
                list.add(nums[j]);
                j++;
            }
        }

        while(i<=mid){
            list.add(nums[i]);
            i++;
        }

        while(j<=high){
            list.add(nums[j]);
            j++;
        }
        int k = low;
        for (int integer : list) {
            nums[k] = integer;
            k++;
        }

    }
    public static void mSort(int[] nums,int low,int high){

        if(low>=high){
            return;
        }

        int mid = (low+high)/2;

       mSort(nums,low,mid);
       mSort(nums,mid+1,high);

       merge(nums,low,mid,high);


    }
    public static void main(String[] args) {
        int[] arr = {9,5,2,7,4,9,1,3};
        int n = arr.length-1;
        mSort(arr,0,n);

        for (int i: arr){
            System.out.print(i +" , ");
        }

    }
}

//T>C -> O(n * log n)
//S.P->O(n)