//some problem in code
public class NQueensExistorNot{
    public static boolean isSafe(char chessboard[][],int row, int col){
        for(int i=row-1;i>=0;i++){
            if(chessboard[i][col]=='Q'){
                return false;
            }
        }

        for(int i=row-1,j=col-1;i>=0 && j>=0; i--,j--){
            if(chessboard[i][j]=='Q'){
                return false;
            }
        }

        for(int i=row-1,j=col+1;i>=0 && j<chessboard.length;i--,j++){
            if(chessboard[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean nQueens(char chessboard[][], int row){
        //base case
        if(row==chessboard.length){
            count++;
            //printChessBoard(chessboard);
            return true;
        }
        for(int j=0;j<chessboard.length;j++){
            if(isSafe(chessboard,row,j)){
                chessboard[row][j]='Q';
                if(nQueens(chessboard,row+1)){
                    return true;
                }
                chessboard[row][j]='x';
            }
        }
        return false;
    }
    static int count=0;
    public static void printChessBoard(char chessboard[][]){
        for(int i=0;i<chessboard.length;i++){
            for(int j=0;j<chessboard.length;j++){
                System.out.print(chessboard[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=5;
        char chessboard[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chessboard[i][j]='x';
            }
        }
        if(nQueens(chessboard,0)){
            System.out.println("Solution is possible");
            printChessBoard(chessboard);
        }
        else{
            System.out.println("Solution is not possible");
        }


    }
}