package day2;

import java.util.ArrayList;

public class paintersPartition {
    public static boolean isPossible(ArrayList<Integer> nums,int mid,int k){

        int paintDone = 0;
        int Painters= 1;

        for(int i : nums){
            if(paintDone + i <= mid){
                paintDone += i;
            }else{
                Painters++;
                if(Painters>k || mid<i){
                    return false;
                }
                paintDone = i;
            }
        }


        return true;
    }

    public static int helpFn(ArrayList<Integer> nums,int low,int high,int k){
        if(low>high){
            return low;
        }

        int mid = (low+high)/2;

        if(isPossible(nums,mid,k)){
            return helpFn(nums,low,mid-1,k);
        }else{
            return helpFn(nums,mid+1,high,k);
        }

    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {

        if(k>boards.size()){
            return -1;
        }
        int low = 0;
        int high = 0;

        for(int i: boards){
            high += i;
        }

        return helpFn(boards,low,high,k);

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
//        list.add(6);
//        list.add(2);
//        list.add(3);
        int k = 2;

        int ans = findLargestMinDistance(list,k);
        System.out.println(ans);

    }
}