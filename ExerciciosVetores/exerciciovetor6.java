import java.util.Scanner;

public class exerciciovetor6 {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int a[], i;

        a = new int[11];

        // dessa vez vou fazer com valor predefinido
        int valor = 1;

        // só preencher o vetor com 2^i usando multiplicação
        for (i = 0; i < 11; i++) {
            a[i] = valor;
            valor *= 2; // isso faz multiplicar por 2 a cada passo
        }

        for (i = 0; i < 11; i++) {
            System.out.println("A[" + i + "] = " + a[i]);
        }
    }
}
