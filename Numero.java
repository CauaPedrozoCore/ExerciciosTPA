import java.util.Scanner;
public class Numero {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		//declaração de variaveis
		int n;
		
		System.out.println("DIGITE O NUMERO ");
		n= ler.nextInt();
		
		if (n>=1) {
		    System.out.println("Seu numero é Positivo: "+n);
		}
		else if (n==0) {
			System.out.println("Seu numero é Neutro: "+n);
		}
		else {
			System.out.println("Seu numero é pá acesso Negado: "+n);
		}
		ler.close();
		}

	}


