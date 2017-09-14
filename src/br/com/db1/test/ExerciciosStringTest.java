package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosString;

public class ExerciciosStringTest {

	private ExerciciosString texto = new ExerciciosString();
	private ExerciciosString qtdLetras = new ExerciciosString();

	@Test
	public void letraMaiusculaTest() {
		Assert.assertTrue(texto.letraMaiuscula("brenDa").equals("BRENDA"));
	}

	@Test
	public void letraMinusculaTest() {
		Assert.assertTrue(texto.letraMinuscula("BRenDa").equals("brenda"));
	}

	@Test
	public void qtdLetrasTest() {
		Assert.assertTrue(qtdLetras.qtdLetras("DB1START").equals(8));
	}

	@Test
	public void qtdLetrasComEspaco() {
		Assert.assertTrue(qtdLetras.qtdLetrasComEspaco(" DB1START ").equals(8));
	}

	@Test
	public void primeirasLetrasTest() {
		Assert.assertTrue(qtdLetras.primeirasLetras("Brenda").equals("Bren"));
	}

	@Test
	public void terceiraLetrasTest() {
		Assert.assertTrue(qtdLetras.terceiraLetras("Brenda").equals("enda"));
	}

	@Test
	public void ultimasLetrasTest() {
		Assert.assertTrue(qtdLetras.ultimasLetras("Brenda Raylla Izui").equals("Izui"));
	}

	@Test
	public void substituirNomeTest() {
		Assert.assertTrue(qtdLetras.substituirNome("Brenda Izui").equals("Aluna Izui"));
	}

	@Test
	public void textoSeparadoTest() {
		String[] frutas = texto.textoSeparado("banana,maçã,melancia");
		Assert.assertEquals(frutas[0], "banana");
		Assert.assertEquals(frutas[1], "maçã");
		Assert.assertEquals(frutas[2], "melancia");
	}

	@Test
	public void qtdVogaisTest() {
		Assert.assertTrue(texto.qtdVogais("Jesus Cristo que sono!").equals(8));
	}

	@Test
	public void invertidoTest() {
		Assert.assertEquals("adnerB", texto.invertido("Brenda"));
	}
}
