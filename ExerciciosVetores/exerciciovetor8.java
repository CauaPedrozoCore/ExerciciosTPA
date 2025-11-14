import java.util.Scanner;

public class exerciciovetor8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a[], b[], i;
        final int TAM = 10;
        a = new int[TAM];
        b = new int[TAM];

        // leitura dos 10 valores de A
        System.out.println("Digite os " + TAM + " elementos do vetor A:");
        for (i = 0; i < TAM; i++) {
            System.out.print("A[" + i + "]: ");
            a[i] = in.nextInt();
        }

        // 3. Calcular B (de trás para frente)
        for (i = TAM - 1; i >= 0; i--) {
            if (i == TAM - 1) {
                b[i] = a[i];
            } else {
                b[i] = a[i] + a[i+1];
            }
        }
        System.out.println("\n--- RESULTADOS ---");
        for (i = 0; i < TAM; i++) {
            System.out.println("A[" + i + "]: " + a[i] + "  ->  B[" + i + "]: " + b[i]);
        }
    }
}