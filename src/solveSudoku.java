public class solveSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        solver(board,0,0);
        for (char[] chars : board) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();

        }



    }
    static char[][] solver(char[][] board,int row,int col) {
        if(row==board.length-1 && col==board.length){
            return board;
        }

        if(col==board.length){
            solver(board,row+1,col);
            return board;
        }

        if(board[row][col]=='.'){

            for(int i=1;i<10;i++){
                char ch=(char)('0'+i);
                if(isSafe(board,row,col,ch)){
                    board[row][col]=ch;
                    solver(board,row,col+1);
                    board[row][col]='.';
                }
            }
        }
        return board;
    }

    public static boolean isSafe(char[][] board, int row, int col, char ch) {
        for(int i=0;i<board.length;i++){
            if(board[row][i]==ch || board[i][col]==ch){

                return false;
            }
        }
        int rowStart=row-(row%3);
        int colStart=col-(col%3);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[rowStart+i][colStart+j]==ch){
                    return false;
                }
            }
        }return true;
    }
}
