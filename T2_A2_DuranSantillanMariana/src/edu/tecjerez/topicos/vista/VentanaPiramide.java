package edu.tecjerez.topicos.vista;

import edu.tecjerez.topicos.figuras.tresDimensiones.Piramide;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPiramide extends JFrame {

    private JTextField baseFT, alturaFT, apotemaFT;
    private JLabel areaLbl, volumenLbl;
    private Piramide piramide = new Piramide();

    public VentanaPiramide() {
        setTitle("Pirámide");
        setSize(400, 200);
        setLayout(new GridLayout(5, 2));

        add(new JLabel("Base:"));
        baseFT = new JTextField();
        add(baseFT);

        add(new JLabel("Altura:"));
        alturaFT = new JTextField();
        add(alturaFT);

        add(new JLabel("Apotema:"));
        apotemaFT = new JTextField();
        add(apotemaFT);

        JButton calcularButton = new JButton("Calcular");
        add(calcularButton);

        areaLbl = new JLabel("Área:");
        add(areaLbl);

        volumenLbl = new JLabel("Volumen:");
        add(volumenLbl);

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
            double base = Double.parseDouble(baseFT.getText());
            double altura = Double.parseDouble(alturaFT.getText());
            double apotema = Double.parseDouble(apotemaFT.getText());

            double area = piramide.areaPiramide(base, apotema);
            double volumen = piramide.volumenPiramide(base, altura);

            areaLbl.setText("Área: " + area);
            volumenLbl.setText("Volumen: " + volumen);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Entrada inválida.");
        }
    }
}