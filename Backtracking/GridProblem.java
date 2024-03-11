public class GridProblem{
    public static int Totalways(int i,int j, int m, int n){
        //base case
        if(i==m-1 && j==n-1){
            return 1;
        }
        else if(i==n || j==n){
            return 0;
        }
        //recursive funtion
        int w1=Totalways(i,j+1,m,n);
        int w2=Totalways(i+1,j,m,n);
        return w1+w2;
    }
    public static void main(String args[]){
        int m=3,n=3;
        System.out.println(Totalways(0,0,m,n));
    }
}