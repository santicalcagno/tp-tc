package control;

import java.io.IOException;
import java.io.InputStream;

import javax.swing.ImageIcon;

import com.fazecast.jSerialComm.SerialPort;

import uielevador.elevadorFrame;
import uielevador.ventana;

public class Main {
	
	
	public static void main(String[] args) {
		//Setup inicial
		SerialPort comPort = SerialPort.getCommPorts()[0];
		comPort.openPort();
		comPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 100, 0);
		InputStream in = comPort.getInputStream();
		elevadorFrame uielevador = new elevadorFrame();
		elevador el = new elevador(0,"cerrado");
		
		
		//Loop principal
		try
		{
			while (true) {
				String line = readLine(in).trim();
				switch (line) {
				case "MotorUp":
					System.out.println("arriba");
					el.subir();
					
					break;
				case "MotorDown":
					System.out.println("abajo");
					el.bajar();
					
					break;
				case "DoorOpen":
					System.out.println("abrir puerta");
					el.abrirPuerta();
					uielevador.getLblNewLabel_3().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/abierto.png")));
					break;
				case "DoorClose":
					System.out.println("cerrar puerta");
					el.cerrarPuerta();
					uielevador.getLblNewLabel_3().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/cerrado.png")));
					break;
				case "e0":
					break;
				case "e1":
					break;
				case "e2":
					break;
				case "e3":
					break;
				case "e4":
					break;
				case "e5":
					break;
				case "i0":
					break;
				case "i1":
					break;
				case "i2":
					break;
				case "i3":
					break;
				case "i4":
					break;
				case "v0":
					break;
				case "v1":
					break;
				case "v2":
					break;
				case "v3":
					break;
				case "v4":
					break;
				case "v5":
					break;
					
					
				default:
					break;
				};
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


