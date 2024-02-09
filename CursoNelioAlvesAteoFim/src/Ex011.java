/* Exercício 05
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1038.java
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
seguir, calcule e mostre o valor da conta a pagar.
Exemplos:
	
Entrada: Saída:
3 2      Total: R$ 10.00

Entrada: Saída:
2 3          Total: R$ 13.50 */

import java.util.Locale;
import java.util.Scanner;
public class Ex011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		int codigoItem,quantidadeItem;
		double valorAPagar;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código do item = ");
		codigoItem = sc.nextInt();
		System.out.println("Digite a quantidade do item = ");
		quantidadeItem = sc.nextInt();
		if (codigoItem == 1) {
			double cachorroQuente = 4.00 * quantidadeItem;
			System.out.printf("TOTAL: R$ %.2f", cachorroQuente );
			}
		else if (codigoItem == 2 ) {
			double xSalada = 4.50 * quantidadeItem;
			System.out.printf("TOTAL: R$ %.2f", xSalada);
		}
		else if (codigoItem == 3) {
			double xBacon = 5.00 * 	quantidadeItem;
			System.out.printf("TOTAL: R$ %.2f", xBacon);
		} 
		else if (codigoItem == 4) {
			double torradaSimples = 2.00 * quantidadeItem;
			System.out.printf("TOTAL: R$ %.2f", torradaSimples);
		}
		else {
			double refrigerante = 1.50 * quantidadeItem;
			System.out.printf("TOTAL: R$ %.2f", refrigerante);
			
		} sc.close();
	}

}
