import java.util.Scanner;
	public class ImparOuPar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Declarando Váriaveis
		int n;
		
		//Leitura 
		System.out.println("Escreva o seu número: ");
		n = in.nextInt();
		
		//If / Else
		if (n % 2 ==0) {
			System.out.println("Seu Número é PAR");
		} else {
			System.out.println("Seu Número é IMPAR");
		}
	}

}
