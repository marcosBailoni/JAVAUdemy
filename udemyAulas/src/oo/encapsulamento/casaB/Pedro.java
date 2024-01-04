package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	Ana mae = new Ana();
	
	void testeAcessos() {
		//	segredo
		//	facoDentroDeCasa
		//	formaDeFalar
		//	todosSabem

//		System.out.println(esposa.segredo); segredo é private, só pode ser visualizado da própria classe;
//		System.out.println(mae.facoDentroDeCasa); Só é visísvel dentro do mesmo pacote
//		System.out.println(mae.formaDeFalar); formaDeFalar, veio como herança e não é acessível como instância;
		System.out.println(formaDeFalar);
		System.out.println(mae.todosSabem); // public
		

	}
}
