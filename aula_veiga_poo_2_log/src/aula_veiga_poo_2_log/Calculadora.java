package aula_veiga_poo_2_log;

import java.io.IOException;

public class Calculadora {
	
	private static LogManager logger = LogManager.getInstance();

	public static double somar(Double x, Double y) throws IOException {
		logger.logInfo("Somou " + x + "+" + y);
		return x+y;
	}
	
	public static double subtrair(Double x, Double y) throws IOException {
		logger.logInfo("Subtraiu " + x + "-" + y);
		return x-y;
	}
	
	public static double multiplicar(Double x, Double y) throws IOException {
		logger.logInfo("Multiplicou " + x + "*" + y);
		return x-y;
	}
	
	public static double dividir(Double x, Double y) throws IOException {
		
		if(y == 0) {
			logger.logError("Divisao por zero");
			throw new ArithmeticException("Divisao por zero");
		} else {
		logger.logInfo("Dividiu " + x + "/" + y);
		return x/y;
		}
	}
}
