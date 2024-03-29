import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTabuada, resultado;
        int count = 1;
        System.out.println("Qual número deseja ver a tabuada: ");
        numTabuada = scan.nextInt();
        System.out.println("Tabuada de " + numTabuada + ":");
        do {
            resultado = numTabuada * count;
            System.out.println(numTabuada + " X " + count + " = " + resultado);
            count++;
        } while (count <= 10);
    }
}
