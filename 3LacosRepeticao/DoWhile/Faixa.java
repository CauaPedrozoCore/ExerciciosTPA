import java.util.Scanner;
public class Faixa {

    public static void main(String[] args) {
    	Scanner ler = new Scanner(System.in);
    	int i=1, n, f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0;
    	
    	while (i<=10) {
			System.out.println("Digite a sua idade");
			n=ler.nextInt();
			
			if (n<=15) {
				System.out.println("voce é 1°");
				f1++;
			}
			else if (n<=30) {
				System.out.println("Voce é 2°");
				f2++;
			}
			else if (n<=45) {
				System.out.println("Voce é 3°");
				f3++;
			}
			else if (n<=60) {
				System.out.println("Voce é 4°");
				f4++;
			}
			else {
				System.out.println("Voce é 5°");
				f5++;
				
			}
			
			i++;
		}
    	System.out.println("Resultados 1°: " +f1+ "%");
    	f1 = (f1/10)*100;
    	
    	System.out.println("Resultados 2°: " +f2+ "%");
    	f2 = (f2/10)*100;
    	
    	System.out.println("Resultados 3°: " +f3+ "%");
    	f3 = (f3/10)*100;
    	
    	System.out.println("Resultados 4°: " +f4+ "%");
    	f4 = (f4/10)*100;
    	
    	System.out.println("Resultados 5°: " +f5+ "%");
    	f5 = (f5/10)*100;
    	
    	System.out.println("10 Pessoas");
    	
    	
    	ler.close();
    }
}