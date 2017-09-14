package br.com.db1;

public class ExerciciosDouble {
	private Double resultado;

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	public Double menorValor2(Double valor1, Double valor2) {
		return Math.min(10.5, 8.6);
	}

	public Double menorValor3(Double valor1, Double valor2, Double valor3) {
		Double resultadoFinal;
		resultado = Math.min(valor1, valor2);
		resultadoFinal = Math.min(resultado, valor3);
		return resultadoFinal;
	}

	public Double media(Double valor1, Double valor2, Double valor3) {
		resultado = ((valor1) + (valor2) + (valor3)) / 3;
		return resultado;
	}

	public Double areaTriangulo(Double lado, Double altura) {
		resultado = (lado * altura) / 2;
		return resultado;
	}

}
