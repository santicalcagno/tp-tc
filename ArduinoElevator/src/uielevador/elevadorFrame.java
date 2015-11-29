package uielevador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
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

public class elevadorFrame extends JFrame {

	private JPanel contentPane;

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
		
		JPanel panel_47 = new JPanel();
		panel_46.add(panel_47);
		
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
		
		JPanel panel_50 = new JPanel();
		panel_49.add(panel_50);
		
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
		
		JPanel panel_53 = new JPanel();
		panel_52.add(panel_53);
		
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
		
		JPanel panel_56 = new JPanel();
		panel_55.add(panel_56);
		
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
		
		JPanel panel_59 = new JPanel();
		panel_58.add(panel_59);
		
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
		
		JPanel panel_62 = new JPanel();
		panel_61.add(panel_62);
		
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
		panel_19.setLayout(new GridLayout(0, 2, 0, 0));
		imagen boton1 = new imagen();
		panel_19.add(boton1);
		imagen boton2 = new imagen();
		panel_19.add(boton2);		
		
		JPanel panel_37 = new JPanel();
		panel_18.add(panel_37);
		panel_37.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_38 = new JPanel();
		panel_18.add(panel_38);
		panel_38.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_20 = new JPanel();
		panel_2.add(panel_20);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		FlowLayout flowLayout = (FlowLayout) panel_21.getLayout();
		flowLayout.setVgap(75);
		flowLayout.setHgap(50);
		panel_20.add(panel_21);
		
	}

}
