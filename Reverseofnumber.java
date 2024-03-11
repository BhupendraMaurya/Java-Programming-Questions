import java.util.*;
public class Reverseofnumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int rev=0;
        int LastDigit=0;
        while(n>0){
            LastDigit = n%10;
            rev= (rev*10)+LastDigit;
            n=n/10;
        }
        System.out.println("Reversed of Number is : " + rev);
    }
}