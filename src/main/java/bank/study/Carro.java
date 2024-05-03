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

public class Carro {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int kmAtual = 0;
		while (true) {
			System.out.println("Carro ligado, voce quer aumentar ou diminuir a velocidade? Digite sair para finalizar a operacao.");
			System.out.println("Digite (sim) para AUMENTAR e digite (nao) para DIMINUIR.");
			String aumentar = entrada.next();
			if (aumentar.equalsIgnoreCase("sair")) {
				System.out.println("Fim da Operacao.");
				break;
			}
			System.out.println("Qual a quilometragem que voce deseja (aumentar) ou (diminuir).");
			int velocidade = entrada.nextInt();
			if (aumentar.equals("sim")) {
				kmAtual += velocidade;
				
			}else {
				kmAtual -= velocidade;
			}
			System.out.println("A quilometragem atual e:" + kmAtual);
			if (kmAtual >= 0 && kmAtual <= 20) {
				System.out.println("Voce esta de primeira marcha.");
			}else if (kmAtual >= 20 && kmAtual <= 50) {
				System.out.println("Voce esta de segunda marcha.");
			}else if (kmAtual >= 50 && kmAtual <= 90) {
				System.out.println("Voce esta de terceira marcha.");
			}else if (kmAtual >= 90 && kmAtual <= 120) {
				System.out.println("Voce esta de quarta marcha. ");
			}else if (kmAtual >= 120 && kmAtual <= 180) {
				System.out.println("Voce esta de quinta marcha.");
			}else if (kmAtual >= 180 && kmAtual <= 250) {
				System.out.println("Voce esta de sexta marcha.");
			}
	  }
	  entrada.close();
	
	}
}
