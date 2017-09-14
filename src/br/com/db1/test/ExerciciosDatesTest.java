package br.com.db1.test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosDates;

public class ExerciciosDatesTest {
	private ExerciciosDates data = new ExerciciosDates();
	private Calendar ano = new GregorianCalendar();

	@Test
	public void bissextoTest() {
		Assert.assertTrue(data.bissexto(2000d));
	}

	@Test
	public void diaUtilTest() {
		ano.set(2017, 8, 8);
		Assert.assertTrue(data.diaUtil(ano.get(Calendar.DAY_OF_WEEK)));
	}

	@Test
	public void idadeTest() {
		ano.set(2016, 8, 14);
		Assert.assertTrue((1) == data.idade(ano));
	}

}
