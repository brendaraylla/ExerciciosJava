package br.com.db1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExerciciosDates {

	public boolean bissexto(Double ano) {

		if ((ano % 4) != 0) {
			return false;
		} else if ((ano % 100) != 0) {
			return true;
		} else if ((ano % 400) != 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean diaUtil(Integer data) {
		if ((data == 1) || (data == 7)) {
			return false;
		} else {
			return true;
		}
	}

	public Integer idade(Calendar date) {
		Calendar anoAtual = new GregorianCalendar();
		return ((anoAtual.get(Calendar.YEAR)) - (date.get(Calendar.YEAR)));
	}
}
