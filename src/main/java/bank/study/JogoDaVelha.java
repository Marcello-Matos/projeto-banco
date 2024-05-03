package bank.study;

import java.util.Scanner;

public class JogoDaVelha {
	 public static void main(String args[]) {
		 Scanner entrada = new Scanner(System.in);
		 String linha1Coluna1 = " ";
		 String linha2Coluna1 = " ";
		 String linha3Coluna1 = " ";
		 String linha1Coluna2 = " ";
		 String linha2Coluna2 = " ";
		 String linha3Coluna2 = " ";
		 String linha1Coluna3 = " ";
		 String linha2Coluna3 = " ";
		 String linha3Coluna3 = " ";
		 boolean marcacao = true;
		 String xo = " ";
		 while (true) {
			 if (marcacao) {
				 marcacao = false;
				 xo = "x";
			 }else {
				 xo = "0";
				 marcacao = true;
			 }
			 System.out.println("Informe a linha (1 - 3");
			 int linha = entrada.nextInt();
			 System.out.println("Informe a coluna (1 - 3");
			 int coluna = entrada.nextInt();
			 if (linha >= 1 && coluna <= 3 && coluna >= 1 && coluna <= 3) {
	                if (linha == 1 && coluna == 1 && linha1Coluna1.equals(" ")) {
	                    linha1Coluna1 = xo;
	                } else if (linha == 2 && coluna == 1 && linha2Coluna1.equals(" ")) {
	                    linha2Coluna1 = xo;
	                } else if (linha == 3 && coluna == 1 && linha3Coluna1.equals(" ")) {
	                    linha3Coluna1 = xo;
	                } else if (linha == 1 && coluna == 2 && linha1Coluna2.equals(" ")) {
	                    linha1Coluna2 = xo;
	                } else if (linha == 2 && coluna == 2 && linha2Coluna2.equals(" ")) {
	                    linha2Coluna2 = xo;
	                } else if (linha == 3 && coluna == 2 && linha3Coluna2.equals(" ")) {
	                    linha3Coluna2 = xo;
	                } else if (linha == 1 && coluna == 3 && linha1Coluna3.equals(" ")) {
	                    linha1Coluna3 = xo;
	                } else if (linha == 2 && coluna == 3 && linha2Coluna3.equals(" ")) {
	                    linha2Coluna3 = xo;
	                } else if (linha == 3 && coluna == 3 && linha3Coluna3.equals(" ")) {
	                    linha3Coluna3 = xo;
				 System.out.println("Essa posicao ja foi escolhida. Por favor, escolha outra.");
				 continue;
			 }
				 
		 }else {
			 System.out.println("Posicao Invalida. Por favor escolha uma posicao de 1 a 3");
			 continue;
		 }
			 
			 System.out.printf("|-%s-|-%s-|-%s-|\n", linha1Coluna1, linha1Coluna2, linha1Coluna3);
			 System.out.printf("|-%s-|-%s-|-%s-|\n", linha2Coluna1, linha2Coluna2, linha2Coluna3);
			 System.out.printf("|-%s-|-%s-|-%s-|\n", linha3Coluna1, linha3Coluna2, linha3Coluna3);	

		 }
	 } 	
  }
    	
    	
    	


	
