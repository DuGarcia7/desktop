package userInterface;

import model.Estudante;
import model.Pessoa;

public class Universidade {
	public static void main(String args[]) {
		Pessoa p = new Pessoa();
		Estudante e1 = new Estudante();
		
		e1.setNome("Eduardo");
		e1.setEmail("cegarcia@outlook.com");
		e1.setTelefone("987654321");
		e1.setCurso("Engenharia");
		e1.setNumMatricula(1234);
		
		System.out.println(e1.exibirInfo());
				
	}
	
	

}
