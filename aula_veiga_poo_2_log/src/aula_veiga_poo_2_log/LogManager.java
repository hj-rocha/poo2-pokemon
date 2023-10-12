package aula_veiga_poo_2_log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogManager {
	
	private PrintWriter  printWriter;

	private static LogManager logManager;
	
	private LogManager(){
		try {
			FileWriter fileWriter = new FileWriter("log.txt", true);
			this.printWriter = new PrintWriter(fileWriter);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static LogManager getInstance(){
		if (logManager == null)
			logManager = new LogManager();

		return logManager;
	}
	
	private String getDateTime() {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).toString();
	}
	
	private String prepareMessage(String Type, String message) {
		return "[" + getDateTime() + "]"+ Type + ":"+ message;
	}
	
	public void logInfo(String msg) {
		this.printWriter.println((prepareMessage("INFO ",msg)));
		this.printWriter.flush();
	}

	public void logWarning(String msg) {
		this.printWriter.println(prepareMessage("WARNING ", msg));
		this.printWriter.flush();
	}
	
	public void logError(String msg) {
		printWriter.print(prepareMessage("ERROR ", msg));
		this.printWriter.flush();
	}
}
