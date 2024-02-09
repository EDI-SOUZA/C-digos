import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		// String(next();) int(nextInt();) double(nextDouble(); char(next().charAt(0);) 
		// TODO Auto-generated method stub
        Scanner ler = new Scanner(System.in);  
		int x;
		System.out.println("Digite um nome. R = ");
		x = ler.nextInt();
		System.out.println("Você digitou: " + x);
        
		ler.close();
	}

}
