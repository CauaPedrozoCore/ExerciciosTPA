import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		//declaração de variaveis
		double salario, IRPF = 0;
		
		System.out.println("Digite seu Salario");
		salario= ler.nextDouble();
		
		if (IRPF>3582){
			IRPF=salario*27.5/100-662.94;
			System.out.println("Seu Desconto no IRPF é: "+IRPF);
		}
		else if (IRPF<3582) {
			IRPF=salario*22.5/100-483.84;
			System.out.println("Seu Desconto no IRPF é: "+IRPF);
		}
		else if (IRPF<2866.70) {
			IRPF=salario*15/100-268.84;
			System.out.println("Seu Desconto no IRPF é: "+IRPF);
		}
		else if (IRPF<2150) {
			IRPF=salario*7.5/100-107.59;
			System.out.println("Seu Desconto no IRPF é: "+IRPF);
		}

	}

}
