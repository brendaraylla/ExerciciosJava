package br.com.db1;

public class ExerciciosInteger {
	private Integer resultado;
	private Integer numImpar;

	public Integer getNumImpar() {
		return numImpar;
	}

	public void setNumImpar(Integer numImpar) {
		this.numImpar = numImpar;
	}

	public Integer getResultado() {
		return resultado;
	}

	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}

	public Integer somar(Integer valor1, Integer valor2) {
		return resultado = valor1 + valor2;
	}

	public Integer subtrair(Integer valor1, Integer valor2) {
		return resultado = valor1 - valor2;
	}

	public Integer multiplicar(Integer valor1, Integer valor2) {
		return resultado = valor1 * valor2;
	}

	public Integer dividir(Integer valor1, Integer valor2) {
		return resultado = valor1 / valor2;
	}

	public void numeroPar(Integer valor1) {
		resultado = valor1 % 2;
	}

	public void maior(Integer valor1, Integer valor2) {
		if (valor1 > valor2) {
			resultado = valor1;
		} else {
			resultado = valor2;
		}
	}

	public void numerosImpares(Integer valor1) {
		if (valor1 % 2 == 0) {
			resultado = valor1;
			resultado++;
		}

		numImpar = resultado;
		while (numImpar < 100) {
			System.out.println(numImpar);
			numImpar = numImpar + 2;
		}
	}

}
