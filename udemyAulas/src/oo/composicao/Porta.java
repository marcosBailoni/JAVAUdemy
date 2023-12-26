package oo.composicao;

public class Porta {

	boolean estaAberta = false;
	
	void abrirPorta() {
		 estaAberta = true;
	}
	
	void fecharPorta() {
		estaAberta = false;
	}
}
