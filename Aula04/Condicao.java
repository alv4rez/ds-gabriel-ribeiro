import java.util.Scanner;
public class Condicao {
  public static void main(String[] args) {
    // Primeira variável
    Scanner input1 = new Scanner(System.in);
    System.out.println("Qual o valor do primeiro numero?");
    int n1 = input1.nextInt();
    System.out.println("O valor da primeira variavel é: " + n1);
    
    // Segunda variável
    Scanner input2 = new Scanner(System.in);
    System.out.println("Qual o valor do segundo numero?");
    int n2 = input2.nextInt();
    System.out.println("O valor da segunda variavel é: " + n2);
    
    // Fechar o Scanner
    input1.close();
    input2.close();
    
    // If e else
    if (n1 == n2) {
        System.out.println("A primeira variável(" + n1 + ") é igual a segunda variável(" + n2 + ").");
    } else {
        System.out.println("A primeira variável(" + n1 + ") é diferente da segunda variável(" + n2 + ").");
    }
    

  }
}