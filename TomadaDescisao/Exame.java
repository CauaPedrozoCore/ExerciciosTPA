import java.util.Scanner;

public class Exame {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//declaração de variaveis
        double n1, n2, m, notaExame, novaMedia;

        
        System.out.print("Digite a primeira nota: ");
        n1 = ler.nextDouble();

        System.out.print("Digite a segunda nota: ");
        n2 = ler.nextDouble();

        
        m = (n1 + n2) / 2;

        
        if (m < 3) {
            System.out.println("REPROVADO");
        }
        else if (m >= 6) {
            System.out.println("APROVADO");
        }
        else {
            System.out.println("EXAME");
            
            System.out.print("Digite a nota do exame: ");
            notaExame = ler.nextDouble();

            novaMedia = (m + notaExame) / 2;

            if (novaMedia >= 6) {
                System.out.println("APROVADO depois do exame");
            } 
            else {
                System.out.println("REPROVADO depois do exame");
            }
        }

        ler.close();
    }

	}


