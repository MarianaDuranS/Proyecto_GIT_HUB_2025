package edu.tecjerez.topicos.figuras.dosDimensiones;

public class Circulo {
	public double calcularArea(double radio) {
        double area =Math.PI * radio * radio;
        return area;
    }

    public double calcularPerimetro(double radio) {
        double perimetro= 2 * Math.PI * radio;
        return perimetro;
    }
}
