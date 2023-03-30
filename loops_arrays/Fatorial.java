import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fatorial;
        int i, resultado = 1;
        System.out.println("Fatorial: ");
        fatorial = scan.nextInt();

        for (i = fatorial; i >= 1; i--){
            resultado = resultado * i;
        }
            
        System.out.println(fatorial+"! = " + resultado);
    }

}
