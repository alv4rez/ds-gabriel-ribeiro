package Aula03;

import java.util.Scanner;

public class TiposDeVariaveis {

    public static void main(String[] args) {
        // Tipos de variáveis
        String nome = "Gabriel";
        int Idade = 16;
        float peso = 60.5f;
        char grupo = 'A';
        boolean presenca = true;
        
        // Print variáveis
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + Idade);
        System.out.println("Peso: " + peso);
        System.out.println("Grupo: " + grupo);
        System.out.println("Presença: " + presenca);
        System.out.println("");
        
        // Casting
        int numero1 = 5;
        double doublenumero1 = numero1;
        int numero2 = 30;
        double doublenumero2 = numero2;
        int numero3 = 100;
        double doublenumero3 = numero3;
        System.out.println(numero1 + "; " + numero2 + "; " + numero3 + ".");
        System.out.println(doublenumero1 + "; " + doublenumero2 + "; " + doublenumero3 + ".");
        System.out.println("");
        
        // Scanner
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
        System.out.println("");
        
        // Desafio: Fazer porcentagem com dois valores dados pelo input
        Scanner Numero1 = new Scanner (System.in);
        System.out.println("Alunos totais da sala: ");
        
    }
    
}
