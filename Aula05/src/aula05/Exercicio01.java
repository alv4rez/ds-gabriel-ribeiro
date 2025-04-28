package aula05;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
       // Definindo as variáveis
       float gastosJaneiro;
       float gastosFevereiro;
       float gastosMarco;
       float gastosTrimestre;
       // Variáveis recebendo valor
       Scanner input = new Scanner(System.in);
       System.out.println("Digite o valor total dos gastos de Janeiro: ");
       gastosJaneiro = input.nextFloat();
       
       System.out.println("Digite o valor total dos gastos de Fevereiro: ");
       gastosFevereiro = input.nextFloat();
       
       System.out.println("Digite o valor total dos gastos de Março: ");
       gastosMarco = input.nextFloat();
       // Soma dos gastos
       gastosTrimestre = (gastosJaneiro + gastosFevereiro + gastosMarco);
       // Impressão dos valores
       System.out.println("Gastos no mês de Janeiro: " + gastosJaneiro);
       System.out.println("Gastos no mês de Fevereiro: " + gastosFevereiro);
       System.out.println("Gastos no mês de Março: " + gastosMarco);
       System.out.println("Gastos total no trimestre: " + gastosTrimestre);
    }
    
}
