package controller;

public class MetodosController {

	public MetodosController() {
		super();
	}
	
	public int contaNumero(int numero, int alvo) {
		int contador = 0;
		if(numero == 0) {
			return 0;
		}
		else {
			if(numero % 10 == alvo) {
				++contador;
			}
			return contador + contaNumero(numero / 10, alvo);
		}
	}

}
//523578, 5

// 0 + 52357, 5, 0
// 0 + 