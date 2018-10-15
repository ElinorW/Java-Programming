import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string");
        char[] x =scanner.next().toCharArray();

        for(int i =0; i<x.length;i++){
            int y =(int)x[i];
            System.out.print(y);
        }




    }
}
