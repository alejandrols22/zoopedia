import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;

        while (n != 0) {
            n = sc.nextInt();
            if ((n % 2 == 0) & (n != 0)) {
                System.out.println("even");
            } else if (n % 2 != 0) {
                System.out.println("odd");
            }


        }
    }
}
