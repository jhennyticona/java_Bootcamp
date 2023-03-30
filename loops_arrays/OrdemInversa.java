/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = { 3, 5, -9, 7, -2, 1 };
        int count = 0;
        System.out.println("Vetor original");
        while (count <= (vetor.length - 1)) {

            System.out.println("Vetor[" + count + "]:" + vetor[count]);
            count++;
        }
        System.out.println("Vetor inverso");
        for (int i = (vetor.length - 1); i >= 0; i--)
            System.out.println("Vetor[" + i + "]:" + vetor[i]);
    }
}
