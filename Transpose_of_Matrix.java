public class Transpose_of_Matrix{
    public static void main(String args[]){
        int row=2,col=3;
        int matrix[][]={{1,2,3},{4,5,6}};

        printmatrix(matrix);
        //for transpose
        int transpose[][]=new int [col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        printmatrix(transpose);
    }
    public static void printmatrix(int matrix[][]){
        System.out.println("Your original matrix is:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}