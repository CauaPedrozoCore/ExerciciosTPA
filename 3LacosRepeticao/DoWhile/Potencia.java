import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 1, n, e, c = 1;
		
		System.out.println("Digite a base");
		n = ler.nextInt();
		
		System.out.println("Digite o expoente");
		e = ler.nextInt();
		
		do {
			c = c * n; 
			System.out.println("Seu Numero em Potencia: " +c);
			i++;
		}while (i<=e);
		ler.close();

	}

}
