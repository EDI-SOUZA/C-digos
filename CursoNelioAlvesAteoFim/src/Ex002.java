
/*Exercício 02
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1002.java
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
Exemplos:
Entrada: Saída:
2.00     A=12.5664

Entrada: Saída:
100.64    A=31819.3103

Entrada: Saída:
150.00   A=70685.7750 */
import java.util.Locale;
import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double area, raio, pi = 3.14159;
		System.out.println("Digite o valor do raio = ");
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2.00 );
		System.out.printf("A= %.4f",area);
	}

}
