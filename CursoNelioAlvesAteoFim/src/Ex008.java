/* Exercício 02
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
Exemplos:

Entrada: Saída:
12        PAR

Entrada: Saída:
-27      IMPAR

Entrada: Saída:
0         PAR */

import java.util.Scanner;
public class Ex008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Digite o valor de x = ");
		x = sc.nextInt();
		if (x % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
			
		}
		sc.close();
	}

}
