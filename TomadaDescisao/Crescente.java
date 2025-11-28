import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		//declara��o de variaveis
		int A, B, C, Aux;
		
		System.out.println("Digite o valor de A");
		A=ler.nextInt();
		
		System.out.println("Digite o valor de B");
		B=ler.nextInt();
		
		System.out.println("Digite o valor de C");
		C=ler.nextInt();
		
		if (A>B) {
			Aux=A;
			A=B;
			B=Aux;
			
		}
		if (A>C) {
			Aux=A;
			A=C;
			C=Aux;
			
		}
		if (B>C) {
			Aux=B;
			B=C;
			B=Aux;
			
		}
		
		System.out.printf("Valores em ordem Crescente: %d, %d, %d\n", A , B,C);
		ler.close();

	}

}
