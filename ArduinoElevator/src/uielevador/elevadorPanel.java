package uielevador;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;

public class elevadorPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public elevadorPanel() {
		setLayout(new GridLayout(5, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 0));
		add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 205, 170));
		add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 0));
		add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(135, 206, 250));
		add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(222, 184, 135));
		add(panel_4);

	}

}
