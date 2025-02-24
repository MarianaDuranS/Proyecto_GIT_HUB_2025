import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.*;
import javax.swing.*;

class VentanaInicio extends JFrame implements ActionListener {

	JTextField pantalla;
	double resultado = 0;
	String ultimaOp = "=";
	boolean opNueva = true;
	double memoria = 0;

	public VentanaInicio() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("CALCULADORA");
		setSize(380, 500);
		setLocationRelativeTo(null);
		setVisible(true);

		pantalla = new JTextField("0");
		pantalla.setEditable(false);
		pantalla.setHorizontalAlignment(JTextField.RIGHT);
		pantalla.setBounds(10, 10, 350, 40);
		add(pantalla);

		JButton mc = new JButton("MC");
		mc.setBounds(10, 60, 55, 30);
		add(mc);
		mc.addActionListener(this);

		JButton mr = new JButton("MR");
		mr.setBounds(70, 60, 55, 30);
		add(mr);
		mr.addActionListener(this);

		JButton mMas = new JButton("M+");
		mMas.setBounds(130, 60, 55, 30);
		add(mMas);
		mMas.addActionListener(this);

		JButton mMenos = new JButton("M-");
		mMenos.setBounds(190, 60, 55, 30);
		add(mMenos);
		mMenos.addActionListener(this);

		JButton ms = new JButton("MS");
		ms.setBounds(250, 60, 55, 30);
		add(ms);
		ms.addActionListener(this);

		JButton m2 = new JButton("M");
		m2.setBounds(310, 60, 50, 30);
		add(m2);
		m2.addActionListener(this);

		JButton porciento = new JButton("%");
		porciento.setBounds(10, 100, 55, 30);
		add(porciento);
		porciento.addActionListener(this);

		JButton raiz = new JButton("√");
		raiz.setBounds(80, 100, 55, 30);
		add(raiz);
		raiz.addActionListener(this);

		JButton xCuadrada = new JButton("x²");
		xCuadrada.setBounds(150, 100, 55, 30);
		add(xCuadrada);
		xCuadrada.addActionListener(this);

		JButton unox = new JButton("1/X");
		unox.setBounds(220, 100, 55, 30);
		add(unox);
		unox.addActionListener(this);

		JButton ce = new JButton("CE");
		ce.setBounds(10, 140, 70, 30);
		add(ce);
		ce.addActionListener(this);

		JButton c = new JButton("C");
		c.setBounds(90, 140, 70, 30);
		add(c);
		c.addActionListener(this);

		JButton regresar = new JButton("←");
		regresar.setBounds(170, 140, 70, 30);
		add(regresar);
		regresar.addActionListener(this);

		JButton dividir = new JButton("÷");
		dividir.setBounds(250, 140, 70, 30);
		add(dividir);
		dividir.addActionListener(this);

		JButton siete = new JButton("7");
		siete.setBounds(10, 180, 90, 50);
		add(siete);
		siete.addActionListener(this);

		JButton ocho = new JButton("8");
		ocho.setBounds(110, 180, 90, 50);
		add(ocho);
		ocho.addActionListener(this);

		JButton nueve = new JButton("9");
		nueve.setBounds(210, 180, 90, 50);
		add(nueve);
		nueve.addActionListener(this);

		JButton multiplicar = new JButton("*");
		multiplicar.setBounds(310, 180, 50, 50);
		add(multiplicar);
		multiplicar.addActionListener(this);

		JButton cuatro = new JButton("4");
		cuatro.setBounds(10, 240, 90, 50);
		add(cuatro);
		cuatro.addActionListener(this);

		JButton cinco = new JButton("5");
		cinco.setBounds(110, 240, 90, 50);
		add(cinco);
		cinco.addActionListener(this);

		JButton seis = new JButton("6");
		seis.setBounds(210, 240, 90, 50);
		add(seis);
		seis.addActionListener(this);

		JButton menos = new JButton("-");
		menos.setBounds(310, 240, 50, 50);
		add(menos);
		menos.addActionListener(this);

		JButton uno = new JButton("1");
		uno.setBounds(10, 300, 90, 50);
		add(uno);
		uno.addActionListener(this);

		JButton dos = new JButton("2");
		dos.setBounds(110, 300, 90, 50);
		add(dos);
		dos.addActionListener(this);

		JButton tres = new JButton("3");
		tres.setBounds(210, 300, 90, 50);
		add(tres);
		tres.addActionListener(this);

		JButton mas = new JButton("+");
		mas.setBounds(310, 300, 50, 50);
		add(mas);
		mas.addActionListener(this);

		JButton masMenos = new JButton("±");
		masMenos.setBounds(10, 360, 90, 50);
		add(masMenos);
		masMenos.addActionListener(this);

		JButton cero = new JButton("0");
		cero.setBounds(110, 360, 90, 50);
		add(cero);
		cero.addActionListener(this);

		JButton punto = new JButton(".");
		punto.setBounds(210, 360, 90, 50);
		add(punto);
		punto.addActionListener(this);

