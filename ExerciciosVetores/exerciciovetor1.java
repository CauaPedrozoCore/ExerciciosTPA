import java.util.Scanner;

public class exerciciovetor1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i,qtdPares, iPar, iImpar, a[], b[];
        a = new int[20];
        b = new int[20];

        for (i = 0; i < 20; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = in.nextInt();
        }

        
        qtdPares = 0;
        for (i = 0; i < 20; i++) {
            if (a[i] % 2 == 0) {
                qtdPares++;
            }
        }

        // aqui é onde nos ve aonde começam os impares no vetor b
        iPar = 0;          
        iImpar = qtdPares; 
        
        for (i = 0; i < 20; i++) {
            if (a[i] % 2 == 0) {
                b[iPar] = a[i];
                iPar++;
            } else {
                b[iImpar] = a[i];
                iImpar++;
            }
        }

        // agora é só apresentar
        System.out.println("\nVetor B (pares primeiro e depois os impares):");
        for (i = 0; i < 20; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
