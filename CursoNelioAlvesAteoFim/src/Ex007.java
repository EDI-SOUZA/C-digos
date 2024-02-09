/*Exercício 01
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
Exemplos:

Entrada: Saída:
-10      NEGATIVO

Entrada: Saída:
8         NAO NEGATIVO

Entrada: Saída:
0         NAO NEGATIVO   */

import java.util.Scanner;
public class Ex007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Digite o valor de x = ");
		x = sc.nextInt();
		if (x >= 0 ) {
			System.out.println("NAO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
			
		}
		
		
		sc.close();
	}

}
