package day9;
import java.util.*;

public class nQueens {

    public static void helpFn(int[][] chess,int n,int col,int[] leftRow,int[] upprDia,int[] lowDia,List<List<String>> result){

        if (col == n){

            List<String> input = new ArrayList<>();
            for (int i  = 0;i<n;i++){
                StringBuilder temp = new StringBuilder();
                for (int j = 0;j<n;j++){
                    if (chess[i][j] == 0){
                        temp.append('.');
                    }else {
                        temp.append('Q');
                    }
                }
                input.add(temp.toString());
            }
            result.add(input);
            return;
        }

        for (int row = 0;row<n;row++){

            if (chess[row][col] == 0 && leftRow[row] == 0 && lowDia[row+col] ==0 && upprDia[(n-1) + (col-row)] == 0){
                chess[row][col] = 1;
                leftRow[row] = 1;
                lowDia[row+col] = 1;
                upprDia[(n-1) + (col-row)] = 1;
                helpFn(chess,n,col+1,leftRow,upprDia,lowDia,result);
                chess[row][col] = 0;
                leftRow[row] = 0;
                lowDia[row+col] = 0;
                upprDia[(n-1) + (col-row)] = 0;
                         }

        }

    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        List<String> cols = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        int[][] chess = new int[n][n];

//        for (int i = 0;i<n;i++){
//            s.append('.');
//        }
        s.append(".".repeat(Math.max(0, n)));

        for (int i = 0;i<n;i++){
            cols.add(s.toString());
        }
//        System.out.println(cols);
        int[] leftRow = new int[n];
        int[] upperDiagonal = new int[2*n-1];
        int[] lowerDiagonal = new int[2*n-1];
        helpFn(chess,n,0,leftRow,upperDiagonal,lowerDiagonal,result);
        return result;


    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solveNQueens(n));
    }
}