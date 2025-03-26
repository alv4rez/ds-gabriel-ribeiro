package ex02;
import java.util.Scanner;
public class Ex02 {

    /**
     2.Uma empresa decide presentear seus funcionários com um bônus de Natal, cujo 
valor é definido do seguinte modo: - Os funcionários do sexo masculino com tempo de casa superior a 15 anos terão 
direito a um bônus de 20% do seu salário; - As funcionárias com tempo de casa superior a 10 anos terão direito a um bônus
de 25% do seu salário; e - Os demais funcionários terão direito a um bônus de 100. Escreva um algoritmo que leia o código do funcionário, o sexo, o tempo de trabalho 
(em anos) e o salário. O algoritmo deve calcular o valor do bônus.
     * @param args
     */
    public static void main(String[] args) {
        /** Declarando as variáveis **/
        char sexo;
        int codigof;
        int anos;
        double salario;
        /** Scanner + Atribuindo valor as variáveis. **/
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o código do funcionário: ");
        codigof = ler.nextInt();
        while (codigof < 1){
            System.out.println("Dgiite novamente o código do funcionário, o programa não aceitará valores menores que 1.");
            codigof = ler.nextInt();
        }
        System.out.println("Digite o sexo do funcionário(M ou F)");
        sexo = ler.next().charAt(0);
        while (sexo != 'M' && sexo != 'm' && sexo != 'F' && sexo != 'f'){
            System.out.println("Digite novamente o sexo do funcionário, o programa só aceitará a palavra 'Masculino ou 'Feminino'(pode ser em maiúsculo ou minúsculo).");
            sexo = ler.next().charAt(0);
        }
        System.out.println("Digite o tempo de casa do funcionário: ");
        anos = ler.nextInt();
        while (anos < 0){
            System.out.println("Digite novamente o tempo de casa, o programa não aceitará um valor menor que 0.");
            anos = ler.nextInt();
        }
        System.out.println("Digite o salário do funcionário: ");
        salario = ler.nextFloat();
        while (salario < 0){
            System.out.println("Digite novamente o salário. O programa não aceitará um valor menor que 0.");
            salario = ler.nextInt();
        }
        /** Condição If e Else **/
        if(sexo == 'M' || sexo == 'm' && anos > 15){
            salario = (salario * 1.2);
        } else if(sexo == 'F' || sexo == 'f' && anos > 10){
            salario = (salario * 1.25);
        } else{
            salario = (salario + 100);
        }
        System.out.println("Código do funcionário: " + codigof);
        System.out.println("Sexo do funcionário: " + sexo);
        System.out.println("Tempo do funcionário na empresa: " + anos);
        System.out.println("Salário final com o bônus: " + salario);
        
    }
    
}