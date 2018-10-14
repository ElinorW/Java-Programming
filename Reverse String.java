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
