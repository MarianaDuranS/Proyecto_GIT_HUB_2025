package edu.tecjerez.topicos.vista;

import edu.tecjerez.topicos.figuras.tresDimensiones.Cono;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCono extends JFrame {

    private JTextField radioFT, alturaFT, generatrizFT;
    private JLabel areaLbl, volumenLbl;
    private Cono cono = new Cono();

    public VentanaCono() {
        setTitle("Cono");
        setSize(400, 200);
        setLayout(new GridLayout(5, 2));

        add(new JLabel("Radio:"));
        radioFT = new JTextField();
        add(radioFT);

        add(new JLabel("Altura:"));
        alturaFT = new JTextField();
        add(alturaFT);

        add(new JLabel("Generatriz:"));
        generatrizFT = new JTextField();
        add(generatrizFT);

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
            double radio = Double.parseDouble(radioFT.getText());
            double altura = Double.parseDouble(alturaFT.getText());
            double generatriz = Double.parseDouble(generatrizFT.getText());

            double area = cono.areaCono(radio, generatriz);
            double volumen = cono.volumenCono(radio, altura);

            areaLbl.setText("Área: " + area);
            volumenLbl.setText("Volumen: " + volumen);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Entrada inválida.");
        }
    }
}