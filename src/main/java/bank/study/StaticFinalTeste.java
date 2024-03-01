package bank.study;

public class StaticFinalTeste {

	public static void main(String[] args) {
		StaticFinal sf1 = new StaticFinal();
		sf1.nome = "Marcello";
		
		StaticFinal sf2 = new StaticFinal();
		sf2.nome = "Antonio";
		
		StaticFinal sf3 = new StaticFinal();
		sf3.nome = "Mateus";
		
		System.out.println(sf1.nome);
		System.out.println(sf2.nome);
		System.out.println(sf3.nome);
		
		System.out.println(sf1.NOME_FINAL);
		System.out.println(sf3.NOME_FINAL);
	}
}
