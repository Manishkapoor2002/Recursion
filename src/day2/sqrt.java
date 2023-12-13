package day2;

import static java.lang.Math.round;

public class sqrt {


    public static double perfectSqtr(int num,int digit,int sqrtInt){
        double ans = sqrtInt;
        double factor = 1;

        for (int i = 0;i<digit;i++){
                factor = factor/10;

                for (double j = ans;j*j<num;j+=factor){
                    ans = j;
                }
        }

        return ans;
    }


    public static int helpFn(int x,int low,int high){
        if(low>high){
            return -1;
        }


            int mid = (low+high)/2;

            if(mid == x/mid){
                return mid;
            }else if(mid<x/mid){
                return helpFn(x,mid+1,high);
//                ans = mid;
//                low = mid+1;
            }else{
                return helpFn(x,low,mid-1);
            }

    }
    public static int sqtInt(int x){
        if(x==0){
            return 0;
        }

        return helpFn(x,1,x);

//        int low = 1;
//        int high =x;
//        int ans = -1;
//
//        while(low<=high){
//            int mid = (low+high)/2;
//            if(mid == x/mid){
//                return mid;
//            }else if(mid<x/mid){
//                ans = mid;
//                low = mid+1;
//            }else{
//                high = mid -1;
//            }
//        }

    }
    public static void main(String[] args) {

        int x = 5;
        int ans = sqtInt(x);

        double perfectAns = perfectSqtr(x,2,ans);
        System.out.println(perfectAns);

    }
}