package edu.tecjerez.topicos.figuras.tresDimensiones;

public class Piramide {
	public double volumenPiramide(double base, double altura) {
        double volumen= (1.0 / 3.0) * base * base * altura;
        return volumen;
    }

    public double areaPiramide(double base, double apotema) {
        double area= base * base + 4 * (base * apotema / 2);
        return area;
    }
}
