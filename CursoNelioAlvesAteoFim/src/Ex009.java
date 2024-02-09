/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
ordem crescente ou decrescente.
Exemplos:

Entrada: Saída:
6 24      Sao Multiplos

Entrada: Saída:
6 25     Nao sao Multiplos

Entrada: Saída:
24 6     Sao Multiplos  */

import java.util.Scanner;
public class Ex009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A,B;
		System.out.println("Digite o valor de A = ");
		A = sc.nextInt();
		System.out.println("Digite o valor de B = ");
		B = sc.nextInt();
		if (A % B == 0 || B % A == 0 ) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		

	}

}
