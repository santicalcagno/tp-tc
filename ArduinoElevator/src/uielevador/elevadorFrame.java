package uielevador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JSplitPane;
import java.awt.Canvas;
import java.awt.Panel;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLayeredPane;

public class elevadorFrame extends JFrame {

	private JPanel contentPane;
	
	
	// botones interiores
	private JLabel interiorButton0;
	private JLabel interiorButton1;
	private JLabel interiorButton2;
	private JLabel interiorButton3;
	private JLabel interiorButton4;
	private JLabel interiorButton5;
	// botones exteriores
	private JLabel exteriorButton0;
	private JLabel exteriorButton1;
	private JLabel exteriorButton2;
	private JLabel exteriorButton3;
	private JLabel exteriorButton4;
	
	public JLabel getInteriorButton0() {
		return interiorButton0;
	}

	public void setInteriorButton0(JLabel interiorButton0) {
		this.interiorButton0 = interiorButton0;
	}

	public JLabel getInteriorButton1() {
		return interiorButton1;
	}

	public void setInteriorButton1(JLabel interiorButton1) {
		this.interiorButton1 = interiorButton1;
	}

	public JLabel getInteriorButton2() {
		return interiorButton2;
	}

	public void setInteriorButton2(JLabel interiorButton2) {
		this.interiorButton2 = interiorButton2;
	}

	public JLabel getInteriorButton3() {
		return interiorButton3;
	}

	public void setInteriorButton3(JLabel interiorButton3) {
		this.interiorButton3 = interiorButton3;
	}

	public JLabel getInteriorButton4() {
		return interiorButton4;
	}

	public void setInteriorButton4(JLabel interiorButton4) {
		this.interiorButton4 = interiorButton4;
	}

	public JLabel getInteriorButton5() {
		return interiorButton5;
	}

	public void setInteriorButton5(JLabel interiorButton5) {
		this.interiorButton5 = interiorButton5;
	}

	public JLabel getExteriorButton0() {
		return exteriorButton0;
	}

	public void setExteriorButton0(JLabel exteriorButton0) {
		this.exteriorButton0 = exteriorButton0;
	}

	public JLabel getExteriorButton1() {
		return exteriorButton1;
	}

	public void setExteriorButton1(JLabel exteriorButton1) {
		this.exteriorButton1 = exteriorButton1;
	}

	public JLabel getExteriorButton2() {
		return exteriorButton2;
	}

	public void setExteriorButton2(JLabel exteriorButton2) {
		this.exteriorButton2 = exteriorButton2;
	}

	public JLabel getExteriorButton3() {
		return exteriorButton3;
	}

	public void setExteriorButton3(JLabel exteriorButton3) {
		this.exteriorButton3 = exteriorButton3;
	}

	public JLabel getExteriorButton4() {
		return exteriorButton4;
	}

	public void setExteriorButton4(JLabel exteriorButton4) {
		this.exteriorButton4 = exteriorButton4;
	}

	public JLabel getExteriorButton5() {
		return exteriorButton5;
	}

	public void setExteriorButton5(JLabel exteriorButton5) {
		this.exteriorButton5 = exteriorButton5;
	}

