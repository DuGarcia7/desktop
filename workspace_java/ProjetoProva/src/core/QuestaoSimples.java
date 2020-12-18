package core;

public class QuestaoSimples {
	
	protected String enunciado;
	protected String resposta;
	
	
	public QuestaoSimples(String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.resposta = resposta;
	}
	
	public String aplicarQuestao() {
		return enunciado;
	}
	
	public boolean corrigirQuestao(String respostaQuestao) {
		if (respostaQuestao.equals(resposta)) {
			return true;
		}
		return false;
	}
	
	
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}


	public String getResposta() {
		return resposta;
	}


	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
		

}
