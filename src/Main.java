import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Digite uma frase em inglês:");
      String frase = sc.nextLine();

      System.out.println("A quantida de vogais dessa frase é "+Metodos.quantidadeVogais(frase));
    }
}