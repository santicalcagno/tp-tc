package control;

import java.awt.Color;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.ImageIcon;

import com.fazecast.jSerialComm.SerialPort;

import uielevador.elevadorFrame;


public class Main {
	
	
	public static void main(String[] args) {
		//Setup inicial
		SerialPort comPort = SerialPort.getCommPorts()[0];
		comPort.openPort();
		comPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 100, 0);
		InputStream in = comPort.getInputStream();
		elevadorFrame uielevador = new elevadorFrame();
		uielevador.setVisible(true);
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
					try {
						  Thread.sleep(1000);
						} catch (InterruptedException ie) {
						    //Handle exception
						}
					
				switch (el.getPisoActual()) {
				case 0: 
					setAllBlack(uielevador);
					uielevador.getPB().setBackground(Color.ORANGE);
					break;
				case 1: 
					setAllBlack(uielevador);
					uielevador.getP1().setBackground(Color.ORANGE);
					break;
				case 2: 
					setAllBlack(uielevador);
					uielevador.getP2().setBackground(Color.ORANGE);
					break;
				case 3: 
					setAllBlack(uielevador);
					uielevador.getP3().setBackground(Color.ORANGE);
					break;
				case 4: 
					setAllBlack(uielevador);
					uielevador.getP4().setBackground(Color.ORANGE);
					break;
				case 5: 
					setAllBlack(uielevador);
					uielevador.getP5().setBackground(Color.ORANGE);
					break;
					
				}
				
				
					break;
				case "MotorDown":
					System.out.println("abajo");
					el.bajar();
					try {
						  Thread.sleep(1000);
						} catch (InterruptedException ie) {
						    //Handle exception
						}
					
				switch (el.getPisoActual()) {
				case 0: 
					setAllBlack(uielevador);
					uielevador.getPB().setBackground(Color.ORANGE);
					break;
				case 1: 
					setAllBlack(uielevador);
					uielevador.getP1().setBackground(Color.ORANGE);
					break;
				case 2: 
					setAllBlack(uielevador);
					uielevador.getP2().setBackground(Color.ORANGE);
					break;
				case 3: 
					setAllBlack(uielevador);
					uielevador.getP3().setBackground(Color.ORANGE);
					break;
				case 4: 
					setAllBlack(uielevador);
					uielevador.getP4().setBackground(Color.ORANGE);
					break;
				case 5: 
					setAllBlack(uielevador);
					uielevador.getP5().setBackground(Color.ORANGE);
					break;
					
				}
					
					break;
				case "DoorOpen":
					System.out.println("abrir puerta");
					el.abrirPuerta();
					uielevador.getEstadoPuerta().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/abierto.png")));
					break;
				case "DoorClose":
					System.out.println("cerrar puerta");
					el.cerrarPuerta();
					uielevador.getEstadoPuerta().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/cerrado.png")));
					break;
				case "e0":
					System.out.println("e0");
					uielevador.getExteriorButton0().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonPrendido.png")));
					break;
				case "e1":
					System.out.println("e1");
					uielevador.getExteriorButton1().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonPrendido.png")));
					break;
				case "e2":
					System.out.println("e2");
					uielevador.getExteriorButton2().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonPrendido.png")));
					break;
				case "e3":
					System.out.println("e3");
					uielevador.getExteriorButton3().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonPrendido.png")));
					break;
				case "e4":
					System.out.println("e4");
					uielevador.getExteriorButton4().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonPrendido.png")));
					break;
				case "e5":					
					System.out.println("e5");
					uielevador.getExteriorButton5().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonPrendido.png")));
					break;
				case "i0":
					System.out.println("i0");
					uielevador.getInteriorButton0().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonPrendido.png")));
					break;
				case "i1":
					System.out.println("i1");
					uielevador.getInteriorButton1().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonPrendido.png")));
					break;
				case "i2":
					System.out.println("i2");
					uielevador.getInteriorButton2().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonPrendido.png")));
					break;
				case "i3":
					System.out.println("i3");
					uielevador.getInteriorButton3().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonPrendido.png")));
					break;
				case "i4":
					System.out.println("i4");
					uielevador.getInteriorButton4().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonPrendido.png")));
					break;
				case "i5":
					System.out.println("i5");
					uielevador.getInteriorButton5().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonPrendido.png")));
					break;
				case "v0":
					System.out.println("v0");
					uielevador.getInteriorButton0().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
					uielevador.getExteriorButton0().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
					break;
				case "v1":
					System.out.println("v1");
					uielevador.getInteriorButton1().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
					uielevador.getExteriorButton1().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
					break;
				case "v2":
					System.out.println("v2");
					uielevador.getInteriorButton2().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
					uielevador.getExteriorButton2().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
					break;
				case "v3":
					System.out.println("v3");
					uielevador.getInteriorButton3().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
					uielevador.getExteriorButton3().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
					break;
				case "v4":
					System.out.println("v4");
					uielevador.getInteriorButton4().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
					uielevador.getExteriorButton4().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
					break;
				case "v5":
					System.out.println("v5");
					uielevador.getInteriorButton5().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
					uielevador.getExteriorButton5().setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
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
	
	private static void setAllBlack(elevadorFrame uielevador){
		uielevador.getPB().setBackground(Color.BLACK);
		uielevador.getP1().setBackground(Color.BLACK);
		uielevador.getP2().setBackground(Color.BLACK);
		uielevador.getP3().setBackground(Color.BLACK);
		uielevador.getP4().setBackground(Color.BLACK);
		uielevador.getP5().setBackground(Color.BLACK);
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


