import java.util.*;
public class Percentage{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your physics marks: ");
        int phy=sc.nextInt();
        System.out.println("Enter your maths marks: ");
        int maths=sc.nextInt();
        System.out.println("Enter your english marks: ");
        int eng=sc.nextInt();
        System.out.println("Enter your chemistry marks: ");
        int che=sc.nextInt();
        System.out.println("Enter your hindi marks: ");
        int hin=sc.nextInt();
        
        int obtainedmarks=(phy+maths+eng+che+hin);

        float per=(float)obtainedmarks/5;
        System.out.println("Your percentage is: " +per);
    }
}