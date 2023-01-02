import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        byte i = 1;
        while (i <= n) {

            if (i * i <= n) {
                System.out.println(i * i);
                i++;
            }

        }
    }
}

