package br.com.fiap.imposto.main;

import br.com.fiap.imposto.controller.ImpostoController;
import br.com.fiap.imposto.model.Pis;
import br.com.fiap.imposto.view.TelaPis;

public class TesteCalculo {

	public static void main(String[] args) {
		Pis model = new Pis();
		TelaPis tela = new TelaPis();
		
		model.addObserver(tela);
		
		ImpostoController controller = new ImpostoController(model, tela);
		
		tela.addController(controller);
	}

}
