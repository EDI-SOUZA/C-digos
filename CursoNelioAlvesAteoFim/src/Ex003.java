/*Exercício 03
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1007.java
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
Exemplos:
Entrada: Saída:
5
6
7
8    DIFERENCA = -26

Entrada: Saída:
5
6
-7
8            DIFERENCA = 86 */
import java.util.Scanner;
public class Ex003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A,B,C,D,diferenca;
		System.out.println("Diga o valor de A = ");
		A = sc.nextInt();
		System.out.println("Diga o valor de B = ");
		B = sc.nextInt();
		System.out.println("Diga o valor de C = ");
		C = sc.nextInt();
		System.out.println("Diga o valor de D = ");
		D = sc.nextInt();
		diferenca = (A * B - C * D);
		System.out.println("DIFERENCA = " + diferenca);
	}

}
