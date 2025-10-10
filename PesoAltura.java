import java.util.Scanner;
public class PesoAltura {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		//declaração de variaveis
		double peso,altura,imc;
		
		System.out.println ("Digite o peso:");
		peso = ler.nextDouble();
		
		System.out.println ("Digite a Altura:");
		altura = ler.nextDouble();
		
		altura = (altura*altura);
		imc = (peso/altura);
		
		System.out.println ("Seu IMC é:"+imc);

	}

}
