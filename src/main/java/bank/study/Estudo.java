/*Desenvolva um algoritmo que “desenhe" um calendário, como o exemplo, para um determinado mês, tendo 
como dados:
(i) o número de dias desse mês; 
(ii) qual o dia da semana correspondente ao primeiro dia do mês.
*/

package bank.study;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.List;
import java.util.Scanner;

public class Estudo {
	static String espaco1 = "   ";
	static String espacoInit = "    ";
	static String espacoJava = "  ";
	static int count = 0;
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);		
		System.out.println("Informe os dias do mes:");
		int diasDoMes = entrada.nextInt();
		System.out.println("Quando vai comecar o dia da semana Ex: DOM, SEG, TER, QUA, QUI, SEX, SAB");
		String diaSemana = entrada.next();
		System.out.println("D   S   T   Q   Q   S   S");
		System.out.println("---------------------------");
		if (diaSemana.equals("DOM")) {
			linhas(0,7, diasDoMes);
			
		} else if (diaSemana.equals("SEG")) {
			linhas(1,6, diasDoMes);
			
		}else if (diaSemana.equals("TER")) {
			linhas(2,5, diasDoMes);
			
		}else if (diaSemana.equals("QUA")) {
			linhas(3,4, diasDoMes);
			
		}else if (diaSemana.equals("QUI")) {
			linhas(4,3, diasDoMes);
			
		}else if (diaSemana.equals("SEX")) {
			linhas(5,2, diasDoMes);
			
		}else if (diaSemana.equals("SAB")) { 
			linhas(6,1, diasDoMes);
		}
	}
	public static void linhas(int for1, int for2, int diasDoMes) {
		for (int i = 0; i < for1; i++) {
			System.out.print(espacoInit);
		}
		for (int i = 1; i <= for2; i++) {
			System.out.print(i + espaco1);
		}
		System.out.print("\n");
		for (int i = for2 + 1; i <= diasDoMes; i++) {
			if (count == 7) {
				System.out.print("\n");
				count = 0;
			}
			count++;
			System.out.print(i);
			if (i >= 10) {
				System.out.print(espacoJava);
			}else {
				System.out.print(espaco1);
			}
		}
		
	}

}


