package bank.study;

import java.util.Scanner;

public class EnumMain {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Escreve o nome abreviado:");
		String frontEnd = leia.next();
		
		for(DiaDaSemana dia : DiaDaSemana.values()) {
			if(dia.getNomeAbr().equals(frontEnd)) {
				System.out.println(dia.name());
			}
		}
		
		//DiaDaSemana dia = DiaDaSemana.DOMINGO;
        //System.out.println("Hoje é " + dia);
	}
	
}
