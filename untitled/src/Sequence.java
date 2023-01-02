import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte numero = sc.nextByte();
        byte counter = 0;
        for (int i = 1; i <= numero; i++) {
            if (counter==numero) {
                break;
            }
            for (int j = 0; j < i; i++) {
                System.out.print(i + " ");
                counter++;
                if (counter==numero){
                    break;
                }


            }

        }
    }
}

