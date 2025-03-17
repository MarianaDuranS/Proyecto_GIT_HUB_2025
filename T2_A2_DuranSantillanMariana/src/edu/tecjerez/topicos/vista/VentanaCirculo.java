package edu.tecjerez.topicos.vista;

import edu.tecjerez.topicos.figuras.dosDimensiones.Circulo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCirculo extends JFrame {

    private JTextField radioFT;
    private JLabel areaLbl, perimetroLbl;
    private Circulo circulo = new Circulo();

    public VentanaCirculo() {
        setTitle("Círculo");
        setSize(400, 150);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Radio:"));
        radioFT = new JTextField();
        add(radioFT);

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
            double radio = Double.parseDouble(radioFT.getText());

            double area = circulo.calcularArea(radio);
            double perimetro = circulo.calcularPerimetro(radio);

            areaLbl.setText("Área: " + area);
            perimetroLbl.setText("Perímetro: " + perimetro);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Entrada inválida.");
        }
    }
}