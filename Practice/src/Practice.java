import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        char [] s = input.nextLine().toCharArray();

        for(int i = s.length -1; i>=0; i--){
            //char [] temp = {s[i]};
            //System.out.print(temp);
            System.out.print(s[i]);
        }

    }
}




















    /*private static int reverse(int original){
        int reverse = 0;
        while (original != 0){
            int digit = original % 10;
            reverse = reverse*10 + digit;
            original = original/10;
        }
        return reverse;
    }

    private static boolean isPalindrome(int original, int reverse){
        return original == reverse;
    }

    public static boolean isOrCanBePalndrome(int number){
        final int maxPalindrome = 1000000;

        while(number < maxPalindrome){
            int reverse = reverse(number);
            boolean isPal = isPalindrome(number,reverse);
            if(isPal){
                return true;
            }
            number = number + reverse;
        }
        return false;

    }

    public static void main(String[] args) {
        Practice practice = new Practice();
        practice.isOrCanBePalndrome(121);

    }*/




