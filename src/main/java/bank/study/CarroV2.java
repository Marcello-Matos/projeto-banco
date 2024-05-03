/*
6-	Acelerar o carro até 0km a 20km por hora de primeira marcha.
7-	Acelerar o carro até 20km a 50km por hora de segunda marcha.
8-	Acelerar o carro até 50km a 90km por hora de terceira marcha.
9-	Acelerar o carro até 90km a 120km por hora de quarta marcha.
10-	Acelerar o carro até 120km a 180km por hora de quinta marcha.
11-	Acelerar o carro até 180km a 250km por hora de sexta marcha.

Se o usuário inserir um valor que pode ser para aumentar ou diminuir a velocidade?
Sim / Não
Aumentar ou diminuir a velocidade.
*/
package bank.study;

import java.util.Scanner;

public class CarroV2 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		while (true) {
			System.out.println("Carro ligado, para qual velocidade deseja ir? ou (SAIR)");
			String entradaVelocidade = entrada.next();
			if (entradaVelocidade.equalsIgnoreCase("sair")) {
				System.out.println("Fim da operacao.");
				break;
				
			}
			int velocidade = Integer.parseInt(entradaVelocidade);
			
			if (velocidade >= 0 && velocidade <= 20) {
				System.out.println("Voce esta de primeira marcha.");
			}else if (velocidade >= 20 && velocidade <= 50) {
				System.out.println("Voce esta de segunda marcha.");
			}else if (velocidade >= 50 && velocidade <= 90) {
				System.out.println("Voce esta de terceira marcha.");
			}else if (velocidade >= 90 && velocidade <= 120) {
				System.out.println("Voce esta de quarta marcha.");
			}else if (velocidade >= 120 && velocidade <= 180) {
				System.out.println("Voce esta de quinta marcha.");
			}else if (velocidade >= 180 && velocidade <= 250) {
				System.out.println("Voce esta de sexta marcha.");
			}else {
				System.out.println("Programa finalizado.");
			}
		}
	}
}
