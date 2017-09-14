package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosDouble;

public class ExerciciosDoubleTest {

	private ExerciciosDouble matematica = new ExerciciosDouble();

	@Test
	public void menorValor2Test() {
		Assert.assertTrue((8.6) == matematica.menorValor2(10.5, 8.6));
	}

	@Test
	public void menorValor3Test() {
		Assert.assertTrue((7.3) == matematica.menorValor3(12.4, 7.3, 9.6));
	}

	@Test
	public void mediaTest() {
		Assert.assertTrue((6.3) == matematica.media(3.3, 6.3, 9.3));
	}

	@Test
	public void areaTringuloTest() {
		Assert.assertTrue((4.14) == matematica.areaTriangulo(2.3, 3.6));
	}

}