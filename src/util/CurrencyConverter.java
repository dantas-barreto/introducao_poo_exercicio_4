package util;

public class CurrencyConverter {

	public static double IOF = 0.06;
	
	public static double valorDollar;
	public static double valorComprado;
	public static double valorTotal;
	
	public static double conversao() {
		valorTotal = valorDollar * valorComprado;
		valorTotal += valorTotal * IOF; 
		return valorTotal;
	}
}
