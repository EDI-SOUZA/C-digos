/*Exercício 01
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1003.java
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos.
Exemplos:
Entrada: Saída:
10
30                 SOMA = 40

Entrada: Saída:
-30
10 SOMA = -20

Entrada: Saída:
0
0        SOMA = 0                */

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int y, x, SOMA;
		System.out.println("Digite y = ");
		y = sc.nextInt();
		System.out.println("Digite x = ");
		x = sc.nextInt();
		SOMA = y + x;
		System.out.println("SOMA = " + SOMA);
		sc.close();
	}   

}
