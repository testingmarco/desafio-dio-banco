package com.banco.fortaleza;

import com.banco.fortaleza.controller.ContaCorrente;

public class Main {
	
	public static void main(String[] args) {
		Cliente Marco = new Cliente();
		Marco.setNome("Marco");
		
		Conta cc = new ContaCorrent(Marco);
		Conta poupanca = new ContaPoupanca(Marco);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
