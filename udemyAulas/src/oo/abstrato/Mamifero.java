package oo.abstrato;

public abstract class Mamifero extends Animal{
	
	public final String mover() {
		return "Saindo do lugar";
	}
	
	public abstract String mamar();
	
}


// implementando mover e construindo o metodo abstrato mamar.