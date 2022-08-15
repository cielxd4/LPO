import java.util.Scanner;

class Aula1 {
    public static void main (String Args []){      
      Scanner input = new Scanner(System.in);
      System.out.print ("Digite um número: " );
      int numero = input.nextInt();
      System.out.print ("Digite outro numero ");
      int numero2 = input.nextInt();
      int soma = numero + numero2;
      int divisao = numero / numero2;
      int subtracao = numero - numero2;
      int multiplicacao = numero * numero2;
      int resto = numero % numero2;
      System.out.println ("Resultado soma " + soma);
      System.out.print ("Resultado divisão " + divisao);
      System.out.println (" Resto: " + resto);
      System.out.println ("Resultado subtração " + subtracao);
      System.out.println ("Resultado multiplicação " + multiplicacao);
      
    
    }
}