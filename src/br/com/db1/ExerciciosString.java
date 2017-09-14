package br.com.db1;

public class ExerciciosString {

	private String resultado;

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String letraMaiuscula(String texto) {
		return texto.toUpperCase();
	}

	public String letraMinuscula(String texto) {
		return texto.toLowerCase();
	}

	public Integer qtdLetras(String texto) {
		return (texto.length());
	}

	public Integer qtdLetrasComEspaco(String texto) {
		texto = texto.trim();
		return (texto.length());
	}

	public String primeirasLetras(String texto) {
		return texto.substring(0, 4);
	}

	public String terceiraLetras(String texto) {
		return texto.substring(2);
	}

	public String ultimasLetras(String texto) {
		return texto.substring(texto.length() - 4, texto.length());
	}

	public String substituirNome(String texto) {
		String texto2 = texto.substring(0, texto.indexOf(" "));
		return texto.replace(texto2, "Aluna");
	}

	public String[] textoSeparado(String texto) {
		String[] separado = texto.split(",");
		return separado;
	}

	public Integer qtdVogais(String texto) {
		Integer numVogais = 0;
		texto.toLowerCase();
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				numVogais++;
			}
		}
		return numVogais;
	}

	public String invertido(String texto) {
		String texto2 = new StringBuilder(texto).reverse().toString();
		return texto2;
	}

}
