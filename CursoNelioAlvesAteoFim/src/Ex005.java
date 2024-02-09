/*Exercício 05
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1010.java
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
Exemplos:
Entrada: Saída:
12 1 5.30
16 2 5.10         VALOR A PAGAR: R$ 15.50

Entrada: Saída:
13 2 15.30
161 4 5.20    VALOR A PAGAR: R$ 51.40

Entrada: Saída:
1 1 15.10
2 1 15.10      VALOR A PAGAR: R$ 30.20  */
import java.util.Scanner;
import java.util.Locale;
public class Ex005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cPeca1, cPeca2, nPeca1, nPeca2;
		double vUnitarioPeca1, vUnitarioPeca2, vPagar;
		System.out.println("Digite o código da peça1 = ");
		cPeca1 = sc.nextInt();
		System.out.println("Digite o número de peça1 = ");
		nPeca1 = sc.nextInt();
		System.out.println("Digite o valor unitário da peça1 = ");
		vUnitarioPeca1 = sc.nextDouble();
		System.out.println("Digite o código da peça2 = ");
		cPeca2 = sc.nextInt();
		System.out.println("Digite o número da peça2 = ");
		nPeca2 = sc.nextInt();
		System.out.println("Digite o valor unitário da peça2 = ");
		vUnitarioPeca2 = sc.nextDouble();
		vPagar = (nPeca1 * vUnitarioPeca1) + (nPeca2 * vUnitarioPeca2);
		System.out.printf("VALOR A PAGAR: R$ %.2f",vPagar);
		
		
        sc.close();
	}

}
