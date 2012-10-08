package util;

import java.io.*;

public class Logger {
	
	private static Logger loggerInstance = null;
	private FileWriter theWriter = null;
	
	private Logger() throws IOException {
		
		theWriter = new FileWriter(new File("log.txt"));
	}
	
	public static Logger getInstance(){
		
		if(loggerInstance == null)
			try {
				loggerInstance = new Logger();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return loggerInstance;
	}
	
	public void write(String theMessage) {
		try {
			theWriter.write(theMessage);
			theWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
