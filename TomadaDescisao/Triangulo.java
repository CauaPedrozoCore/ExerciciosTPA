import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		//declaração de variaveis
		double a, b, c;
		
		System.out.println("Digite o valor de A");
		a=ler.nextDouble();
		
		System.out.println("Digite o valor de B");
		b=ler.nextDouble();
		
		System.out.println("Digite o valor de C");
		c=ler.nextDouble();
		
		if (a<b+c && b<a+c && c<a+b) {
			
			if (a==b && b==c) {
				 System.out.println("Triângulo Equilátero:");
            } else if (a!=b && b!=c && a !=c) {
                System.out.println("Triângulo Escaleno: ");
            } else {
                System.out.println("Triângulo Isósceles:");
            }

        } else {
            System.out.println("Os valores informados NÃO formam um triângulo.");
        }
		ler.close();
			}
	

		

	}


