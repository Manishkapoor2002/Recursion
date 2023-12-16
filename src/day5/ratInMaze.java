package day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.sort;

public class ratInMaze {

    public static List<String> result = new ArrayList<>();

    public static void ans(int[][] nums,int i,int j,String str){
        if(i == nums.length-1 && j == nums.length-1){
                result.add(str);
            return;
        }

        if(i< 0 || i>=nums.length || j< 0 || j>= nums.length || nums[i][j] == 0){
            return;
        }

        int temp = nums[i][j];
        nums[i][j] = 0;

//        top/UP:
        ans(nums,i-1,j,str + 'U');

//        right:
        ans(nums,i,j+1,str + 'R');
//        down:
//        str = add(str,'D');
        ans(nums,i+1,j,str + 'D');
//        remove(str)

//        left:
        ans(nums,i,j-1,str + 'L');


        nums[i][j] = temp;


    }
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                System.out.print(arr[i][j] + " , ");
            }
            System.out.println();
        }

        ans(arr,0,0,"");
        sort(result);
        System.out.println(result);



    }


}