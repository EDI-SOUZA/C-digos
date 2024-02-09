/* Exercício 06
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1037.java
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
Exemplos:
Entrada: Saída:
25.01       Intervalo (25,50]
Entrada: Saída:
25.00      Intervalo [0,25]
Entrada: Saída:
100.00     Intervalo (75,100]
Entrada: Saída:
-25.02     Fora de intervalo */
import java.util.Locale;
import java.util.Scanner;
public class Ex012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double valor;
		System.out.println("Digite um valor qualquer = ");
		valor = sc.nextDouble();
		if (valor < 0 || valor > 100.00) {
			System.out.println("Fora de intervalo");
		}
		else if (valor <= 25.00) {
			System.out.println("Intervalo [0,25]");
		}
        else if (valor <= 50.00 ) {
			System.out.println("Intervalo [25,50]");
		}
		else if (valor <= 75.00) {
			System.out.println("Intervalo [50,75]");
		}
	    else {
	    	System.out.println("Intervalo [75,100]");
	    }sc.close();
		
	}
	
	

}
