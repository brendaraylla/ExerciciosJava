package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosInteger;

public class ExerciciosIntegerTest {

	private ExerciciosInteger calculadora = new ExerciciosInteger();

	@Test
	public void somarTest() {
		Assert.assertTrue(5 == calculadora.somar(3, 2));
	}

	@Test
	public void subtrairTest() {
		calculadora.subtrair(20, 10);
		Assert.assertTrue(10 == calculadora.getResultado());
	}

	@Test
	public void multiplicarTest() {
		calculadora.multiplicar(10, 8);
		Assert.assertTrue(80 == calculadora.getResultado());
	}

	@Test
	public void dividirTest() {
		calculadora.dividir(10, 2);
		Assert.assertTrue(5 == calculadora.getResultado());
	}

	@Test
	public void numeroParTest() {
		calculadora.numeroPar(8);
		Assert.assertTrue(0 == calculadora.getResultado());
	}

	@Test
	public void maiorTest() {
		calculadora.maior(4, 5);
		Assert.assertTrue(5 == calculadora.getResultado());
	}

	@Test
	public void numerosImparesTest() {
		calculadora.numerosImpares(80);
		Assert.assertTrue(81 == calculadora.getResultado());
	}
}
