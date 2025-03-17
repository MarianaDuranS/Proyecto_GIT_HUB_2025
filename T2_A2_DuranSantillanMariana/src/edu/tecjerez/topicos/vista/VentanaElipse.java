package edu.tecjerez.topicos.vista;

import edu.tecjerez.topicos.figuras.dosDimensiones.Elipse;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaElipse extends JFrame {

    private JTextField semiejeMayorFT, semiejeMenorFT;
    private JLabel areaLbl, perimetroLbl;
    private Elipse elipse = new Elipse();

    public VentanaElipse() {
        setTitle("Elipse");
        setSize(400, 200);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Semieje Mayor:"));
        semiejeMayorFT = new JTextField();
        add(semiejeMayorFT);

        add(new JLabel("Semieje Menor:"));
        semiejeMenorFT = new JTextField();
        add(semiejeMenorFT);

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
            double semiejeMayor = Double.parseDouble(semiejeMayorFT.getText());
            double semiejeMenor = Double.parseDouble(semiejeMenorFT.getText());

            double area = Elipse.areaElipse(semiejeMayor, semiejeMenor);
            double perimetro = Elipse.perimetroElipse(semiejeMayor, semiejeMenor);

            areaLbl.setText("Área: " + area);
            perimetroLbl.setText("Perímetro: " + perimetro);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Entrada inválida.");
        }
    }
}
