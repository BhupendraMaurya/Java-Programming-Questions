public class Diamond_Problem {
    public static void main(String[] args) {
         int n= 5;

        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }

            for(int k=0;k<2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j = 1;j<i;j++){
                System.out.print(" ");
            }

            for(int k=0;k < 2 * (n-i) +1;k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
