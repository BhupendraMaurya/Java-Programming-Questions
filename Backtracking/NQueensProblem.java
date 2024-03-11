public class NQueensProblem{
    public static boolean isSafe(char chessboard[][], int row, int col){
         
        // for row
        for(int i=row-1;i>=0;i--){
            if(chessboard[i][col]=='Q'){
               return false;
            }
        }


        // for left diagonal

        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chessboard[i][j]=='Q'){
               return false;
            }
        }

        // for right diagonal
        for(int i=row-1,j=col+1;i>=0 && j<chessboard.length;i--,j++){
            if(chessboard[i][j]=='Q'){
                return false;
            }
        }
        return true;
    
    }
    public static void nQueens(char chessboard[][], int row){
        

        //base case
        if(row==chessboard.length){
            
            printChessBoard(chessboard);

            return;
        }

        for(int j=0;j<chessboard.length;j++){
            
            if(isSafe(chessboard,row,j)){
                chessboard[row][j]='Q';
                nQueens(chessboard,row+1);
                chessboard[row][j]='x';
            }
        } 
    }
    public static void printChessBoard(char chessboard[][]){
        
        System.out.println("-----Chess Board-----");
        for(int i=0;i<chessboard.length;i++){
            for(int j=0;j<chessboard.length;j++){
                System.out.print(chessboard[i][j]+" ");
            }
            System.out.println();
        }
        
        
        
    }
    public static void main(String args[]){
        int n=5;
        char chessboard[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chessboard[i][j]='x';
            }
            System.out.println();
        }
        nQueens(chessboard,0);


    }
}