
public class SalarioLiquido {
	public static void main (String args[]) {
		//declaração de variaveis
		double salarioBruto,inss,valeTransporte,salarioLiquido;
		salarioBruto=20;
		inss=salarioBruto/100*8;
		valeTransporte=salarioBruto/100*6;
		salarioLiquido=salarioBruto-inss-valeTransporte;
		System.out.println ("o Salario liquido é:" +salarioLiquido);
		
				
	}

}
