public class butterfly{
    public static void butterfly_pattern(int n){
        //for first half outer loop
        for(int i = 1; i<=n ; i++){
            //inner loop 
            for(int j = 1; j<=i ; j++){
                //print star
                System.out.print("*");
            }
            //for spaces
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //for stars
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
          
        }
        //for second half outer loop
        for(int i=n;i>=1;i--){
            //inner loop
            for(int j=1;j<=i;j++){
                //for star
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i);j++){
                //for spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                //for stars
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String args[]){
       butterfly_pattern(4); 
    }
}