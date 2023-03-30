import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		double a, b;
		System.out.println("Digite o primeiro valor");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor");
		b = scan.nextInt();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double divisao = divisao(a,b);
		double multiplicacao = multiplicacao(a,b);
		
		System.out.println("soma: " + soma);
		System.out.println("subtração: "+ subtracao);
		System.out.println("divisao: "+ divisao);
		System.out.println("multiplicação: "+ multiplicacao);
	}

	public static double soma(double a, double b) {
		return a + b;
	}

	public static double subtracao(double a, double b) {
		return a - b;
	}

	public static double divisao(double a, double b) {
		return a / b;
	}

	public static double multiplicacao(double a, double b) {
		return a * b;
	}*/

	Scanner scan = new Scanner(System.in);
	    
        System.out.println("custofabrica");
        int custoFabrica = scan.nextInt();
        System.out.println("porcentagem");
	    int porcentagemDistribuidor = scan.nextInt();
        System.out.println("imposto");
	    int PercentualImpostos = scan.nextInt();

            int custoConsumidor;
     
            int Distribuidor;
            int ValorImpostos;
 
        
 
        Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        ValorImpostos = (custoFabrica *PercentualImpostos)/100;
        custoConsumidor = custoFabrica + Distribuidor + ValorImpostos;
        System.out.println(Distribuidor);
        System.out.println(ValorImpostos);
        System.out.println(custoConsumidor);
	}

}