		JButton igual = new JButton("=");
		igual.setBounds(310, 360, 50, 50);
		add(igual);
		igual.addActionListener(this);

	}

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
		/* TODO Auto-generated method stub */}

	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();

		if (comando.equals("0") || comando.equals("1") || comando.equals("2") || comando.equals("3")
				|| comando.equals("4") || comando.equals("5") || comando.equals("6") || comando.equals("7")
				|| comando.equals("8") || comando.equals("9")) {

			if (opNueva) {
				pantalla.setText(comando);
				opNueva = false;
			} else {
				pantalla.setText(pantalla.getText() + comando);
			}

		} else if (comando.equals(".")) {
			if (!pantalla.getText().contains(".")) {
				pantalla.setText(pantalla.getText() + ".");
			}

		} else if (comando.equals("±")) {
			try {
				double valor = Double.parseDouble(pantalla.getText());
				pantalla.setText(String.valueOf(-valor));
			} catch (NumberFormatException ex) {
				pantalla.setText("0");
			}

		} else if (comando.equals("C")) {
			pantalla.setText("0");
			resultado = 0;
			ultimaOp = "=";
			opNueva = true;

		} else if (comando.equals("CE")) {
			pantalla.setText("0");
			opNueva = true;

		} else if (comando.equals("←")) {
			String txt = pantalla.getText();
			if (txt.length() > 1) {
				pantalla.setText(txt.substring(0, txt.length() - 1));
			} else {
				pantalla.setText("0");
				opNueva = true;
			}

		} else if (comando.equals("%")) {
			try {
				double valor = Double.parseDouble(pantalla.getText());
				pantalla.setText(String.valueOf(valor / 100));
				opNueva = true;
			} catch (NumberFormatException ex) {
				pantalla.setText("0");
			}

		} else if (comando.equals("√")) {
			try {
				double valor = Double.parseDouble(pantalla.getText());
				if (valor >= 0) {
					pantalla.setText(String.valueOf(Math.sqrt(valor)));
					opNueva = true;
				} else {
					pantalla.setText("Error");
				}
			} catch (NumberFormatException ex) {
				pantalla.setText("Error");
			}

		} else if (comando.equals("x²")) {
			try {
				double valor = Double.parseDouble(pantalla.getText());
				pantalla.setText(String.valueOf(valor * valor));
				opNueva = true;
			} catch (NumberFormatException ex) {
				pantalla.setText("Error");
			}

		} else if (comando.equals("1/X")) {
			try {
				double valor = Double.parseDouble(pantalla.getText());
				if (valor != 0) {
					pantalla.setText(String.valueOf(1 / valor));
					opNueva = true;
				} else {
					pantalla.setText("Error");
				}
			} catch (NumberFormatException ex) {
				pantalla.setText("Error");
			}

		} else if (comando.equals("+") || comando.equals("-") || comando.equals("*") || comando.equals("÷")) {
			try {
				double valor = Double.parseDouble(pantalla.getText());
				if (ultimaOp.equals("=")) {
					resultado = valor;
				} else {
					calcularResultado(valor);
				}
				ultimaOp = comando;
				opNueva = true;
			} catch (NumberFormatException ex) {
				pantalla.setText("Error");
			}

		} else if (comando.equals("=")) {
			try {
				double valor = Double.parseDouble(pantalla.getText());
				calcularResultado(valor);
				ultimaOp = "=";
				opNueva = true;
			} catch (NumberFormatException ex) {
				pantalla.setText("Error");
			}

		} else if (comando.equals("MC")) {
			memoria = 0;

		} else if (comando.equals("MR")) {
			pantalla.setText(String.valueOf(memoria));
			opNueva = true;

		} else if (comando.equals("M+")) {
			try {
				memoria += Double.parseDouble(pantalla.getText());
			} catch (NumberFormatException ex) {

			}

		} else if (comando.equals("M-")) {
			try {
				memoria -= Double.parseDouble(pantalla.getText());
			} catch (NumberFormatException ex) {

			}

		} else if (comando.equals("MS")) {
			try {
				memoria = Double.parseDouble(pantalla.getText());
			} catch (NumberFormatException ex) {

			}
		} else if (comando.equals("M")) {
			if (memoria != 0) {
				pantalla.setText(String.valueOf(memoria));
				opNueva = true;
			}

		}

	}

	public void calcularResultado(double valor) {
		switch (ultimaOp) {
		case "+":
			resultado += valor;
			break;
		case "-":
			resultado -= valor;
			break;
		case "*":
			resultado *= valor;
			break;
		case "÷":
			if (valor != 0) {
				resultado /= valor;
			} else {
				pantalla.setText("Error");
				return;
			}
			break;
		case "=":
			resultado = valor;
			break;
		}
		pantalla.setText(String.valueOf(resultado));

	}

}

public class CalculadoraWindows {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {

				new VentanaInicio();

			}
		});

	}
}