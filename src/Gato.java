import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;


@SuppressWarnings("serial")
public class Gato extends JFrame {

	private JPanel contentPane;
	private ImageIcon o = new ImageIcon("Images/o.png");
	private ImageIcon x = new ImageIcon("Images/x.png");
	private int[][] matriz = new int[3][3];
	private String turno = "p1";
	private JTextField txtTurno;
	private JTextField txtGanador;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gato frame = new Gato();
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
	public Gato() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 3, 0, 0));
		
		Utility.llenarMatriz(matriz);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turno == "p1"){
					button.setIcon(o);
					matriz[0][0] = 0;
					Utility.comprobar(matriz,txtGanador, turno);
					turno = "p2";
					txtTurno.setText(turno);
				}
				else{
					button.setIcon(x);
					turno = "p1";
					matriz[0][0] = 1;
					Utility.comprobar(matriz,txtGanador, turno);
					txtTurno.setText(turno);
				}
			}
		});
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(turno == "p1"){
					button_1.setIcon(o);
					matriz[0][1] = 0;
					Utility.comprobar(matriz,txtGanador, turno);
					turno = "p2";
					txtTurno.setText(turno);
				}
				else{
					button_1.setIcon(x);
					matriz[0][1] = 1;
					Utility.comprobar(matriz,txtGanador, turno);
					turno = "p1";
					txtTurno.setText(turno);
				}
			}
		});
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turno == "p1"){
					button_2.setIcon(o);
					matriz[0][2] = 0;
					Utility.comprobar(matriz,txtGanador, turno);
					turno = "p2";
					txtTurno.setText(turno);
				}
				else{
					button_2.setIcon(x);
					matriz[0][2] = 1;
					Utility.comprobar(matriz,txtGanador, turno);
					turno = "p1";
					txtTurno.setText(turno);
				}
			}
		});
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turno == "p1"){
					button_3.setIcon(o);
					
					matriz[1][0] = 0;
					Utility.comprobar(matriz,txtGanador, turno);
					turno = "p2";
					txtTurno.setText(turno);
				}
				else{
					button_3.setIcon(x);
					
					matriz[1][0] = 1;
					Utility.comprobar(matriz,txtGanador, turno);
					turno = "p1";
					txtTurno.setText(turno);
				}
			}
		});
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turno == "p1"){
					button_4.setIcon(o);
					
					matriz[1][1] = 0;
					Utility.comprobar(matriz,txtGanador, turno);
					turno = "p2";
					txtTurno.setText(turno);
				}
				else{
					button_4.setIcon(x);
					
					matriz[1][1] = 1;
					Utility.comprobar(matriz,txtGanador, turno);
					turno = "p1";
					txtTurno.setText(turno);
				}
			}
		});
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turno == "p1"){
					button_5.setIcon(o);
					
					matriz[1][2] = 0;
					Utility.comprobar(matriz,txtGanador, turno);
					turno = "p2";
					txtTurno.setText(turno);
				}
				else{
					button_5.setIcon(x);
					matriz[1][2] = 1;
					Utility.comprobar(matriz,txtGanador, turno);
					turno = "p1";
					txtTurno.setText(turno);
				}
			}
		});
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turno == "p1"){
					button_6.setIcon(o);
					matriz[2][0] = 0;
					Utility.comprobar(matriz,txtGanador, turno);
					turno = "p2";
					txtTurno.setText(turno);
				}
				else{
					button_6.setIcon(x);
					matriz[2][0] = 1;
					Utility.comprobar(matriz,txtGanador, turno);
					turno = "p1";
					txtTurno.setText(turno);
				}
			}
		});
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turno == "p1"){
					button_7.setIcon(o);
					matriz[2][1] = 0;
					Utility.comprobar(matriz,txtGanador, turno);
					turno = "p2";
					txtTurno.setText(turno);
				}
				else{
					button_7.setIcon(x);
					matriz[2][1] = 1;
					Utility.comprobar(matriz,txtGanador, turno);
					turno = "p1";
					txtTurno.setText(turno);
				}
			}
		});
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turno == "p1"){
					button_8.setIcon(o);
					matriz[2][2] = 0;
					Utility.comprobar(matriz,txtGanador, turno);
					turno = "p2";
					txtTurno.setText(turno);
				}
				else{
					button_8.setIcon(x);
					matriz[2][2] = 1;
					Utility.comprobar(matriz,txtGanador, turno);
					turno = "p1";
					txtTurno.setText(turno);
				}
			}
		});
		contentPane.add(button_8);
		
		txtTurno = new JTextField();
		txtTurno.setEnabled(false);
		contentPane.add(txtTurno);
		txtTurno.setColumns(10);
		
		txtGanador = new JTextField();
		txtGanador.setEnabled(false);
		contentPane.add(txtGanador);
		txtGanador.setColumns(10);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button.setIcon(null);
				button_1.setIcon(null);
				button_2.setIcon(null);
				button_3.setIcon(null);
				button_4.setIcon(null);
				button_5.setIcon(null);
				button_6.setIcon(null);
				button_7.setIcon(null);
				button_8.setIcon(null);
				Utility.llenarMatriz(matriz);
				turno = "p1";
				txtTurno.setText(turno);
				txtGanador.setText(null);
				
			}
		});
		contentPane.add(btnReiniciar);
		
		
	}
}
