package control;

import java.io.IOException;
import java.io.InputStream;

import com.fazecast.jSerialComm.SerialPort;

public class Main {

	public static void main(String[] args) {
		//Setup inicial
		SerialPort comPort = SerialPort.getCommPorts()[0];
		comPort.openPort();
		comPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 100, 0);
		InputStream in = comPort.getInputStream();
		
		//Loop principal
		try
		{
			while (true) {
				String line = readLine(in).trim();
				switch (line) {
				case "MotorUp":
					System.out.println("arriba");
					break;
				case "MotorDown":
					System.out.println("abajo");
					break;
				case "DoorOpen":
					System.out.println("abrir puerta");
					break;
				case "DoorClose":
					System.out.println("cerrar puerta");
				default:
					break;
				}
				if (line == "exit") break; // Para que Eclipse no joda
			}
			in.close();
		} catch (Exception e) { e.printStackTrace(); }
		comPort.closePort();
	}
	
	private static String readLine(InputStream in) throws IOException {
		String line = "";
		while (true) {
			char c = (char)in.read();
			if (c == '\n') break;
			line += String.valueOf(c);
		}
		return line;
	}
	
}
