package uielevador;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class imagen extends javax.swing.JPanel {
	
	private String imagen;
	
	public imagen(String imagen){
		this.setSize(this.getSize());
		this.setImagen(imagen);
	}
	
	public void paint(Graphics grafico){
		Dimension height = this.getSize();
		ImageIcon Img = new ImageIcon(getClass().getResource(imagen));
		grafico.drawImage(Img.getImage(), 22, 2, 60, 60, null);
		setOpaque(false);
		super.paintComponent(grafico);
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
}
