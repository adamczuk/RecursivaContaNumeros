package controller;

public class MetodosController {

	public MetodosController() {
		super();
	}

	public int contaNumero(int numero, int alvo) {
		int contador = 0;

		/*
		 * PARADA: quando o valor for 0, retorna 0
		 */
		if (numero == 0) {
			return 0;
		}

		else {
			if (numero % 10 == alvo) {
				++contador;
			}
			return contador + contaNumero(numero / 10, alvo);
		}

		/*
		 * RELACIONAMENTO COM ANTERIOR
		 * 
		 * aqui primeiro eu pego apenas o último numero da variavel (numero % 10) e
		 * comparo com o alvo. Se for igual, soma 1 no contador. Senao, segue com a
		 * chamada recursiva
		 * 
		 * EX: 1234 % 10 retorna apenas 4, que eu comparo se igual ao nosso alvo. Se
		 * for, o contador aumenta em 1
		 * 
		 * 
		 * na chamada recursiva, eu retorno o resultado do contador + a chamada da
		 * recursiva, mas diminuo o numero em uma posição, excluindo o valor que
		 * comparamos acima
		 * 
		 * EX: 1234 / 10 retorna 123, que sera o novo numero onde faremos buscas, mas
		 * excluindo o 4 que ja validei e por isso posso descartar
		 * 
		 * 
		 * na hora de empilhar as recursivas, contador vai ser sempre 0 ou 1. Mas quando
		 * a condicao de parada for atingida, ela retorna 0, e vamos então somando o
		 * resultado do contador de cada chamada que foi empilhada, e desempilhando.
		 * Assim, sabemos quantas vezes o alvo apareceu no número inserido
		 */
	}

}