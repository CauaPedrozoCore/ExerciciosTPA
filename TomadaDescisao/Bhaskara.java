import java.util.Scanner;
public class Bhaskara {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		//declaração de variaveis
		double a, b, c, delta, x1, x2;
		
		System.out.println("Digite o valor de A");
		a=ler.nextDouble();
		
		System.out.println("Digite o valor de B");
		b=ler.nextDouble();
		
		System.out.println("Digite o valor de C");
		c=ler.nextDouble();
		
		if (a==0) {
			System.out.println("Não é uma equação do 2° Grau");
		}
		else {
			delta=b*b-4*a*c;
			
			
			if (delta<0) {
				System.out.println("Não Existem Raizes Reais");
			}
			else if (delta==0) {
				x1=-b/(2*a);
				System.out.println("Existe uma Raiz Real: " +x1);
			}
			else {
				x1=(-b+Math.sqrt(delta))/(2*a);
				x2=(-b-Math.sqrt(delta))/(2*a);
				System.out.println("existem duas raizes reais:");
				System.out.println("x1: "+x1);
				System.out.println("x2: "+x2);
			}
			ler.close();
		}

	}

}
