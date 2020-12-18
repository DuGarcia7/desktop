package core;

public class Multipla extends QuestaoSimples {
	
	private String alternativa1;
	private String alternativa2;
	private String alternativa3;
	private String alternativa4;

	
	public Multipla(String enunciado, String resposta, String alternativa1, String alternativa2, String alternativa3,
			String alternativa4) {
		super(enunciado, resposta);
		this.alternativa1 = alternativa1;
		this.alternativa2 = alternativa2;
		this.alternativa3 = alternativa3;
		this.alternativa4 = alternativa4;
	}


	public String aplicarQuestao() {
		return enunciado+
				"\nAlternativa 1: "+alternativa1+
				"\nAlternativa 2: "+alternativa2+
				"\nAlternativa 3: "+alternativa3+
				"\nAlternativa 4: "+alternativa4;

	}
		

}
