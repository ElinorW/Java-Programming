import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int x1 = scanner.nextInt();
        System.out.println("Enter a number");
        int x2 = scanner.nextInt();
        System.out.println("Enter a number");
        int x3 = scanner.nextInt();
        System.out.println("Enter a number");
        int x4 = scanner.nextInt();
        System.out.println("Enter a number");
        int x5 = scanner.nextInt();

        int [] arr = {x1,x2,x3,x4,x5};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if (arr[i]>max)
                max=arr[i];
        }
        System.out.print(max);



    }
}
