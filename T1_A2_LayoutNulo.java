import javax.swing.border.CompoundBorder;
import javax.swing.*;
import java.awt.*;

class VentanaInicio extends JFrame {

	public VentanaInicio() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Layout NULO");
		setSize(600, 500);
		setLocationRelativeTo(null);
		setVisible(true);

		// Parte izquierda

		JLabel txtTexto1 = new JLabel("The Classic Form includes all visible fields for this list");
		txtTexto1.setBounds(4, 0, 200, 60);
		// x , y, ancho, alto
		add(txtTexto1);

		JLabel txtFOptions = new JLabel("Form options");
		txtFOptions.setBounds(4, 30, 200, 60);
		add(txtFOptions);

		JLabel txtMsOptions = new JLabel("Include the following");
		txtMsOptions.setBounds(4, 60, 200, 30);
		add(txtMsOptions);

		JCheckBox checkBoxOptions = new JCheckBox("a litle for your form");
		checkBoxOptions.setBounds(4, 80, 200, 30);
		add(checkBoxOptions);

		JTextField cajaOptions = new JTextField("Suscribe to our mailing list");
		cajaOptions.setBounds(4, 110, 200, 30);
		add(cajaOptions);
		
		ButtonGroup bg = new ButtonGroup();

		JRadioButton optionsOnly = new JRadioButton("only required fields");
		optionsOnly.setBounds(4, 140, 200, 30);
		optionsOnly.setSelected(true);
		add(optionsOnly);
		bg.add(optionsOnly);

		JRadioButton optionsAll = new JRadioButton("all fields");
		optionsAll.setBounds(4, 162, 200, 30);
		optionsAll.setSelected(true);
		add(optionsAll);
		bg.add(optionsAll);

		JLabel txtTexto2 = new JLabel("(edit required fields in the form builder)");
		txtTexto2.setBounds(4, 166, 200, 60);
		add(txtTexto2);

		JCheckBox checkBoxOptions2 = new JCheckBox("interest group fields");
		checkBoxOptions2.setBounds(4, 210, 200, 30);
		add(checkBoxOptions2);

		JCheckBox checkBoxOptions3 = new JCheckBox("required field indicators");
		checkBoxOptions3.setBounds(4, 233, 200, 30);
		add(checkBoxOptions3);

		JLabel txtTexto3 = new JLabel("Set form width");
		txtTexto3.setBounds(4, 250, 200, 60);
		add(txtTexto3);

		JTextField cajaSetForm = new JTextField(5);
		cajaSetForm.setBounds(4, 290, 200, 30);
		add(cajaSetForm);

		JLabel txtTexto4 = new JLabel("Enhance your form");
		txtTexto4.setBounds(4, 310, 200, 60);
		add(txtTexto4);

		JCheckBox checkBoxOptions4 = new JCheckBox("enable evil popup mode");
		checkBoxOptions4.setBounds(4, 350, 200, 30);
		add(checkBoxOptions4);

		JCheckBox checkBoxOptions5 = new JCheckBox("disable all JavaScript");
		checkBoxOptions5.setBounds(4, 370, 200, 30);
		add(checkBoxOptions5);

		JCheckBox checkBoxOptions6 = new JCheckBox("include archive link");
		checkBoxOptions6.setBounds(4, 390, 200, 30);
		add(checkBoxOptions6);

		JCheckBox checkBoxOptions7 = new JCheckBox("include MonkeyRewards link");
		checkBoxOptions7.setBounds(4, 410, 200, 30);
		add(checkBoxOptions7);

		// parte derecha

		JLabel txtPreview = new JLabel("Preview");
		txtPreview.setBounds(220, 0, 200, 60);
		add(txtPreview);

		JLabel txtEmail = new JLabel("Email Address");
		txtEmail.setBounds(220, 30, 200, 60);
		add(txtEmail);

		JTextField cajaEmail = new JTextField(5);
		cajaEmail.setBounds(220, 70, 300, 30);
		add(cajaEmail);

		JLabel txtFName = new JLabel("First Name");
		txtFName.setBounds(220, 90, 200, 60);
		add(txtFName);

		JTextField cajaFName = new JTextField(5);
		cajaFName.setBounds(220, 130, 300, 30);
		add(cajaFName);

		JLabel txtLName = new JLabel("Last Name");
		txtLName.setBounds(220, 150, 200, 60);
		add(txtLName);

		JTextField cajaLName = new JTextField(5);
		cajaLName.setBounds(220, 190, 300, 30);
		add(cajaLName);

		JButton btnSubscribe = new JButton("Subscribe");
		btnSubscribe.setBounds(220, 230, 95, 30);
		add(btnSubscribe);

		JLabel txtCopyPaste = new JLabel("Copy/paste on to your site");
		txtCopyPaste.setBounds(220, 250, 200, 60);
		add(txtCopyPaste);

		JTextField cajaCopyPaste = new JTextField(
				"</form> </div> <scrip type= 'text/javascript' src='//s3.amazonaws.com/downalds.mailchimp.com/js/mc-validate.js'></script><script type='textjavascript'>(function($) {window.fnames= new "
						+ "Array();window.ftypes= new Array();fnames[0]='EMAIL';ftypes[0]='email'; fnames[1]='FNAME';ftypes[1]='text';fnames[2]='LNAME;ftypes[2]='text';}(jQuery));var $mcj = jQuery.noConflict(true);</script> <!--End mc_embed_signup-->");
		cajaCopyPaste.setBounds(220, 265, 300, 180);
		add(cajaCopyPaste);

	}

}

public class T1_A2_LayoutNulo {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new VentanaInicio();
			}

		});

	}

}
