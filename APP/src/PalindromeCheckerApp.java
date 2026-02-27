import java.util.Scanner;

public class PalindromeCheckerApp {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        boolean isPalindrome = true;
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println(str + "is palindrome");
        } else {
            System.out.println(str + "is not palindrome");
        }

        sc.close();
        }
    }
