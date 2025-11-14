import java.util.Scanner;
public class exerciciovetor5 {
    public static void main(String[] args) {
        int a[], j, i;
        
        Scanner in = new Scanner(System.in);

        a = new int[10];

        for (i = 0; i < 10; i++) {
            System.out.print("Digite A[" + i + "]: ");
            a[i] = in.nextInt();
        }
        
        for (i = 0; i < 10; i++) {
            System.out.print("Elemento: " + a[i] + " - Divisores: ");
            for (j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println(); // Pula linha após imprimir os divisores
        }
    }
}