package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	Ana sogra = new Ana();
	
	void testeAcessos() {
		//	segredo
		//	facoDentroDeCasa
		//	formaDeFalar
		//	todosSabem

//		System.out.println(sogra.segredo); //segredo é private, só pode ser visualizado da própria classe;
//		System.out.println(sogra.facoDentroDeCasa); //Só é visísvel dentro do mesmo pacote
//		System.out.println(sogra.formaDeFalar); //formaDeFalar, só como pacote ou herança;

		System.out.println(sogra.todosSabem); // public
	}
}
