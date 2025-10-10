import java.util.Scanner;
public class Temperatura {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		//declaração de variaveis
		double 	f,c;
		
		System.out.println("digite os fahrenheits: ");
		f= ler.nextDouble();
		
		c= (((f-32)*5)/9);
		
		if (c<=0) { 
			System.out.println("frio extreme" +c);
		}
		else if (c<=10) {
			System.out.println("frio " +c);
		}
		else if (c<=20) {
			System.out.println("frio moderado " +c);
		}
		else if (c<=24) {
			System.out.println("Clima Ameno " +c);
		}
		else if (c>24) {
			System.out.println("Quente " +c);
		}
		ler.close();
	}

}
