package ex01;

import java.util.Scanner;
public class Ex01 {
public static void main(String[] args) {
    // Nome
    Scanner inputnome = new Scanner(System.in);
    System.out.println("Digite seu nome:");
    String nome = inputnome.nextLine();
    // Horas trabalhadas
    Scanner inputhoras = new Scanner(System.in);
    System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
    int horast = inputhoras.nextInt();
    // Valor por hora
    Scanner inputvalor = new Scanner(System.in);
    System.out.println("Digite o valor que recebe por hora: ");
    float valorhora = inputvalor.nextFloat();
    // Filhos com menos de 14 anos
    Scanner inputfilhos = new Scanner(System.in);
    System.out.println("Quantos filhos você tem abaixo de 14 anos?");
    int filhos = inputfilhos.nextInt();
    // Idade
    Scanner inputidade = new Scanner(System.in);
    System.out.println("Digite a sua idade: ");
    int idade = inputidade.nextInt();
    // Tempo de serviço
    Scanner inputtempo = new Scanner(System.in);
    System.out.println("Digite seu tempo de serviço: ");
    int temposervico = inputtempo.nextInt();
    // Salário família 100 por filho
    Scanner inputsalariof = new Scanner(System.in);
    System.out.println("Digite o valor do salário família por filho: ");
    float salariof = inputsalariof.nextFloat();
    //Salário bruto
    float salariobruto = horast*valorhora;
    // Desconto INPS
    double descontoinps = (salariobruto/100*8.5);
    // Soma do salário família
    float salariofsoma = (filhos*salariof);
    // Imposto de Renda
    float impostoderenda = 0;
    if(salariobruto>1500){
        impostoderenda = (salariobruto/100*15);
        } 
    else if(500 < salariobruto){
        impostoderenda = (salariobruto/100*8);
        } 
    else if(salariobruto<=500){
        impostoderenda = 0;
    }
    // Adicional
    double adic1 = 0;
    double adic2 = 0;
    double adic3 = 0;
    if(idade>40){
        adic1 = (salariobruto/100*2);
    } else if(temposervico > 15){
        adic2 = (salariobruto/100*3.5);
    } else if(temposervico <= 15 && temposervico > 5 && idade > 30){
        adic3 = (salariobruto/100*1.5);
    }
    double totaladicional = (adic1 + adic2 + adic3 + salariofsoma);
    // Discontos
    double descontos = (impostoderenda + descontoinps);
    // Declarando o salário líquido
    double salarioliquido = (salariobruto - descontos + totaladicional);
    System.out.println("----------------------");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Salário bruto: " + salariobruto);
    System.out.println("Adicionais: " + totaladicional);
    System.out.println("Descontos: " + descontos);
    System.out.println("Salário líquido: " + salarioliquido);
  }
}