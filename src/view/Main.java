package view;

import javax.swing.JOptionPane;

import controller.MetodosController;

public class Main {

	public static void main(String[] args) {
		MetodosController metodos = new MetodosController();
		
		int valor = 0;
		int alvo = 0;
		
		do { 
			valor = Integer.parseInt(JOptionPane.showInputDialog("Inserir um numero"));
		}
		while (valor < 10 || valor > 999999);
		
		do { 
			alvo = Integer.parseInt(JOptionPane.showInputDialog("Inserir outro, para buscar quantas vezes ele aparece no inserido anteriormente"));
		}
		while (alvo < 0 || alvo > 9);
		
		
		int resultado = metodos.contaNumero(valor, alvo);

		JOptionPane.showMessageDialog(null, alvo + " aparece "+ resultado + " vez(es) no numero "+ valor);

	}

}
