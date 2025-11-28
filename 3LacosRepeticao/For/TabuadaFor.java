
public class Tabuada {

	public static void main(String[] args) {
		 
		int r;
		for(int i=1; i<=10; i++) {
			System.out.println("Tabuada do " +i);
			
			for (int n=1; n<=10; n++) {
				r = n*i;
				System.out.println("" +n+ "x" +i+ "="+r);
			}
		}
	}

}
