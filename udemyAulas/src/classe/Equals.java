package classe;

public class Equals {

	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Fulano";
		u1.email = "fulano@gmail.com";

		Usuario u2 = new Usuario();
		u2.nome = "Fulano";
		u2.email = "fulano@gmail.com";

		System.out.println(u1);
		System.out.println(u2);

		// Ambas comparações serão falsas, caso não tenha criado uma "parametrização"
		// para o equals na classe usuario;

		// Criado a parametrização de como o equals deve "comparar" os objetos, o
		// problema é resolvido
		// no caso, o equals verifica se o nome e email do objeto, são iguais ao do
		// objeto passado como parâmetro

		System.out.println(u1.equals(u2));
		System.out.println(u1 == u2);

		System.out.println(u2.equals(u1));

	}

}
