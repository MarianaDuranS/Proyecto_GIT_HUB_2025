package edu.tecjerez.topicos.figuras.dosDimensiones;

public class Elipse {
	public static double areaElipse(double semiejeMayor, double semiejeMenor) {
        double area= Math.PI * semiejeMayor * semiejeMenor;
        return area;
    }

    public static double perimetroElipse(double semiejeMayor, double semiejeMenor) {
        double perimetro= Math.PI * (3 * (semiejeMayor + semiejeMenor) - Math.sqrt((3 * semiejeMayor + semiejeMenor) * (semiejeMayor + 3 * semiejeMenor)));
        return perimetro;
    }
}
