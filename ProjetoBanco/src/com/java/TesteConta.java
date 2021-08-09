package com.java;

public class TesteConta {
	public static void main(String[] args) {
		Conta cc = new Conta(50.0);
		
		System.out.println(cc.recuperarSaldo());
	}
}
