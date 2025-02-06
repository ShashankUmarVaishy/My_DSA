
    public class Maze {
        public static void main(String[] args) {
            System.out.println(obstacle(3,3));

        }
        static int NoOfPaths(int row,int col){
           if(row==1 || col==1){
                return 1;
            }
            int left=NoOfPaths(row,col-1);
            int down=NoOfPaths(row-1,col);
            return left+down;
        }
        static int obstacle(int row,int col){
            if(row==1 || col==1){
                return 1;
            } if(row==2 && col==2){
                return 0;
            }
            int left=obstacle(row,col-1);
            int down=obstacle(row-1,col);
            return left+down;
        }
        static void path(String p,int row,int col){
            if(row==1 && col==1){
                System.out.println(p);
                return;

            }
            if(row>1){
                path(p+"D",row-1,col);
            }if(col>1){
                path(p+"R",row,col-1);
            }
        }
    }


