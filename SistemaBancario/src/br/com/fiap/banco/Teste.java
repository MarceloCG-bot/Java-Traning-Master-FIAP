package br.com.fiap.banco;

public class Teste {

	public static void main(String[] args) {
		/*Conta conta = new Conta();
		ContaCorrente cc = new ContaCorrente();
		
		cc.setAgencia(1111);
		cc.setNumero(2222);
		cc.setTipo("PF");
		cc.setChequeEspecial(1000);
		
		ContaCorrente cc1 = (ContaCorrente) cc; //para funcionar o objeto precisa estar instanciado em seu objeto
		
		if(conta instanceof ContaCorrente) {
			ContaCorrente cc2 = (ContaCorrente) conta; //errado pois nao ha conta corrente dentro da classe conta. Somente dando certo se usar com um verificador if
		}*/
		
		Conta conta1 = new Conta();
		conta1.depositar(1000);
		conta1.retirar(100);
		
		ContaCorrente conta2 = new ContaCorrente();
		conta2.depositar(1000);
		conta2.retirar(100);
		
		Conta conta3 = new ContaCorrente();
		conta3.depositar(1000);
		conta3.retirar(100);
		
		System.out.println("Conta1: " + conta1.getSaldo());
		System.out.println("Conta2: " + conta2.getSaldo());
		System.out.println("Conta3: " + conta3.getSaldo());
	}
}
