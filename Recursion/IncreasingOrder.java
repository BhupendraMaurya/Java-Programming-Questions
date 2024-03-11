public class IncreasingOrder{
    public static void printIncrease(int n){
        if(n == 1){
            System.out.println(1);
            return ;
        }
        printIncrease(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        int n=10;
        printIncrease(n);
    }
}