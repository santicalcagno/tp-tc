package uielevador;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ventana {
	
	JFrame elevador = new JFrame();
	public JLabel estadoElevador = new JLabel("cerrado");
	public JLabel pisoLabel = new JLabel("0");
	Graphics cuadradoElevador = new Graphics() {
		
		@Override
		public void translate(int arg0, int arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setXORMode(Color arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setPaintMode() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setFont(Font arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setColor(Color arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setClip(int arg0, int arg1, int arg2, int arg3) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setClip(Shape arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public FontMetrics getFontMetrics(Font arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Font getFont() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Color getColor() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Rectangle getClipBounds() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Shape getClip() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void fillRoundRect(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void fillRect(int arg0, int arg1, int arg2, int arg3) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void fillPolygon(int[] arg0, int[] arg1, int arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void fillOval(int arg0, int arg1, int arg2, int arg3) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void fillArc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void drawString(AttributedCharacterIterator arg0, int arg1, int arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void drawString(String arg0, int arg1, int arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void drawRoundRect(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void drawPolyline(int[] arg0, int[] arg1, int arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void drawPolygon(int[] arg0, int[] arg1, int arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void drawOval(int arg0, int arg1, int arg2, int arg3) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void drawLine(int arg0, int arg1, int arg2, int arg3) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public boolean drawImage(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8,
				Color arg9, ImageObserver arg10) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean drawImage(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8,
				ImageObserver arg9) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean drawImage(Image arg0, int arg1, int arg2, int arg3, int arg4, Color arg5, ImageObserver arg6) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean drawImage(Image arg0, int arg1, int arg2, int arg3, int arg4, ImageObserver arg5) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean drawImage(Image arg0, int arg1, int arg2, Color arg3, ImageObserver arg4) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean drawImage(Image arg0, int arg1, int arg2, ImageObserver arg3) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void drawArc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void dispose() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public Graphics create() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void copyArea(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void clipRect(int arg0, int arg1, int arg2, int arg3) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void clearRect(int arg0, int arg1, int arg2, int arg3) {
			// TODO Auto-generated method stub
			
		}
	};
	
	public ventana(String titulo){
				
		Container contenedorPrincipal = elevador.getContentPane();
		contenedorPrincipal.setLayout(new GridLayout(1, 1));
		elevador.add(pisoLabel);
		elevador.add(estadoElevador);
		
		elevador.setSize(300, 700);
		elevador.setLocation(250, 0);
		elevador.setVisible(true);
		
	}
	
	public void dibujar(Graphics g){
		
	} 

	
}
