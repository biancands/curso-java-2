package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		ContaCorrente cc2 = new ContaCorrente(22, 22);
		
		contas[0] = cc1;
		contas[1] = cc2;
		
		System.out.println(contas[0].getNumero());
		
//		int[] refs = {1,2,3,4,5};
		
		ContaCorrente ref = (ContaCorrente) contas[0];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
	}

}