	private JLabel exteriorButton5;
	
	
	

	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					elevadorFrame frame = new elevadorFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public elevadorFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 435);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		setSize(550, 700);	
		setVisible(true);
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(6, 0, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_45 = new JPanel();
		panel_4.add(panel_45);
		
		JLabel lblNewLabel = new JLabel("PISO 5");
		panel_45.add(lblNewLabel);
		
		JPanel panel_46 = new JPanel();
		panel_4.add(panel_46);
		
		exteriorButton5 = new JLabel("");
		exteriorButton5.setHorizontalAlignment(SwingConstants.CENTER);
		exteriorButton5.setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
		panel_46.add(exteriorButton5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_48 = new JPanel();
		panel_6.add(panel_48);
		
		JLabel lblPiso = new JLabel("PISO 4");
		panel_48.add(lblPiso);
		
		JPanel panel_49 = new JPanel();
		panel_6.add(panel_49);
		
		exteriorButton4 = new JLabel("");
		exteriorButton4.setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
		panel_49.add(exteriorButton4);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_8);
		panel_8.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_51 = new JPanel();
		panel_8.add(panel_51);
		
		JLabel lblNewLabel_1 = new JLabel("PISO 3");
		panel_51.add(lblNewLabel_1);
		
		JPanel panel_52 = new JPanel();
		panel_8.add(panel_52);
		
		exteriorButton3 = new JLabel("");
		exteriorButton3.setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
		panel_52.add(exteriorButton3);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_10);
		panel_10.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_54 = new JPanel();
		panel_10.add(panel_54);
		
		JLabel lblNewLabel_2 = new JLabel("PISO 2");
		panel_54.add(lblNewLabel_2);
		
		JPanel panel_55 = new JPanel();
		panel_10.add(panel_55);
		
		exteriorButton2 = new JLabel("");
		exteriorButton2.setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
		panel_55.add(exteriorButton2);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_12);
		panel_12.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_57 = new JPanel();
		panel_12.add(panel_57);
		
		JLabel lblPiso_1 = new JLabel("PISO 1");
		panel_57.add(lblPiso_1);
		
		JPanel panel_58 = new JPanel();
		panel_12.add(panel_58);
		
		exteriorButton1 = new JLabel("");
		exteriorButton1.setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
		panel_58.add(exteriorButton1);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_14);
		panel_14.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_60 = new JPanel();
		panel_14.add(panel_60);
		
		JLabel lblPlantaBaja = new JLabel("PLANTA BAJA");
		panel_60.add(lblPlantaBaja);
		
		JPanel panel_61 = new JPanel();
		panel_14.add(panel_61);
		
		exteriorButton0 = new JLabel("");
		exteriorButton0.setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
		panel_61.add(exteriorButton0);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(6, 0, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(null);
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_15 = new JPanel();
		panel_3.add(panel_15);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.add(panel_16);
		
		JPanel panel_17 = new JPanel();
		panel_3.add(panel_17);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_22 = new JPanel();
		panel_5.add(panel_22);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.add(panel_23);
		
		JPanel panel_24 = new JPanel();
		panel_5.add(panel_24);
		
		JPanel panel_7 = new JPanel();
		panel_1.add(panel_7);
		panel_7.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_25 = new JPanel();
		panel_7.add(panel_25);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.add(panel_26);
		
		JPanel panel_27 = new JPanel();
		panel_7.add(panel_27);
		
		JPanel panel_9 = new JPanel();
		panel_1.add(panel_9);
		panel_9.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_28 = new JPanel();
		panel_9.add(panel_28);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_9.add(panel_29);
		
		JPanel panel_30 = new JPanel();
		panel_9.add(panel_30);
		
		JPanel panel_11 = new JPanel();
		panel_1.add(panel_11);
		panel_11.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_31 = new JPanel();
		panel_11.add(panel_31);
		
		JPanel panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_11.add(panel_32);
		
		
		
		
		JPanel panel_33 = new JPanel();
		panel_11.add(panel_33);
		
		JPanel panel_13 = new JPanel();
		panel_1.add(panel_13);
		panel_13.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_34 = new JPanel();
		panel_13.add(panel_34);
		
		JPanel panel_35 = new JPanel();
		panel_35.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_13.add(panel_35);
		
		JPanel panel_36 = new JPanel();
		panel_13.add(panel_36);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_18 = new JPanel();
		panel_2.add(panel_18);
		panel_18.setLayout(new GridLayout(3, 2, 0, 0));
		
		JPanel panel_19 = new JPanel();
		panel_18.add(panel_19);
		panel_19.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_21 = new JPanel();
		panel_19.add(panel_21);
		
		interiorButton5 = new JLabel("");
		interiorButton5.setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
		panel_21.add(interiorButton5);
		
		JPanel panel_39 = new JPanel();
		panel_19.add(panel_39);
		
		JLabel lblPiso_2 = new JLabel("PISO 5");
		panel_39.add(lblPiso_2);
		
		JPanel panel_40 = new JPanel();
		panel_19.add(panel_40);
		
		interiorButton4 = new JLabel("");
		interiorButton4.setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
		panel_40.add(interiorButton4);
		
		JPanel panel_41 = new JPanel();
		panel_19.add(panel_41);
		
		JLabel lblPiso_3 = new JLabel("PISO 4");
		panel_41.add(lblPiso_3);
		
		
		JPanel panel_37 = new JPanel();
		panel_18.add(panel_37);
		panel_37.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_42 = new JPanel();
		panel_37.add(panel_42);
		
		interiorButton3 = new JLabel("");
		interiorButton3.setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
		panel_42.add(interiorButton3);
		
		JPanel panel_43 = new JPanel();
		panel_37.add(panel_43);
		
		JLabel lblPiso_4 = new JLabel("PISO 3");
		panel_43.add(lblPiso_4);
		
		JPanel panel_44 = new JPanel();
		panel_37.add(panel_44);
		
		interiorButton2 = new JLabel("");
		interiorButton2.setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
		panel_44.add(interiorButton2);
		
		JPanel panel_47 = new JPanel();
		panel_37.add(panel_47);
		
		JLabel lblPiso_5 = new JLabel("PISO 2");
		panel_47.add(lblPiso_5);
		
		JPanel panel_38 = new JPanel();
		panel_18.add(panel_38);
		panel_38.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_50 = new JPanel();
		panel_38.add(panel_50);
		
		interiorButton1 = new JLabel("");
		interiorButton1.setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
		panel_50.add(interiorButton1);
		
		JPanel panel_53 = new JPanel();
		panel_38.add(panel_53);
		
		JLabel lblPiso_6 = new JLabel("PISO 1");
		panel_53.add(lblPiso_6);
		
		JPanel panel_56 = new JPanel();
		panel_38.add(panel_56);
		
		interiorButton0 = new JLabel("");
		interiorButton0.setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
		panel_56.add(interiorButton0);
		
		JPanel panel_59 = new JPanel();
		panel_38.add(panel_59);
		
		JLabel lblPiso_7 = new JLabel("PLANTA BAJA");
		panel_59.add(lblPiso_7);
		
		JPanel panel_20 = new JPanel();
		panel_2.add(panel_20);
		
		
				
	}

	

	

}
