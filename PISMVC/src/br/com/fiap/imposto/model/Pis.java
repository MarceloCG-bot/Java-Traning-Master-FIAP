package br.com.fiap.imposto.model;

import java.util.Observable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("deprecation")
public class Pis extends Observable implements Imposto {
	
	private static final Logger Logger =
			LogManager.getLogger(Pis.class);
	
	private final float ALIQUOTA;
	private float valorDoPis;
	
	public Pis() {
		System.out.println("Construtor do Model chamado");
	}
	
	public float getAliquota() {
		return ALIQUOTA;
	}
	
	public float getValorDoPis() {
		return valorDoPis;
	}
	
	public void calcularImposto(float valor) {
		setChanged();
		valorDoPis = valor * ALIQUOTA;
		Logger.info("Calculando o imposto");
		notifyObservers(valorDoPis);
	}
	
	@Override
	public String toString() {
		return "Pis[ALIQUOTA=" + ALIQUOTA + 
				", valorDoPis=" + valorDoPis + "]";
	}
}
