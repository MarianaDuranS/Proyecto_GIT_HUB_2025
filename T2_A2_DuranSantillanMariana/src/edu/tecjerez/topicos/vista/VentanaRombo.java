package edu.tecjerez.topicos.vista;
import edu.tecjerez.topicos.figuras.dosDimensiones.Rombo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaRombo extends JFrame {
	private JTextField diagonalMayorFT, diagonalMenorFT, ladoFT;
    private JLabel areaLbl, perimetroLbl;
    private Rombo rombo = new Rombo();
    
    public VentanaRombo() {
        setTitle("Rombo");
        setSize(400, 200);
        setLayout(new GridLayout(5, 2));

        add(new JLabel("Diagonal Mayor:"));
        diagonalMayorFT = new JTextField();
        add(diagonalMayorFT);

        add(new JLabel("Diagonal Menor:"));
        diagonalMenorFT = new JTextField();
        add(diagonalMenorFT);

        add(new JLabel("Lado:"));
        ladoFT = new JTextField();
        add(ladoFT);

        JButton calcularButton = new JButton("Calcular");
        add(calcularButton);

        areaLbl = new JLabel("Área:");
        add(areaLbl);

        perimetroLbl = new JLabel("Perímetro:");
        add(perimetroLbl);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });

        setVisible(true);
    }

    private void calcular() {
        try {
            double diagonalMayor = Double.parseDouble(diagonalMayorFT.getText());
            double diagonalMenor = Double.parseDouble(diagonalMenorFT.getText());
            double lado = Double.parseDouble(ladoFT.getText());

            double area = rombo.areaRombo(diagonalMayor, diagonalMenor);
            double perimetro = rombo.perimetroRombo(lado);

            areaLbl.setText("Área: " + area);
            perimetroLbl.setText("Perímetro: " + perimetro);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Entrada inválida.");
        }
    
    }
}
