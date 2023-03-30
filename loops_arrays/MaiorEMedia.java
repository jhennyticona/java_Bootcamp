import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int i = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Digite um número: ");
          numero=scan.nextInt();
            soma = soma + numero;
            if (numero > maior)
                maior = numero;
            i = i + 1;
        } while (i < 5);
        System.out.println("o número maior: " + maior);
        System.out.println("Média: " + (soma / 5));
    }
}
