package bank.study;

import java.util.Scanner;

public class LacoRepeticao {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor:");
		int valor = scan.nextInt();
		double valor30P = valor * 0.3;
		
		for(int i = 0; i < valor; i++) {
			System.out.println(i < valor30P -1  ? "Olá" : "Ola ola");
		}
		
		/*for(int i = 0; i < 10; i++) {
			System.out.println(i >= 4 ? "Olá Olá" : "Olá");
		}*/

	}

}
