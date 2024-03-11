import java.util.*;
public class Arrays0{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];
        //for input
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        //for output
        System.out.println("Phy: "+marks[0]);
        System.out.println("maths: "+marks[1]);
        System.out.println("che: "+marks[2]);

    }
}