import java.util.Scanner;

public class Ejericcio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=10;
        int[] numero = new int[i];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        do {


            for (i = 0; i < 10; i++) {

                numero[i] = scanner.nextInt();
                if (numero[i] < minimo) {
                    minimo = numero[i];
                }
                if (numero[i] > maximo) {
                    maximo = numero[i];
                }
            }
            for (i = 0; i < 10; i++) {
                if (numero[i] == maximo) {
                    System.out.println(numero[i]);

                }
            }
        } while (numero[i] != 0);

    }
}



