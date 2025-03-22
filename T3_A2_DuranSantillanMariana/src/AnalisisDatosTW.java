import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

class VentanaInicio extends JFrame {
	JLabel txtSi, txtNo;
	JProgressBar progressBar;

	public VentanaInicio() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Analisis de datos");
		setSize(450, 300);
		setLocationRelativeTo(null);
		setVisible(true);

		JLabel txtTitulo = new JLabel("RESULTADO DE LA ENCUESTA");
		txtTitulo.setBounds(120, 10, 190, 50);
		add(txtTitulo);

		txtSi = new JLabel("SI");
		txtSi.setBounds(100, 200, 100, 50);
		add(txtSi);

		txtNo = new JLabel("NO");
		txtNo.setBounds(300, 200, 100, 50);
		add(txtNo);

		progressBar = new JProgressBar(0, 100);
		progressBar.setBounds(50, 180, 350, 30);
		progressBar.setStringPainted(true);
		add(progressBar);

	}
}

class Resultados {
	boolean[] resultados = new boolean[10000000];
	Random resultadosA = new Random();

	public void generadorResultadosAleatorios() {
		for (int i = 0; i < resultados.length; i++) {
			resultados[i] = resultadosA.nextBoolean();
		}
	}

}

class MostrarResultados implements Runnable {
	Resultados resultados;
	VentanaInicio ventana;

	public MostrarResultados(Resultados resultados, VentanaInicio ventana) {
		this.resultados = resultados;
		this.ventana = ventana;
	}

	@Override
	public void run() {
		int[] contadores = { 0, 0 };

		for (boolean resultado : resultados.resultados) {
			if (resultado) {
				contadores[0]++;
			} else {
				contadores[1]++;
			}
		}

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				ventana.txtSi.setText("SI: " + contadores[0]);
				ventana.txtNo.setText("NO: " + contadores[1]);
			}
		});
	}
}

class GenerarHistograma implements Runnable {
	Resultados resultados;
	VentanaInicio ventana;

	public GenerarHistograma(Resultados resultados, VentanaInicio ventana) {
		this.resultados = resultados;
		this.ventana = ventana;
	}

	@Override
	public void run() {
		int contadorSi = 0;
		for (boolean resultado : resultados.resultados) {
			if (resultado) {
				contadorSi++;
			}
		}
		double porcentajeSi = (double) contadorSi / resultados.resultados.length * 100;
		for (int i = 0; i <= 100; i++) {
			actualizarBarraProgreso(i);
			if (i >= (int) porcentajeSi) {
				break;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}

	private void actualizarBarraProgreso(int progreso) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				ventana.progressBar.setValue(progreso);
			}
		});
	}
}

public class AnalisisDatosTW {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {

				VentanaInicio ventana = new VentanaInicio();
				Resultados resultados = new Resultados();
				resultados.generadorResultadosAleatorios();

				MostrarResultados mostrarResultados = new MostrarResultados(resultados, ventana);
				GenerarHistograma generarHistograma = new GenerarHistograma(resultados, ventana);

				new Thread(mostrarResultados).start();
				new Thread(generarHistograma).start();
			}
		});
	}
}
