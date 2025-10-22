package lezione_20251022_maven_e_git;

import it.exolab.utils.ScannerWrapper;

public class StudenteTest {

	public static void main(String[] args) {
		
		String nome = ScannerWrapper.getIstanza().getString("scrivi il tuo nome");
		
		
		Studente s = new Studente();
		s.setNome(nome);
		
		

	}

}
