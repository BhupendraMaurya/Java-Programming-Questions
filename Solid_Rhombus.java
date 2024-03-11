public class Solid_Rhombus{
    public static void Rhombus(int n){
        //outer loop for total lines
        for(int i=1;i<=n;i++){
            //inner loop for spaces 
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // for stars
            for(int k=1;k<=n;k++){
                System.out.print("*");
            }
            //for line change
            System.out.println();
        }
    }
    public static void main(String args[]){
        Rhombus(5);
    }
}