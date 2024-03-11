import java.util.*;
public class Pelindrome{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your numer: ");
        int n = sc.nextInt();
        int LastDigit=0;
        int rev=0;
        while(n>0){
            LastDigit = n%10;
            rev = (rev*10) + LastDigit;
            n = n/10;
        }
        if(rev==n){
            System.out.print("Pelindrome");
        }
        else{
            System.out.print("Not Pelindrome");
        }
    }
}