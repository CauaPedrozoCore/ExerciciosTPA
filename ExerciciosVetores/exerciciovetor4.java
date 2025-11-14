import java.util.Scanner;

public class exerciciovetor4 {
    public static void main(String[] args) {
    	int a [], i, j, num;
        Scanner in = new Scanner(System.in);

        a = new int[10];

        // ler os elementos
        for (i = 0; i < 10; i++) {
            System.out.print("Digite A[" + i + "]: ");
            a[i] = in.nextInt();
        }

        // impressão dos numeros pares até os elementos
        for (i = 0; i < 10; i++) {
            num = a[i];

            System.out.println("\nElemento A[" + i + "] = " + num);
            System.out.print("Pares de 0 até " + num + ": ");

            for (j = 0; j <= num; j += 2) { 
                System.out.print(j + " ");
            }

            System.out.println(); // pular linha
        }
    }
}
