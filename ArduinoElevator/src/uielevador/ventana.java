package uielevador;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ventana {
	
	JFrame elevador = new JFrame();
	public JLabel estadoElevador = new JLabel("cerrado");
	public JLabel pisoLabel = new JLabel("0");
	
	
	public ventana(String titulo){
				
		Container contenedorPrincipal = elevador.getContentPane();
		contenedorPrincipal.setLayout(new GridLayout(1, 1));
		elevador.add(pisoLabel);
		elevador.add(estadoElevador);
		
		elevador.setSize(300, 300);
		elevador.setLocation(250, 0);
		elevador.setVisible(true);
		
	}

	
}
