import java.util.Scanner;
public class Ano {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		//declara��o de variaveis
		double anoatual, nascimento, idade;
		
		System.out.println("Digite o ano atual:");
		anoatual= ler.nextDouble();
		
		System.out.println("digite seu ano de nacimento");
		nascimento= ler.nextDouble();
		
		idade=anoatual-nascimento;
		if (idade<10) {
			System.out.println("Voce e uma crian�a? "+idade);
		}
		else if (idade<18) {
			System.out.println("Voc� e adolescente "+idade);
		}
		else if (idade<60) {
			System.out.println("Voc� � Adulto ");
		}
		else {
			System.out.println("voce � Veio " +idade);
		}
		ler.close();
	}

}
