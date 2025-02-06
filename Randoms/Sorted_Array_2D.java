

public class Sorted_Array_2D {
    public static void main(String[] args) {
        int[][] matrix={
            {10,20,30,40},
            {11,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        //implement finding
        int row=0;
        int col=matrix[0].length-1;
       
        int target=1;
        Boolean found=false;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]<target){
                //del row
                row++;
            }else if(matrix[row][col]>target){
                //del col
                col--;
            }else{
                
                found=true;
                System.out.println("Location is "+new int[]{row,col});
                break;
            }
        }
        if(found==false){
            System.out.println("Not Found");
        }
    }
}
