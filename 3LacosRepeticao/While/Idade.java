import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i=1, n, a, idade;
		while (i<=5) {
			System.out.println("Digite o ano atual");
			a=ler.nextInt();
			
			System.out.println("Digite o seu ano de nascimento");
			n=ler.nextInt();
			
			idade=(a-n);
			System.out.println("a sua idade é "+idade);
			if (idade<18){
				System.out.println("Menor de Idade");
			}
			else {
				System.out.println("Maior de Idade");
				
				
			}
				i++;
				
		}ler.close();

	}

}
