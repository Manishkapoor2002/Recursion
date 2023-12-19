package day8;
public class wordSearch {



    public static boolean helpFn(char[][] board, String word,int i ,int j,int idx,boolean ans){

        if(i<0 || i>= board.length || j<0 || j>= board[0].length || board[i][j] != word.charAt(idx)){
            return ans;
        }

        if (idx == word.length() - 1 ){
            return true;
        }

        char ch = board[i][j];
        board[i][j] = '!';

//        up:
        ans = helpFn(board,word,i-1,j,idx+1,ans);

//     down:
        ans = helpFn(board,word,i+1,j,idx+1,ans);

//    left:
        ans = helpFn(board,word,i,j-1,idx+1,ans);


//     right:
        ans = helpFn(board,word,i,j+1,idx+1,ans);


        board[i][j] = ch;

        return ans;

    }
    public static boolean exist(char[][] board, String word) {
        boolean ans = false;
        char c = word.charAt(0);
//        System.out.println(c);
        int n = 0;
        for(int i = 0;i<board.length;i++){
            for (int j = 0;j<board[0].length;j++){
                if (board[i][j] == c){
                    ans = helpFn(board,word,i,j,0,ans);
                    if (ans){
                        return true;
                    }
                }
            }
        }


        return ans;

    }
    public static void main(String[] args) {
        String find ="ABCCED";

        char[][] arr = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        System.out.println(exist(arr,find));

    }
}