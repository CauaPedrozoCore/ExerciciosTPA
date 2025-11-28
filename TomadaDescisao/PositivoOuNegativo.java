import java.util.Scanner;

public class PositivoOuNegativo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Declarando Váriaveis e Lendo o valor
		int n;
		
		System.out.println("Digite o seu valor: ");
		n = in.nextInt();
				
		//Tomada de Descisão
		
		if (n > 0) {
			System.out.println("Seu Número é Positivo!");
		}
		
		else if (n < 0) {
			System.out.println("Seu Número é Negativo!");
		}
		
		else {
			System.out.println("Seu Número é 0");
		}

	}

}
