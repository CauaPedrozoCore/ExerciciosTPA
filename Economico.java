import java.util.Scanner;
public class Economico {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		//declaração de variaveis
		double km, l, gasto;
		
		System.out.println("Escreva a Distância Percorrida em Quilometros: ");
		km= ler.nextDouble();
		
		System.out.println("Escreva a Capacidade do Tanque em Litros: ");
		l= ler.nextDouble();
		
		gasto=km/l;
		if (gasto>=10) {
			System.out.println("Seu consumo é Econômico");
		}
		else {
			System.out.println("Seu consumo Não é Econômico");
		}
		ler.close();
		
	}

}
