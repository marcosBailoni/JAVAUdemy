package jOptionPanesTests;

public class Meth_JOPT {

	public static String validaResposta(int resultado) {
		if(resultado == 0) {
			return "sim";
		} else if(resultado == 1){
			return "não";
		} else if(resultado == 2) {
			return "calcelado";
		} else {
			return "X";
		}
	}
}
