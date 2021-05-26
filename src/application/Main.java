package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.valorDollar = teclado.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		CurrencyConverter.valorComprado = teclado.nextDouble();
		
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", CurrencyConverter.conversao()));
		
		teclado.close();
	}

}
