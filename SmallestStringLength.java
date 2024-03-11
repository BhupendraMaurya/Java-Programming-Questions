import java.util.Scanner;
import java.util.Stack;

public class SmallestStringLength {
    public static int findSmallestLength(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == '0' && c == '1') {
                stack.pop(); // Remove "0" and "1" if adjacent
            } else {
                stack.push(c);
            }
        }
        
        return stack.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string containing 0, 1, and *: ");
        String inputString = scanner.nextLine();

        int smallestLength = findSmallestLength(inputString);
        System.out.println("Length of the smallest string after operations: " + smallestLength);

        // scanner.close();
    }
}
