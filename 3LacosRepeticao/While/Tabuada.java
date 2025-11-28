import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i = 1, r, n;
		System.out.println("Escreva o N�mero:");
		n = ler.nextInt();
		while(i<=10) {
		
		r = n*i;
		System.out.println("O N�mero " +n+ " multiplicado por " +i+ " � igual a: " +r);
		
		i++;
		}
		
			ler.close();	

	} 
	

}