import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class ParEImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidade_numero;
        int quantidade_pares = 0;
        int quantidade_impares = 0;
        int i = 0;
        // int numero;
        System.out.println("Digite a quantidade de números: ");
        quantidade_numero = scan.nextInt();
        do {
            System.out.println("Digite o número: ");
            int numero = scan.nextInt();
            i++;
            if (numero % 2 == 0)
                quantidade_pares++;
            else
                quantidade_impares++;
        } while (i < quantidade_numero);
        System.out.println("Pares: "+quantidade_pares);
        System.out.println("Impares: "+quantidade_impares);
    }
}
