import java.util.*;
public class NQueens {
    public static List<List<String>>primary=new ArrayList<List<String>>();
    public static void main(String[] args) {
    int n=5;

    boolean[][] board=new boolean[n][n];
    System.out.println(queens(board,0,"",new ArrayList<>()));

        System.out.println(primary);
    }
    static int queens(boolean[][] board,int row,String str,List<String>list){
        if(row==board.length){
            primary.add(list);
            displayBoard(board);
            System.out.println();
            return 1;
        }
        int count=0;
        String toAdd=new String();
            for (int j=0;j<board.length;j++){

                if(isSafe(board, row,j)){
                    str+='Q';
                   board[row][j]=true;
                 count+= queens(board,row+1,str,list);
                   board[row][j]=false;
               }else{
                    str=str.substring(0,str.length()-1);
                }

        }list.add(str);
        return count;
    }
    static void displayBoard(boolean[][] board){
       for(boolean[]row:board){
           for(boolean element:row){
               if(element){
                   System.out.print("Q ");
               }else {
                   System.out.print(". ");
               }
           }
           System.out.println();
       }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //vertically
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        int maxLeft=Math.min(row,col);
        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        int maxRight=Math.min(row,board.length-1-col);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
}
