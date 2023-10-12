package aula_veiga_poo_2_log;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {

		LogManager logManager = LogManager.getInstance();
		logManager.logInfo("Ola");

		Calculadora.somar(2.0, 3.0);
		Calculadora.subtrair(2.7, 4.6);
		Calculadora.multiplicar(20.0, 10.0);
		Calculadora.dividir(20.0, 10.0);
		Calculadora.dividir(20.0, 0.0);
		
	}
}
