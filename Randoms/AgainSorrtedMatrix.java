public class AgainSorrtedMatrix {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
    }
    //searching in the provided row between the cols provided 
    static int[] binarySearch(int[][] matrix,int row,int colStart,int colEnd, int target){
        while(colStart<=colEnd){
          int mid=colStart+(colEnd-colStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                colStart=mid+1;
            }else{
                colEnd=mid-1;
            }
        }
        return new int[]{-1,-1};

    }
    static int[] search(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;//becautious matrix maybe empty
        //edge case
        if(rows==1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }
        int rowStart=0;
        int rowEnd=rows-1;
        int cMid=cols/2;
        //run till 2 rows are remaining rowStart=rowEnd-1
        while(rowEnd-rowStart>1){
            int rmid=rowStart+(rowEnd-rowStart)/2;


        }
    }
}
