package day9;
public class sudokuSolver {

    public static boolean check(char[][] board,int i,int j,char num){
        int row = i;
        int col = j;

//        checking the row:
        for (int k = 0;k<board.length;k++){
            if (board[i][k] == (num)){
                return false;
            }
            if (board[k][j] == (num)){
                return false;
            }
        }
//        checking the col:

//        for (int k = 0;k<board.length;k++){
//            if (board[k][j] == (num)){
//                return false;
//            }
//        }

//        checking in its 3X3 matrix:
        int idx = (i/3) * 3 ;
        int jdx = (j/3) * 3;

        for (int k = idx;k<(idx+3);k++){
            for (int l = jdx;l<(jdx+3);l++){
                if (board[k][l] == (num)){
                    return false;
                }
            }
        }
//        after all checkpoint :
        return true;

    }




    public static boolean solveSudoku(char[][] board) {
        for (int k = 0;k<board.length;k++){
            for (int l = 0;l<board.length;l++){
                if (board[k][l] == '.'){
                    for (char h = '1';h<='9';h++){
                        if (check(board,k,l,h)){
                            board[k][l] = h;
                            if(solveSudoku(board)){
                                return true;
                            }else {
                                board[k][l] ='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }

    return true;

    }
    public static void main(String[] args) {
        char[][] arr ={
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}
        };



        for (int i = 0;i< arr.length;i++){
            for (int j = 0;j< arr.length;j++){
                System.out.print(arr[i][j] + " ,");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        boolean ans = solveSudoku(arr);

        for (int i = 0;i< arr.length;i++){
            for (int j = 0;j< arr.length;j++){
                System.out.print(arr[i][j] + " ,");
            }
            System.out.println();
        }


    }
}