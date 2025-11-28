
public class Tamanho {

	public static void main(String[] args) {
		int i=1;
		double c, k, t, g;
		
		t = 1.34 * 100;
		g = 1.45 * 100;
		c = 2.5;
		k = 2.0;
	
		
		while (t<=g) {
			t= t+c;
			g= g+k;
			
		i++; 
		}
		
		System.out.println("anos	"+i);
		System.out.println("idade do joao	"+t);
		System.out.println("idade do pedro	"+g);
	}

}
