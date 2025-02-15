import javax.swing.*;
import java.awt.*;
class VentanaInicio extends JFrame{
	
	GridBagLayout gbl= new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	public VentanaInicio() {
	getContentPane().setLayout(gbl);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setTitle("Layout NULO");
	setSize(500,600);
	setLocationRelativeTo(null);
	setVisible(true);
	
	 gbc.insets = new Insets(5, 5, 5, 5);
	//izquierda
	
	
	JTextArea txtMensaje1= new JTextArea("The classic Form includes all visible fields for this list");
	agregarComponentes(txtMensaje1,0,0,1,2);
	gbc.fill = GridBagConstraints.BOTH; 
	gbl.setConstraints(txtMensaje1, gbc);
	
	JTextArea txtOptions= new JTextArea("Form options");
	agregarComponentes(txtOptions,0,2,1,1);
	gbc.fill = GridBagConstraints.HORIZONTAL; 
	gbl.setConstraints(txtOptions, gbc);
	
	JTextArea txtOptions1= new JTextArea("Include the following");
	agregarComponentes(txtOptions1,0,3,1,1);
	gbc.fill = GridBagConstraints.HORIZONTAL; 
	gbl.setConstraints(txtOptions1, gbc);
	
	JCheckBox checkBoxOptions = new JCheckBox("a litle for your form");
	agregarComponentes(checkBoxOptions,0,4,1,1);
	gbc.fill = GridBagConstraints.HORIZONTAL; 
	gbl.setConstraints(checkBoxOptions, gbc);
	
	JTextField cajaOptions = new JTextField("Suscribe to our mailing list");
	agregarComponentes(cajaOptions,0,5,1,1);
	gbc.fill = GridBagConstraints.HORIZONTAL; 
	gbl.setConstraints(cajaOptions, gbc);
	
	ButtonGroup bg = new ButtonGroup();
	JRadioButton optionsOnly = new JRadioButton("only required fields");
	agregarComponentes(optionsOnly,0,6,1,1);
	gbc.fill = GridBagConstraints.HORIZONTAL; 
	optionsOnly.setSelected(true);
	bg.add(optionsOnly);
	
	JRadioButton optionsAll = new JRadioButton("all fields");
	agregarComponentes(optionsAll,0,7,1,1);
	gbc.fill = GridBagConstraints.HORIZONTAL; 
	optionsAll.setSelected(true);
	bg.add(optionsAll);
	
	JLabel txtTexto2 = new JLabel("(edit required fields in the form builder)");
	agregarComponentes(txtTexto2,0,8,1,1);
	gbc.fill = GridBagConstraints.HORIZONTAL;
	gbl.setConstraints(txtTexto2, gbc);

	JCheckBox checkBoxOptions2 = new JCheckBox("interest group fields");
	agregarComponentes(checkBoxOptions2,0,9,1,1);
	gbc.fill = GridBagConstraints.HORIZONTAL;
	gbl.setConstraints(checkBoxOptions2, gbc);

	JCheckBox checkBoxOptions3 = new JCheckBox("required field indicators");
	agregarComponentes(checkBoxOptions3,0,10,1,1);
	gbc.fill = GridBagConstraints.HORIZONTAL;
	gbl.setConstraints(checkBoxOptions3, gbc);

	JLabel txtTexto3 = new JLabel("Set form width");
	agregarComponentes(txtTexto3,0,11,1,1);
	gbc.fill = GridBagConstraints.HORIZONTAL;
	gbl.setConstraints(txtTexto3, gbc);

	JTextField cajaSetForm = new JTextField("");
	agregarComponentes(cajaSetForm,0,12,1,1);
	gbc.fill = GridBagConstraints.HORIZONTAL;
	gbl.setConstraints(cajaSetForm, gbc);
	
	JLabel txtTexto4 = new JLabel("Enhance your form");
	agregarComponentes(txtTexto4,0,12,1,1);
	gbc.fill = GridBagConstraints.HORIZONTAL; 
	gbl.setConstraints(txtTexto4, gbc);

	JCheckBox checkBoxOptions4 = new JCheckBox("enable evil popup mode");
	agregarComponentes(checkBoxOptions4,0,13,1,1);
	gbc.fill = GridBagConstraints.HORIZONTAL; 
	gbl.setConstraints(checkBoxOptions4, gbc);

	JCheckBox checkBoxOptions5 = new JCheckBox("disable all JavaScript");
	agregarComponentes(checkBoxOptions5,0,14,1,1);
	gbc.fill = GridBagConstraints.HORIZONTAL; 
	gbl.setConstraints(checkBoxOptions5, gbc);

	JCheckBox checkBoxOptions6 = new JCheckBox("include archive link");
	agregarComponentes(checkBoxOptions6,0,15,1,1);
	gbc.fill = GridBagConstraints.HORIZONTAL; 
	gbl.setConstraints(checkBoxOptions6, gbc);
	
	JCheckBox checkBoxOptions7 = new JCheckBox("include MonkeyRewards link");
	agregarComponentes(checkBoxOptions7,0,16,1,1);
	gbc.fill = GridBagConstraints.HORIZONTAL; 
	gbl.setConstraints(checkBoxOptions7, gbc);
	
	//derecha
	JLabel txtPreview = new JLabel("Preview");
	agregarComponentes(txtPreview,1,0,1,1);
	gbc.fill = GridBagConstraints.HORIZONTAL; 
	gbl.setConstraints(txtPreview, gbc);

	JLabel txtEmail = new JLabel("Email Address");
	agregarComponentes(txtEmail,1,2,1,1);
	gbc.fill = GridBagConstraints.HORIZONTAL; 
	gbl.setConstraints(txtEmail, gbc);

	JTextField cajaEmail = new JTextField(5);
	agregarComponentes(cajaEmail,1,3,2,1);
	gbc.fill = GridBagConstraints.HORIZONTAL; 
	gbl.setConstraints(cajaEmail, gbc);

	JLabel txtFName = new JLabel("First Name");
	agregarComponentes(txtFName,1,4,1,1);
	gbc.fill = GridBagConstraints.HORIZONTAL; 
	gbl.setConstraints(txtFName, gbc);

	JTextField cajaFName = new JTextField(5);
	agregarComponentes(cajaFName,1,5,2,1);
	gbc.fill = GridBagConstraints.HORIZONTAL; 
	gbl.setConstraints(cajaFName, gbc);

	JLabel txtLName = new JLabel("Last Name");
	agregarComponentes(txtLName,1,6,1,1);
	gbc.fill = GridBagConstraints.HORIZONTAL; 
	gbl.setConstraints(txtLName, gbc);

	JTextField cajaLName = new JTextField(5);
	agregarComponentes(cajaLName,1,7,2,1);
	gbc.fill = GridBagConstraints.HORIZONTAL; 
	gbl.setConstraints(cajaLName, gbc);


	JButton btnSubscribe = new JButton("Subscribe");
	agregarComponentes(btnSubscribe,1,8,1,1);
	gbl.setConstraints(btnSubscribe, gbc);

	JLabel txtCopyPaste = new JLabel("Copy/paste on to your site");
	agregarComponentes(txtCopyPaste,1,9,1,1);
	gbc.fill = GridBagConstraints.HORIZONTAL; 
	gbl.setConstraints(txtCopyPaste, gbc);

	JTextField cajaCopyPaste = new JTextField(
			"</form> </div> <scrip type= 'text/javascript' src='//s3.amazonaws.com/downalds.mailchimp.com/js/mc-validate.js'></script><script type='textjavascript'>(function($) {window.fnames= new "
					+ "Array();window.ftypes= new Array();fnames[0]='EMAIL';ftypes[0]='email'; fnames[1]='FNAME';ftypes[1]='text';fnames[2]='LNAME;ftypes[2]='text';}(jQuery));var $mcj = jQuery.noConflict(true);</script> <!--End mc_embed_signup-->");
	agregarComponentes(cajaCopyPaste,1,10,2,4);
	gbc.fill = GridBagConstraints.BOTH; 
	gbl.setConstraints(cajaCopyPaste, gbc);
	}
	public void agregarComponentes(JComponent componente ,int x,int y,int w,int h) {
		gbc.gridx=x;
		gbc.gridy=y;
		//anchura de columnas
		gbc.gridwidth=w;
		//altura
		gbc.gridheight=h;
		
		gbl.setConstraints(componente, gbc);
		add(componente);
	}
}
public class TareaGridbagLayout {

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
