package userInterface;

import core.QuestaoSimples;
import core.Multipla;
import core.ComDica;

import java.util.ArrayList;
import java.util.Scanner;

public class ProvaOficial {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		//VERSÃO 1.0
		/*int pontos=0;
		QuestaoSimples prova [];
		prova = new QuestaoSimples [3];
		
		prova [0] = new QuestaoSimples ("Qual o nome do(a) professor(a) do curso?","Isidrao");
		prova [1] = new Multipla ("Qual o maior time do Brasil?","Santos","Cruzeiro","Santos","Gremio","Sao Paulo");
		prova [2] = new ComDica ("Qual o melhor jogador do mundo?","Neymar","Começa com 'Ney' e terminar com 'mar'");
		
		for (int cont=0 ; cont < prova.length ; cont++) {
			System.out.println(prova[cont].aplicarQuestao());
			String resposta = teclado.nextLine(); //comando para escrever a resposta na tela
			if(prova[cont].corrigirQuestao(resposta)) {
				pontos++;
				System.out.println("Resposta "+cont+" correta");
			}
			else {
				System.out.println("Resposta "+cont+" incorreta. Tente de novo!");
			}
		}
		System.out.println("\nVocê acertou "+pontos+" pergunta(s)");*/
		
		//VERSÃO 2.0 - ARRAYLIST
		int pontos=0;
		ArrayList <QuestaoSimples> prova;
		prova = new ArrayList<QuestaoSimples>();
		
		prova.add(new QuestaoSimples ("Qual o nome do(a) professor(a) do curso?","Isidrao"));
		prova.add(new Multipla ("Qual o maior time do Brasil?","Santos","Cruzeiro","Santos","Gremio","Sao Paulo"));
		prova.add(new ComDica ("Qual o melhor jogador do mundo?","Neymar","Começa com 'Ney' e terminar com 'mar'"));
		
		for (QuestaoSimples quest : prova) {
			System.out.println(quest.aplicarQuestao());
			String resposta = teclado.nextLine(); //comando para escrever a resposta na tela
			if(quest.corrigirQuestao(resposta)) {
				pontos++;
				System.out.println("Resposta correta");
			}
			else {
				System.out.println("Resposta incorreta. Tente de novo!");
			}
		}
		System.out.println("\nVocê acertou "+pontos+" pergunta(s)");
		
		teclado.close(); //deve ser sempre o último comando do cógido;
								
	}

}
