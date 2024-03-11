import java.util.*;
public class Printreverseofanumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        while(n>0){
            int LastDigit = n % 10;
            System.out.print(LastDigit);
            n = n/10;
        }
        System.out.println();
    }
}