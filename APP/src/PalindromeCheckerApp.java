import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.print("Enter a string ");
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        boolean isPalindrome = true;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(input + "is a palindrome");
        } else {
            System.out.println(input + "is not a palindrom.");
        }
        sc.close();
    }
