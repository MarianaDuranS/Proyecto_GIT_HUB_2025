package edu.tecjerez.topicos.figuras.tresDimensiones;

public class Cono {
	public double volumenCono(double radio, double altura) {
        double volumen= (1.0 / 3.0) * Math.PI * radio * radio * altura;
        return volumen;
    }

    public double areaCono(double radio, double generatriz) {
        double area= Math.PI * radio * (radio + generatriz);
        return area;
    }
}
