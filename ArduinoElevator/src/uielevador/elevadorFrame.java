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
	private JLabel lblNewLabel_3 = new JLabel("");
	private JPanel plantaBaja = new JPanel();
	private JPanel piso4 = new JPanel();
	private JPanel piso3 = new JPanel();
	private JPanel piso2 = new JPanel();
	private JPanel piso1 = new JPanel();
	private JPanel piso5 = new JPanel();

	public JPanel getPlantaBaja() {
		return plantaBaja;
	}

	public void setPlantaBaja(JPanel plantaBaja) {
		this.plantaBaja = plantaBaja;
	}

	public JLabel getLblNewLabel_3() {
		return lblNewLabel_3;
	}

	public void setLblNewLabel_3(JLabel lblNewLabel_3) {
		this.lblNewLabel_3 = lblNewLabel_3;
	}

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
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(6, 0, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(null);
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_15 = new JPanel();
		panel_3.add(panel_15);
		
		JPanel panel_17 = new JPanel();
		panel_3.add(panel_17);
		panel_17.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel_16 = new JPanel();
		panel_17.add(panel_16);
		
		//JPanel panel_62 = new JPanel();
		piso5.setBackground(Color.GREEN);
		piso5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_17.add(piso5);
		
		JPanel panel_63 = new JPanel();
		panel_17.add(panel_63);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_22 = new JPanel();
		panel_5.add(panel_22);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBorder(null);
		panel_5.add(panel_23);
		panel_23.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel_64 = new JPanel();
		panel_23.add(panel_64);
		
		//JPanel panel_65 = new JPanel();
		piso4.setBackground(Color.GREEN);
		piso4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_23.add(piso4);
		
		JPanel panel_66 = new JPanel();
		panel_23.add(panel_66);
		
		JPanel panel_24 = new JPanel();
		panel_5.add(panel_24);
		
		JPanel panel_7 = new JPanel();
		panel_1.add(panel_7);
		panel_7.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_25 = new JPanel();
		panel_7.add(panel_25);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBorder(null);
		panel_7.add(panel_26);
		panel_26.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel_67 = new JPanel();
		panel_26.add(panel_67);
		
		//JPanel panel_68 = new JPanel();
		piso3.setBackground(Color.GREEN);
		piso3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_26.add(piso3);
		
		JPanel panel_69 = new JPanel();
		panel_26.add(panel_69);
		
		JPanel panel_27 = new JPanel();
		panel_7.add(panel_27);
		
		JPanel panel_9 = new JPanel();
		panel_1.add(panel_9);
		panel_9.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_28 = new JPanel();
		panel_9.add(panel_28);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBorder(null);
		panel_9.add(panel_29);
		panel_29.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel_70 = new JPanel();
		panel_29.add(panel_70);
		
		//JPanel panel_71 = new JPanel();
		piso2.setBackground(Color.GREEN);
		piso2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_29.add(piso2);
		
		JPanel panel_72 = new JPanel();
		panel_29.add(panel_72);
		
		JPanel panel_30 = new JPanel();
		panel_9.add(panel_30);
		
		JPanel panel_11 = new JPanel();
		panel_1.add(panel_11);
		panel_11.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_31 = new JPanel();
		panel_11.add(panel_31);
		
		JPanel panel_32 = new JPanel();
		panel_32.setBorder(null);
		panel_11.add(panel_32);
		panel_32.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel_73 = new JPanel();
		panel_32.add(panel_73);
		
		//JPanel panel_74 = new JPanel();
		piso1.setBackground(Color.GREEN);
		piso1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_32.add(piso1);
		
		JPanel panel_75 = new JPanel();
		panel_32.add(panel_75);
		
		
		
		
		JPanel panel_33 = new JPanel();
		panel_11.add(panel_33);
		
		JPanel panel_13 = new JPanel();
		panel_1.add(panel_13);
		panel_13.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_34 = new JPanel();
		panel_13.add(panel_34);
		
		JPanel panel_35 = new JPanel();
		panel_35.setBorder(null);
		panel_13.add(panel_35);
		panel_35.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel_76 = new JPanel();
		panel_35.add(panel_76);
		
		//JPanel panel_77 = new JPanel();
		plantaBaja.setBorder(new LineBorder(new Color(0, 0, 0)));
		plantaBaja.setBackground(Color.GREEN);
		panel_35.add(plantaBaja);
		
		JPanel panel_78 = new JPanel();
		panel_35.add(panel_78);
		
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
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
		panel_21.add(lblNewLabel_4);
		
		JPanel panel_39 = new JPanel();
		panel_19.add(panel_39);
		
		JLabel lblPiso_2 = new JLabel("PISO 1");
		panel_39.add(lblPiso_2);
		
		JPanel panel_40 = new JPanel();
		panel_19.add(panel_40);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
		panel_40.add(label);
		
		JPanel panel_41 = new JPanel();
		panel_19.add(panel_41);
		
		JLabel lblPiso_3 = new JLabel("PISO 2");
		panel_41.add(lblPiso_3);
		
		
		JPanel panel_37 = new JPanel();
		panel_18.add(panel_37);
		panel_37.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_42 = new JPanel();
		panel_37.add(panel_42);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
		panel_42.add(label_1);
		
		JPanel panel_43 = new JPanel();
		panel_37.add(panel_43);
		
		JLabel lblPiso_4 = new JLabel("PISO 3");
		panel_43.add(lblPiso_4);
		
		JPanel panel_44 = new JPanel();
		panel_37.add(panel_44);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
		panel_44.add(label_2);
		
		JPanel panel_47 = new JPanel();
		panel_37.add(panel_47);
		
		JLabel lblPiso_5 = new JLabel("PISO 4");
		panel_47.add(lblPiso_5);
		
		JPanel panel_38 = new JPanel();
		panel_18.add(panel_38);
		panel_38.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_50 = new JPanel();
		panel_38.add(panel_50);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
		panel_50.add(label_3);
		
		JPanel panel_53 = new JPanel();
		panel_38.add(panel_53);
		
		JLabel lblPiso_6 = new JLabel("PISO 5");
		panel_53.add(lblPiso_6);
		
		JPanel panel_56 = new JPanel();
		panel_38.add(panel_56);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/botonApagado.png")));
		panel_56.add(label_4);
		
		JPanel panel_59 = new JPanel();
		panel_38.add(panel_59);
		
		JLabel lblPiso_7 = new JLabel("PLANTA BAJA");
		panel_59.add(lblPiso_7);
		
		JPanel panel_20 = new JPanel();
		panel_2.add(panel_20);
		
		
		lblNewLabel_3.setIcon(new ImageIcon(elevadorFrame.class.getResource("/uielevador/cerrado.png")));
		panel_20.add(lblNewLabel_3);
		
	}

	public JPanel getPiso4() {
		return piso4;
	}

	public void setPiso4(JPanel piso4) {
		this.piso4 = piso4;
	}

	public JPanel getPiso3() {
		return piso3;
	}

	public void setPiso3(JPanel piso3) {
		this.piso3 = piso3;
	}

	public JPanel getPiso2() {
		return piso2;
	}

	public void setPiso2(JPanel piso2) {
		this.piso2 = piso2;
	}

	public JPanel getPiso1() {
		return piso1;
	}

	public void setPiso1(JPanel piso1) {
		this.piso1 = piso1;
	}

	public JPanel getPiso5() {
		return piso5;
	}

	public void setPiso5(JPanel piso5) {
		this.piso5 = piso5;
	}

	public JLabel getLabel_1() {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
