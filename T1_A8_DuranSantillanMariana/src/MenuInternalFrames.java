import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class VentanaInicio extends JFrame {

	JMenu menuMasters, menuBooking, menuTestPerform, menuPrintng, menuTransaction, menuRepors, menuSettings,
			menuUtilities, menuWindow, menuHelp;
	JInternalFrame infoPaciente;
	JInternalFrame infoPaciente2;
	JDesktopPane desktopPane;

	public VentanaInicio() {
		getContentPane().setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("A8");
		setSize(1250, 650);
		setLocationRelativeTo(null);
		setVisible(true);

		// MENU
		JMenuBar menuBar = new JMenuBar();

		// BarraMenu
		menuMasters = new JMenu("Masters");
		setJMenuBar(menuBar);
		menuBar.add(menuMasters);

		menuBooking = new JMenu("Booking");
		setJMenuBar(menuBar);
		menuBar.add(menuBooking);

		menuTestPerform = new JMenu("Test Perform");
		setJMenuBar(menuBar);
		menuBar.add(menuTestPerform);

		menuPrintng = new JMenu("Printing");
		setJMenuBar(menuBar);
		menuBar.add(menuPrintng);

		menuTransaction = new JMenu("Transaction");
		setJMenuBar(menuBar);
		menuBar.add(menuTransaction);

		menuRepors = new JMenu("Lab Reports");
		setJMenuBar(menuBar);
		menuBar.add(menuRepors);

		menuSettings = new JMenu("Settings");
		setJMenuBar(menuBar);
		menuBar.add(menuSettings);

		menuUtilities = new JMenu("Utilities");
		setJMenuBar(menuBar);
		menuBar.add(menuUtilities);

		menuWindow = new JMenu("Window");
		setJMenuBar(menuBar);
		menuBar.add(menuWindow);

		menuHelp = new JMenu("Help");
		setJMenuBar(menuBar);
		menuBar.add(menuHelp);

		// TOOLBAR

		JToolBar toolBar = new JToolBar();
		toolBar.add(crearBoton("Add", "images/1.png"));

		toolBar.add(crearBoton("Edit", "images/2.png"));

		toolBar.add(crearBoton("Back", "images/3.png"));

		toolBar.add(crearBoton("Next", "images/4.png"));

		toolBar.add(crearBoton("List", "images/5.png"));

		toolBar.add(crearBoton("Save", "images/6.png"));

		toolBar.add(crearBoton("Print", "images/7.png"));

		toolBar.add(crearBoton("Lest", "images/8.png"));

		toolBar.add(crearBoton("Cancel", "images/9.png"));

		toolBar.add(crearBoton("Settings", "images/10.png"));

		toolBar.add(crearBoton("Delete", "images/11.png"));

		toolBar.add(crearBoton("Slip", "images/12.png"));

		toolBar.add(crearBoton("Exit", "images/13.png"));

		add(toolBar, BorderLayout.PAGE_START);

		//

		JDesktopPane desktopPane = new JDesktopPane();
		add(desktopPane, BorderLayout.CENTER);

		infoPaciente = new JInternalFrame();
		infoPaciente.setSize(1245, 220);
		infoPaciente.setLayout(new BorderLayout());
		infoPaciente.setDefaultCloseOperation(HIDE_ON_CLOSE);

		// panel info del paciente

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setVisible(true);

		JLabel txtPatientID = new JLabel("Patient ID:");
		txtPatientID.setBounds(10, 10, 75, 25);
		panel.add(txtPatientID);

		JTextField cajaPatientID = new JTextField(10);
		cajaPatientID.setBounds(90, 10, 100, 25);
		panel.add(cajaPatientID);

		JLabel txtDate = new JLabel("Date");
		txtDate.setBounds(200, 10, 30, 25);
		panel.add(txtDate);

		List<String> fechas = ListaFechas();
		JComboBox<String> comboDate = new JComboBox<>(fechas.toArray(new String[0]));
		comboDate.setBounds(230, 10, 100, 25);
		panel.add(comboDate);

		JLabel txtTime = new JLabel("*Time (hh:mm)");
		txtTime.setBounds(340, 10, 90, 25);
		panel.add(txtTime);

		JTextField cajaTime1 = new JTextField(5);
		cajaTime1.setBounds(430, 10, 20, 25);
		panel.add(cajaTime1);

		JTextField cajaTime2 = new JTextField(5);
		cajaTime2.setBounds(455, 10, 20, 25);
		panel.add(cajaTime2);

		JLabel txtLabNo = new JLabel("Lab No");
		txtLabNo.setBounds(495, 10, 90, 25);
		panel.add(txtLabNo);

		JTextField cajaLabNo = new JTextField(10);
		cajaLabNo.setBounds(540, 10, 100, 25);
		panel.add(cajaLabNo);

		JLabel txtName = new JLabel("Name");
		txtName.setBounds(10, 40, 40, 25);
		panel.add(txtName);

		JComboBox<String> comboName = new JComboBox<>(new String[] { "MR", "MRS", "MS" });
		comboName.setBounds(50, 40, 80, 25);
		panel.add(comboName);

		JTextField cajaName = new JTextField(30);
		cajaName.setBounds(140, 40, 190, 25);
		panel.add(cajaName);

		JLabel txtSex = new JLabel("Sex");
		txtSex.setBounds(10, 70, 30, 25);
		panel.add(txtSex);

		JComboBox<String> comboSex = new JComboBox<>(new String[] { "MALE", "FEMALE" });
		comboSex.setBounds(40, 70, 80, 25);
		panel.add(comboSex);

		JLabel txtAge = new JLabel("Age");
		txtAge.setBounds(130, 70, 30, 25);
		panel.add(txtAge);

		JTextField cajaAge = new JTextField(3);
		cajaAge.setBounds(160, 70, 30, 25);
		panel.add(cajaAge);

		JLabel txtMons = new JLabel("Mons");
		txtMons.setBounds(200, 70, 60, 25);
		panel.add(txtMons);

		JTextField cajaMons = new JTextField(3);
		cajaMons.setBounds(235, 70, 30, 25);
		panel.add(cajaMons);

		JLabel txtDays = new JLabel("Days");
		txtDays.setBounds(270, 70, 30, 25);
		panel.add(txtDays);

		JTextField cajaDays = new JTextField(3);
		cajaDays.setBounds(300, 70, 30, 25);
		panel.add(cajaDays);

		JLabel txtSampleBy = new JLabel("Sample By");
		txtSampleBy.setBounds(340, 70, 70, 25);
		panel.add(txtSampleBy);

		JTextField cajaSampleBy = new JTextField(10);
		cajaSampleBy.setBounds(410, 70, 100, 25);
		panel.add(cajaSampleBy);

		JLabel txtReferredBy = new JLabel("Referred By:");
		txtReferredBy.setBounds(10, 100, 80, 25);
		panel.add(txtReferredBy);

		JTextField cajaReferredBy = new JTextField(20);
		cajaReferredBy.setBounds(90, 100, 100, 25);
		panel.add(cajaReferredBy);

		JLabel txtPanelCode = new JLabel("Panel Code");
		txtPanelCode.setBounds(340, 100, 70, 25);
		panel.add(txtPanelCode);

		JTextField cajaPanelCode = new JTextField(20);
		cajaPanelCode.setBounds(410, 100, 150, 25);
		panel.add(cajaPanelCode);

		JLabel txtPanelD = new JLabel("Panel D");
		txtPanelD.setBounds(340, 130, 50, 25);
		panel.add(txtPanelD);

		JTextField cajaPanelD = new JTextField(20);
		cajaPanelD.setBounds(410, 130, 150, 25);
		panel.add(cajaPanelD);

		JLabel txtEmail = new JLabel("e-mail");
		txtEmail.setBounds(340, 160, 40, 25);
		panel.add(txtEmail);

		JTextField cajaEmail = new JTextField(20);
		cajaEmail.setBounds(410, 160, 150, 25);
		panel.add(cajaEmail);

		infoPaciente.add(panel, BorderLayout.CENTER);
		desktopPane.add(infoPaciente);
		infoPaciente.setLocation(0, 0);
		infoPaciente.setVisible(true);
		
		//
		
		//panel TEST paciente
		infoPaciente2 = new JInternalFrame();
		infoPaciente2.setSize(245, 220);
		infoPaciente2.setLayout(new BorderLayout());
		infoPaciente2.setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		JPanel panelCentral = new JPanel();
		panelCentral.setLayout(null);
		panelCentral.setVisible(true);
		
        JTable tablaPruebas = new JTable(1,5); // Ejemplo de tabla
        JScrollPane scrollPane = new JScrollPane(tablaPruebas);
        panelCentral.add(scrollPane);
        scrollPane.setBounds(0, 0, 1245, 200);
        panelCentral.setBounds(0,300,1245,200);
		infoPaciente2.add(panelCentral, BorderLayout.SOUTH);
		desktopPane.add(infoPaciente2);
		infoPaciente2.setLocation(4, 4);
		infoPaciente2.setVisible(true);
		
		//panel info pagos
		JPanel panelInferior = new JPanel();
		panelInferior.setBackground(Color.CYAN);
		panelInferior.setLayout(null);
		panelInferior.setVisible(true);
		
        JLabel txtHomeC = new JLabel("Home Collection:");
        txtHomeC.setBounds(340, 160, 40, 25);
        panelInferior.add(txtHomeC);
        
        JTextField cajaHomeC = new JTextField(20);
        cajaHomeC.setBounds(410, 160, 150, 25);
        panelInferior.add(cajaHomeC);
        
        
        JLabel txtPaid = new JLabel("Paid");
        txtPaid.setBounds(340, 160, 40, 25);
        panelInferior.add(txtPaid);
        
        JTextField cajaPaid = new JTextField(20);
        cajaPaid.setBounds(410, 160, 150, 25);
        panelInferior.add(cajaPaid);
        
        add(panelInferior, BorderLayout.SOUTH);
	}

	public JButton crearBoton(String nombreBoton, String rutaImagen) {
		JButton boton = new JButton(nombreBoton);
		ImageIcon icono = new ImageIcon(rutaImagen);
		boton.setVerticalTextPosition(SwingConstants.BOTTOM);
		boton.setHorizontalTextPosition(SwingConstants.CENTER);
		boton.setIcon(icono);
		return boton;
	}

	public List<String> ListaFechas() {
		List<String> fechas = new ArrayList<>();
		LocalDate fechaInicio = LocalDate.of(2012, 1, 12);
		LocalDate fechaActual = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		while (!fechaInicio.isAfter(fechaActual)) {
			fechas.add(fechaInicio.format(formatter));
			fechaInicio = fechaInicio.plusDays(1);
		}

		return fechas;
	}
}

public class MenuInternalFrames {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() { // Siemnpre agregar ese codigo

			@Override
			public void run() {

				new VentanaInicio();

			}
		});

	}

}
