package br.com.fiap.imposto.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.fiap.imposto.model.Imposto;
import br.com.fiap.imposto.view.TelaImposto;

public class ImpostoController implements ActionListener{
	private Imposto model;
	private TelaImposto tela;

	@Override
	public void actionPerformed(ActionEvent e) {
		model.calcularImposto(tela.getValor());
	}
	
	public ImpostoController(Imposto model, TelaImposto tela) {
		this.model = model;
		this.tela = tela;
	}
	
}
