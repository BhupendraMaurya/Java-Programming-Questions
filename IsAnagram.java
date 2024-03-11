import java.util.Scanner;

public class Main {
    
    // Function to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length())
            return false;

        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if sorted arrays are equal
        return Arrays.equals(charArray1, charArray2);
    }
    
    // Main method
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // Input the number of pairs
        System.out.println("Enter the number of pairs:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        
        // Input pairs of strings
        for (int i = 0; i < n; i++) {
            System.out.println("Enter pair " + (i + 1) + ":");
            System.out.println("Enter the first string:");
            String str1 = sc.nextLine();
            
            System.out.println("Enter the second string:");
            String str2 = sc.nextLine();
            
            // Check if the strings are anagrams
            if (areAnagrams(str1, str2))
                System.out.println("The two strings are anagrams.");
            else
                System.out.println("The two strings are not anagrams.");
        }
        
        // Close the scanner
        sc.close();
    }
}
