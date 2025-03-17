package edu.tecjerez.topicos.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class VentanaInicio extends JFrame {
	
	private JMenu figuras;

	public VentanaInicio() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Figuras");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setVisible(true);

		JMenuBar menuBar = new JMenuBar();

		figuras = new JMenu("Figuras");
		figuras.setMnemonic(KeyEvent.VK_A);

		JMenu dosDimensiones = new JMenu("Dos dimensiones");
		
		JMenuItem trianguloItem = new JMenuItem("Triangulo");
		dosDimensiones.add(trianguloItem);

		trianguloItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new VentanaTriangulo();
			}
		});

		JMenuItem romboItem = new JMenuItem("Rombo");
		dosDimensiones.add(romboItem);

		romboItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new VentanaRombo();
			}
		});

		JMenuItem circuloItem = new JMenuItem("Circulo");
		dosDimensiones.add(circuloItem);

		circuloItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new VentanaCirculo();
			}
		});

		JMenuItem elipseItem = new JMenuItem("Elipse");
		dosDimensiones.add(elipseItem);

		elipseItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new VentanaElipse();
			}
		});

		JMenu tresDimensiones = new JMenu("Tres dimensiones");

		JMenuItem piramideItem = new JMenuItem("Piramide");
		tresDimensiones.add(piramideItem);

		piramideItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new VentanaPiramide();
			}
		});

		JMenuItem conoItem = new JMenuItem("Cono");
		tresDimensiones.add(conoItem);
		conoItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new VentanaCono();
			}
		});

		figuras.add(dosDimensiones);
		figuras.add(tresDimensiones);

		

		menuBar.add(figuras);

		setJMenuBar(menuBar);

		JLabel imagenInicioVentana = new JLabel();
		ImageIcon icono = new ImageIcon(getClass().getResource("/imagenesP/InicioVentana2.png"));
		imagenInicioVentana.setBounds(50, 50, 190, 190);
		imagenInicioVentana.setIcon(icono);
		add(imagenInicioVentana);

	}

}
