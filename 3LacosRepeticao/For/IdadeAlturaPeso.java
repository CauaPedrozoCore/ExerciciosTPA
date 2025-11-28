import java.util.Scanner;

public class IdadeAlturaPeso {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, idades, nova, velha;
		double altura, peso, alturas, alturaMedia;
		alturaMedia = 0;
		idades = 0;
		alturas = 0;
		peso = 0;
		nova = 0;
		velha = 0;
		for (int i = 1; i<=25; i++) {
			System.out.println("Digite a sua idade");
			idade = ler.nextInt();
			
			System.out.println("Digite sua Altura");
			altura = ler.nextDouble();
			
			System.out.println("Digite seu Peso");
			peso = ler.nextDouble();
			
			if(idade>50) {
				idades = idades +1;
			}
			if(idade>=10 && idade<=20) {
				alturas = alturas + altura;
				alturaMedia = alturas/3;
			}
			if(peso<=40) {
				peso = peso + 1;
			}
			if(idade>velha) {
				velha = idade;
			}
			if(i==1) {
				nova = idade;
			}
			if(idade<nova) {
				nova = idade;
			}
			
		}
		peso = peso*100/25;
		System.out.println("Quantidade de Pessoas com idade superior a 50 anos: "+idades);
		System.out.println("Altura Média das  pessoas entre 10-20 anos: "+alturaMedia);
		System.out.println("Pessoas com peso inferior a 40kg "+peso+"%");
		System.out.println("Idade Pessoa mais nova: "+nova);
		System.out.println("Idade Pessoa mais velha: "+velha);
		ler.close();
	}

}
