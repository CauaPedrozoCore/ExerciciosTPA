import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Declarando váriaveis
		int at, an, i;
		
		//Ler o valor dos 2 Anos
		System.out.println("Digite o seu Ano de Nascimento!");
		an = in.nextInt();
		
		System.out.println("Digite o Ano Atual!");
		at = in.nextInt();
		
		//Calcular Idade
		i = an - at;
		
		//If / Else
		if (i >= 18) {
			System.out.println("Você é Maior de Idade");
		}
		else {
			System.out.println("Você é Menor de Idade");
		}
	}

}
