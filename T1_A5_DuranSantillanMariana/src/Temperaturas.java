import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class VentanaInicio extends JFrame implements ActionListener {
	ConversionTemperaturas Ct;
	JTextField cajaGrados;
	JComboBox<String> TemperaturaAConvertir;
	JComboBox<String> TemperaturaResultado;
	JTextField cajaGradosR;

	public VentanaInicio() {
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("TEMPERATURAS");
		setSize(230, 300);
		setLocationRelativeTo(null);
		setVisible(true);

		Ct = new ConversionTemperaturas();

		JLabel txtNombre = new JLabel("Convetir: ");
		add(txtNombre);

		cajaGrados = new JTextField(5);
		add(cajaGrados);

		TemperaturaAConvertir = new JComboBox<>();
		TemperaturaAConvertir.addItem("Celsius");
		TemperaturaAConvertir.addItem("Fahrenheit");
		TemperaturaAConvertir.addItem("Kelvin");
		TemperaturaAConvertir.addItem("Rankine");
		add(TemperaturaAConvertir);
		TemperaturaAConvertir.addActionListener(this);

		JLabel txtEtiqueta = new JLabel("A: ");
		add(txtEtiqueta);

		TemperaturaResultado = new JComboBox<>();
		TemperaturaResultado.addItem("Celsius");
		TemperaturaResultado.addItem("Fahrenheit");
		TemperaturaResultado.addItem("Kelvin");
		TemperaturaResultado.addItem("Rankine");
		add(TemperaturaResultado);
		TemperaturaResultado.addActionListener(this);

		JLabel txtEtiqueta2 = new JLabel(" = ");
		add(txtEtiqueta2);

		cajaGradosR = new JTextField(5);
		add(cajaGradosR);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			double grados = Double.parseDouble(cajaGrados.getText());

			
			String seleccionTemperaturaConvertir = (String) TemperaturaAConvertir.getSelectedItem();
			String seleccionTemperaturaResultado = (String) TemperaturaResultado.getSelectedItem();

			if (seleccionTemperaturaConvertir.equals("Celsius")) {
				if (seleccionTemperaturaResultado.equals("Fahrenheit")) {
					cajaGradosR.setText("");
					double fahrenheit = Ct.gradosCelsiusAFahrenheit(grados);
					cajaGradosR.setText(String.valueOf(fahrenheit));
				} else if (seleccionTemperaturaResultado.equals("Kelvin")) {
					cajaGradosR.setText("");
					double kelvin = Ct.gradosCelsiusAKelvin(grados);
					cajaGradosR.setText(String.valueOf(kelvin));
				} else if (seleccionTemperaturaResultado.equals("Rankine")) {
					cajaGradosR.setText("");
					double rankine = Ct.gradosCelsiusARankine(grados);
					cajaGradosR.setText(String.valueOf(rankine));
				} else if (seleccionTemperaturaResultado.equals("Celsius")) {
					cajaGradosR.setText(cajaGrados.getText());
				}

			} else if (seleccionTemperaturaConvertir.equals("Fahrenheit")) {
				if (seleccionTemperaturaResultado.equals("Celsius")) {
					cajaGradosR.setText("");
					double celsius = Ct.gradosFahrenheitACelsius(grados);
					cajaGradosR.setText(String.valueOf(celsius));
				} else if (seleccionTemperaturaResultado.equals("Kelvin")) {
					cajaGradosR.setText("");
					double kelvin = Ct.gradosFahrenheitAKelvin(grados);
					cajaGradosR.setText(String.valueOf(kelvin));
				} else if (seleccionTemperaturaResultado.equals("Rankine")) {
					cajaGradosR.setText("");
					double rankine = Ct.gradosFahrenheitARankine(grados);
					cajaGradosR.setText(String.valueOf(rankine));
				} else if (seleccionTemperaturaResultado.equals("Fahrenheit")) {
					cajaGradosR.setText(cajaGrados.getText());
				}
			} else if (seleccionTemperaturaConvertir.equals("Kelvin")) {
				if (seleccionTemperaturaResultado.equals("Celsius")) {
					cajaGradosR.setText("");
					double celsius = Ct.gradosKelvinACelsius(grados);
					cajaGradosR.setText(String.valueOf(celsius));
				} else if (seleccionTemperaturaResultado.equals("Fahrenheit")) {
					cajaGradosR.setText("");
					double fahrenheit = Ct.gradosKelvinAFahrenheit(grados);
					cajaGradosR.setText(String.valueOf(fahrenheit));
				} else if (seleccionTemperaturaResultado.equals("Rankine")) {
					cajaGradosR.setText("");
					double rankine = Ct.gradosKelvinARankine(grados);
					cajaGradosR.setText(String.valueOf(rankine));
				} else if (seleccionTemperaturaResultado.equals("Kelvin")) {
					cajaGradosR.setText(cajaGrados.getText());
				}
			} else if (seleccionTemperaturaConvertir.equals("Rankine")) {
				if (seleccionTemperaturaResultado.equals("Celsius")) {
					cajaGradosR.setText("");
					double celsius = Ct.gradosRankineACelsius(grados);
					cajaGradosR.setText(String.valueOf(celsius));
				} else if (seleccionTemperaturaResultado.equals("Fahrenheit")) {
					cajaGradosR.setText("");
					double fahrenheit = Ct.gradosRankineAFahrenheit(grados);
					cajaGradosR.setText(String.valueOf(fahrenheit));
				} else if (seleccionTemperaturaResultado.equals("Kelvin")) {
					cajaGradosR.setText("");
					double kelvin = Ct.gradosRankineAKelvin(grados);
					cajaGradosR.setText(String.valueOf(kelvin));
				} else if (seleccionTemperaturaResultado.equals("Rankine")) {
					cajaGradosR.setText(cajaGrados.getText());
				}
			}
		} catch (NumberFormatException ex) {
			cajaGradosR.setText("");
		}
	}
}

public class Temperaturas {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {

				new VentanaInicio();

			}
		});
	}

}
