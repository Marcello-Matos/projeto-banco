package bank.study;

public class StaticFinalTeste {

	public static void main(String[] args) {
		StaticFinal sf = new StaticFinal();
		
		sf.setNome("Marcelo");
		
		StaticFinal sf2 = new StaticFinal();
		
		sf2.setNome("Antonio");
		
		System.out.println(sf.getNome());
		System.out.println(sf2.getNome());
		
		System.out.println(StaticFinal.NOME_FINAL);
	}
}
