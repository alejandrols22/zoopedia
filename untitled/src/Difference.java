import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora1 = sc.nextInt();
        int minuto1 = sc.nextInt();
        int segundo1 = sc.nextInt();

        int hora2 = sc.nextInt();
        int minuto2 = sc.nextInt();
        int segundo2 = sc.nextInt();

        int hora1sec= hora1*3600;
        int minuto1sec= minuto1*60;
        int tiempototal= hora1sec + minuto1sec +segundo1;

        int hora2sec= hora2*3600;
        int minuto2sec= minuto2*60;
        int tiempototal2= hora2sec + minuto2sec +segundo2;

        int resultado= tiempototal2-tiempototal;
        System.out.println(resultado);




    }
}
