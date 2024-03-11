import java.util.*;
public class Currency_Convertor{

    // method to convert currency from rupee to other currency
    public static void ruppe_To_Other(double amount){
        System.out.println(amount+" Ruppe =" + (amount * 0.012) + " Dollar");
        System.out.println();

        System.out.println(amount + " Ruppe = " + (amount * 0.011 ) + " Euro");
        System.out.println();

        System.out.println(amount+ " Ruppe = " + (amount * 3.47) + " Pakistani RUppe");
        System.out.println();
    }


    // method to convert currency from dollar to other currency
    public static void dollar_To_Other(double amount){
        System.out.println(amount + " Dollar = " + ( amount * 82.70) + " Ruppe");
        System.out.println();

        System.out.println(amount + " Dollar = " + (amount * 0.93 ) + " Euro");
        System.out.println();

        System.out.println(amount+" Dollar = " +(amount * 287.26) + " Pakistani Rupee");
        System.out.println();

    }

    // method to convert currency from euro to other currency
    public static void euro_To_Other(double amount){
        System.out.println(amount + " Euro = " + (amount * 89.16) + " Ruppe");
        System.out.println();

        System.out.println(amount+ " Euro = "+(amount * 1.08) + " Dollar");
        System.out.println();

        
    }


    public static void main(String[] args) {
        System.out.println("Welcome to my currency convertor system:");
        System.out.println("Below are the some currencies from which you can convert your currency");
        System.out.println("1. Ruppe");
        System.out.println("2.Dollar");
        System.out.println("3.Euro");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int input = sc.nextInt();
        System.out.println("Enter the amount you want to convert: ");
        double amount = sc.nextDouble();

        switch (input ){

            case 1 : ruppe_To_Other(amount);
            break;

            case 2: dollar_To_Other(amount);
            break;

            case 3: euro_To_Other(amount);
            break;

            default: System.out.println("Invalid Choice");

        }

    }
}