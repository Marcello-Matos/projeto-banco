package bank.study;

import java.util.Scanner;

public class Teste2 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		for (int i = 1; i < 11; i++) {
			if ( i == 8 ) {
				System.out.println(i + "-");
			}else if (i == 10){
				System.out.println(i + "- -");
			}else {
				System.out.println(i);	
			}
		}
	}
}
