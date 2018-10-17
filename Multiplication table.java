public class Practice {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    int result = a[i] * b[j];
                    System.out.print(result + " ");
                }
                System.out.print("\n");
            }
        }
    }
}
