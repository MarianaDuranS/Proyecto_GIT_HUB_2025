package edu.tecjerez.topicos.vista;

import edu.tecjerez.topicos.figuras.Triangulo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaTriangulo extends JFrame {

    private JTextField ladoAFT, ladoBFT, ladoCFT;
    private JLabel areaLbl, perimetroLbl;
    private Triangulo triangulo = new Triangulo();

    public VentanaTriangulo() {
        setTitle("Triángulo");
        setSize(400, 200);
        setLayout(new GridLayout(5, 2));

        add(new JLabel("Lado A:"));
        ladoAFT = new JTextField();
        add(ladoAFT);

        add(new JLabel("Lado B:"));
        ladoBFT = new JTextField();
        add(ladoBFT);

        add(new JLabel("Lado C:"));
        ladoCFT = new JTextField();
        add(ladoCFT);

        JButton calcularButton = new JButton("Calcular");
        add(calcularButton);

        areaLbl = new JLabel("Área:");
        add(areaLbl);

        perimetroLbl = new JLabel("SemiPerímetro:");
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
            double ladoA = Double.parseDouble(ladoAFT.getText());
            double ladoB = Double.parseDouble(ladoBFT.getText());
            double ladoC = Double.parseDouble(ladoCFT.getText());

            double area = triangulo.heronFormula(ladoA, ladoB, ladoC);
            double perimetro = triangulo.semiperimetro(ladoA, ladoB, ladoC);
            
            areaLbl.setText("Área: " + area);
            perimetroLbl.setText("Perímetro: " + perimetro);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Entrada inválida.");
        }
    }
}