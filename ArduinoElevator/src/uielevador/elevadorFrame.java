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
import javax.swing.JSplitPane;
import java.awt.Canvas;
import java.awt.Panel;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 435);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(12, 0, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 255, 0));
		panel.add(panel_4);
		
		JPanel panel_14 = new JPanel();
		panel_4.add(panel_14);
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(0, 255, 51));
		panel.add(panel_8);
		
		JPanel panel_15 = new JPanel();
		panel_8.add(panel_15);
		
		JPanel panel_10 = new JPanel();
		panel.add(panel_10);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(0, 255, 102));
		panel.add(panel_12);
		
		JPanel panel_16 = new JPanel();
		panel_12.add(panel_16);
		
		JPanel panel_22 = new JPanel();
		panel.add(panel_22);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(new Color(0, 255, 153));
		panel.add(panel_23);
		
		JPanel panel_17 = new JPanel();
		panel_23.add(panel_17);
		
		JPanel panel_24 = new JPanel();
		panel.add(panel_24);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBackground(new Color(0, 255, 204));
		panel.add(panel_25);
		
		JPanel panel_29 = new JPanel();
		panel_25.add(panel_29);
		
		JPanel panel_26 = new JPanel();
		panel.add(panel_26);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBackground(new Color(0, 255, 255));
		panel.add(panel_27);
		
		JPanel panel_30 = new JPanel();
		panel_27.add(panel_30);
		
		JPanel panel_28 = new JPanel();
		panel.add(panel_28);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(6, 0, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		
		JPanel panel_31 = new JPanel();
		panel_3.add(panel_31);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		
		JPanel panel_32 = new JPanel();
		panel_5.add(panel_32);
		
		JPanel panel_7 = new JPanel();
		panel_1.add(panel_7);
		
		JPanel panel_33 = new JPanel();
		panel_7.add(panel_33);
		
		JPanel panel_9 = new JPanel();
		panel_1.add(panel_9);
		
		JPanel panel_34 = new JPanel();
		panel_9.add(panel_34);
		
		JPanel panel_11 = new JPanel();
		panel_1.add(panel_11);
		
		JPanel panel_35 = new JPanel();
		panel_11.add(panel_35);
		
		JPanel panel_13 = new JPanel();
		panel_1.add(panel_13);
		
		JPanel panel_36 = new JPanel();
		panel_13.add(panel_36);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_18 = new JPanel();
		panel_2.add(panel_18);
		
		JPanel panel_19 = new JPanel();
		panel_18.add(panel_19);
		
		JPanel panel_20 = new JPanel();
		panel_2.add(panel_20);
		
		JPanel panel_21 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_21.getLayout();
		flowLayout.setVgap(75);
		flowLayout.setHgap(50);
		panel_20.add(panel_21);
		
	}

}
