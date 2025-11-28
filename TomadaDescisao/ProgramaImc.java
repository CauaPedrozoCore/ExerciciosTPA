
import java.util.Scanner;
public class ProgramaImc {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		//declaração de variaveis
		double p, h, imc;
		
		System.out.println("Digite o Seu Peso");
		p=ler.nextDouble();
		
		System.out.println("Digite a Sua Altura");
		h=ler.nextDouble();
		
		h=h*h;
		imc=p/h;
		if (imc<18.5) {
			System.out.println("Excesso de Magreza");
		}
		else if (imc<25) {
			System.out.println("Peso Normal");
		}
		else if (imc<30) {
			System.out.println("Excesso de Peso");
		}
		else if (imc<35) {
			System.out.println("Obesidade Grau I");
		}
		else if (imc<40) {
			System.out.println("Obesidade Grau II");
		}
		else {
			System.out.println("Obesidade Grau III");
		}
		ler.close();
	}

}
