public class Operadores {
  public static void main(String[] args) {
    String nomeCompleto = "LINGUAGEM" + "JAVA";
    System.out.println(nomeCompleto);

   String concatenacao = "?";

    concatenacao = 1+1+1+"1";
    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+1;
    System.out.println(concatenacao);
    
    concatenacao = 1+"1"+1+"1";
    System.out.println(concatenacao);

    concatenacao = "1"+1+1+1;
    System.out.println(concatenacao);

    concatenacao = "1"+(1+1+1);
    System.out.println(concatenacao);

    int numero = 5;
    //converter a negativo
    numero = - numero;
    System.out.println(numero);
    //converter a positivo
    numero = numero * -1;
    System.out.println(numero);
    //incrementar
    System.out.println(++numero);
    //decrementar
    System.err.println(--numero);
    //alterador ternario
    int a,b;
    a = 6;
    b = 5;

    String resultado = a==b ? "verdadeiro" : "falso";
    System.out.println(resultado);
  }  
}
