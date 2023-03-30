
import java.util.Scanner;

public class desafio1 {
	

public static void main(String[] args) {
     Scanner leitor = new Scanner(System.in);
     double valor=0;
     int cont=0;
    double media = 0;
    double x=0;
      for(int i = 0;i <6;i++){
        System.out.println("valor ");
        valor=leitor.nextDouble();
        if(valor>0){
                cont++;
                x=x+valor;

        }
        media=x/cont;
      } 
     
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
}
	
