import java.util.Scanner;

public class exerciciovetor2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a[], j, i;
        a = new int[5];

        // vamo começar lendo os elementos que vao ficar dentro do vetor
        for (i = 0; i < 5; i++) {
            System.out.print("Digite A[" + i + "]: ");
            a[i] = in.nextInt();
        }

        // o segredo desse exercicio é o laço de repetição dentro do outro com variaveis diferentes!
        for (i = 0; i < 5; i++) {
            System.out.println("\nTabuada do " + a[i] + ":");

            for (j = 1; j <= 10; j++) {
                System.out.println(a[i] + " x " + j + " = " + (a[i] * j));
            }
        }
    }
}
