package ex03;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Ex03 {
 /**
 * Escrever um algoritmo que lê três comprimentos de lados a, b, c e os ordena em 
 * ordem decrescente, de modo que o &quot;a&quot; represente o maior dos três lados lidos.
 * Determine, a seguir, o tipo de triângulo que estes três lados formam, com base nos 
 * seguintes casos escrevendo sempre os valores lidos e uma mensagem adequada: 
 * - Se a > b + c: não formam triângulo algum; 
 * - Se a2 = b2 + c2 : formam um triângulo retângulo; 
 * - Se a2 > b2 + c2 : formam um triângulo obtusângulo;
 * - Se a2 < b2 + c2 : formam um acutângulo;
 * - Se forem todos iguais formam um triângulo eqüilátero; 
 * - Se a = b ou b = c ou a = c então formam um triângulo isósceles.
 */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o primeiro lado: ");
        double lado1 = ler.nextDouble();
        System.out.print("Digite o segundo lado: ");
        double lado2 = ler.nextDouble();
        System.out.print("Digite o terceiro lado: ");
        double lado3 = ler.nextDouble();
        double a, b, c;
        
        if (lado1 >= lado2 && lado1 >= lado3) {
            a = lado1;
            b = Math.max(lado2, lado3);
            c = Math.min(lado2, lado3);
        } else if (lado2 >= lado1 && lado2 >= lado3) {
            a = lado2;
            b = Math.max(lado1, lado3);
            c = Math.min(lado1, lado3);
        } else {
            a = lado3;
            b = Math.max(lado1, lado2);
            c = Math.min(lado1, lado2);
        }

        System.out.println("Lados em ordem decrescente: " + a + ", " + b + ", " + c);

        if (a >= b + c) {
            System.out.println("Não formam um triângulo.");
        } else {
            double a2 = a * a;
            double b2_c2 = (b * b) + (c * c);

            if (a2 == b2_c2) {
                System.out.println("Forma um triângulo retângulo.");
            } else if (a2 > b2_c2) {
                System.out.println("Forma um triângulo obtusângulo.");
            } else {
                System.out.println("Forma um triângulo acutângulo.");
            }   
            if (a == b && b == c) {
                System.out.println("Forma um triângulo equilátero.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Forma um triângulo isósceles.");
            }
        }
    }
}