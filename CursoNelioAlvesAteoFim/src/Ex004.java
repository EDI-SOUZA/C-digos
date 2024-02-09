/*Exercício 04
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1008.java
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais.
Exemplos:
Entrada: Saída:
25
100        NUMBER = 25
5.50       SALARY = U$ 550.00

Entrada: Saída:
1
200           NUMBER = 1
20.50         SALARY = U$ 4100.00

Entrada: Saída:
6
145            NUMBER = 6
15.55          SALARY = U$ 2254.75
*/
import java.util.Locale;
import java.util.Scanner;
public class Ex004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int nFuncionario, horasTrabalhadas;
		double salario, salarioFuncionario;
		System.out.println("Digite o número do funcionário = ");
		nFuncionario = sc.nextInt();
		System.out.println("Digite o número de horas trabalhadas = ");
		horasTrabalhadas = sc.nextInt();
		System.out.println("Digite o valor por hora trabalhada = ");
        salario = sc.nextDouble();
        salarioFuncionario = horasTrabalhadas * salario;
        System.out.println("NUMBER = " + nFuncionario);
        System.out.printf("SALARY = U$%.2f",salarioFuncionario);
	}

}
