import java.util.Scanner;
public class ParImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		//declara��o de variaveis
		int n;
		
		System.out.println("DIGITE O NUMERO ");
		n= ler.nextInt();
		
		if (n%2==0) {
            System.out.println("O numero é par: " +n);
        } else {
            System.out.println("O numero é impar: " +n);
        }
		ler.close();
	}

}
