public class Hollow_Rhombus{
    public static void Rhombus(int n){
        int i;
        int j;
        //outer loop for total lines
        for(i=1;i<=n;i++){
            //inner loop for spaces 
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // for stars and spaces inside rhombus
            for(int k=1;k<=n;k++){
                if(i==1||i==n||k==1||k==n){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //for line change
            System.out.println();
        }
    }
    public static void main(String args[]){
        Rhombus(5);
    }
}