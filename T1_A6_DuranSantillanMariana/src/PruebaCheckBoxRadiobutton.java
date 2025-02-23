import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class VentanaInicio extends JFrame implements ActionListener {
	JTextField cajaKilometros;
	ConvertidorDistancias Cd;
	JCheckBox checkBoxTodos;
	JRadioButton radioMillas;
	JTextField cajaResM;
	JRadioButton radioP;
	JTextField cajaResP;
	JRadioButton radioPu;
	JTextField cajaResPu;
	JButton btn;

	public VentanaInicio() {

		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Ejemplo eventos");
		setSize(300, 400);
		setLocationRelativeTo(null);
		setVisible(true);

		JLabel txtTitulo = new JLabel("Ingresa Kilometros");
		add(txtTitulo);
		cajaKilometros = new JTextField(5);
		add(cajaKilometros);
		ButtonGroup bg = new ButtonGroup();

		// objeto
		Cd = new ConvertidorDistancias();

		checkBoxTodos = new JCheckBox("TODOS");
		add(checkBoxTodos);
		checkBoxTodos.addActionListener(this);

		radioMillas = new JRadioButton("Millas");
		radioMillas.setSelected(true);
		add(radioMillas);
		bg.add(radioMillas);
		radioMillas.addActionListener(this);
		cajaResM = new JTextField(5);
		add(cajaResM);

		radioP = new JRadioButton("Pies");
		radioP.setSelected(true);
		add(radioP);
		bg.add(radioP);
		radioP.addActionListener(this);
		cajaResP = new JTextField(5);
		add(cajaResP);

		radioPu = new JRadioButton("Pulgadas");
		radioPu.setSelected(true);
		add(radioPu);
		bg.add(radioPu);
		radioPu.addActionListener(this);

		cajaResPu = new JTextField(5);
		add(cajaResPu);

		btn = new JButton("OK");
		add(btn);
		btn.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object componente = e.getSource();
		double kilometros = Double.parseDouble(cajaKilometros.getText());
		if (componente == btn) {

			if (radioMillas.isSelected()) {
				cajaResM.setText("");
				double millas = Cd.kilometrosAMillas(kilometros);
				cajaResM.setText(String.valueOf(millas));
			}
		} else if (componente == radioP) {
			cajaResP.setText("");
			double pies = Cd.kilometrosAPies(kilometros);
			cajaResP.setText(String.valueOf(pies));

		} else if (componente == radioPu) {
			cajaResPu.setText("");
			double pulgadas = Cd.kilometrosAPulgadas(kilometros);
			cajaResPu.setText(String.valueOf(pulgadas));
		} else if (componente == checkBoxTodos) {
			cajaResM.setText("");
			cajaResP.setText("");
			cajaResPu.setText("");
			
			double millas = Cd.kilometrosAMillas(kilometros);
			cajaResM.setText(String.valueOf(millas));
			
			double pies = Cd.kilometrosAPies(kilometros);
			cajaResP.setText(String.valueOf(pies));
			
			double pulgadas = Cd.kilometrosAPulgadas(kilometros);
			cajaResPu.setText(String.valueOf(pulgadas));
		}
	}
}

public class PruebaCheckBoxRadiobutton {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() { // Siemnpre agregar ese codigo

			@Override
			public void run() {

				new VentanaInicio();

			}
		});
	}

}
