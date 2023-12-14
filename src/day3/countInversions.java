package day3;

import java.util.ArrayList;

public class countInversions {
    static long inCount = 0;
    public static void mergeCount(long[] nums,int low,int mid,int high){

        ArrayList<Long> list = new ArrayList<>();
        int i = low;
        int j = mid+1;
//        long inCount = 0;

        while(i<=mid && j<=high){
            if(nums[i]<=nums[j]){
                list.add(nums[i]);
                i++;
            }else{
                System.out.println(nums[i] +" <->" +nums[j] + " -->" + (mid-low+1));
                inCount += (mid-i+1);
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
        int idx = low;

        for(long li :list){
            nums[idx] = li;
            idx++;
        }

    }



    public static void count(long[] nums,int low,int high){
        if(low>=high){
            return;
        }

        long ans = 0;


        int mid =(low+high)/2;

        count(nums,low,mid);
        count(nums,mid+1,high);
        mergeCount(nums,low,mid,high);

    }


    public static void main(String[] args) {
        long[] arr = {5,3,2,1,4};
        int n =arr.length;
        count(arr,0,n-1);
        System.out.println(inCount);


    }
}