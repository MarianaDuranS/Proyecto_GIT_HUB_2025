package edu.tecjerez.topicos.figuras;

public class Triangulo {

    public double heronFormula(double ladoA, double ladoB, double ladoC) {
    	double semiperimetro=(ladoA + ladoB + ladoC) / 2;
    	double area=Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));
        return area; 
    }
    public double semiperimetro(double ladoA, double ladoB, double ladoC) {
    	double perimetro=(ladoA + ladoB + ladoC) / 2;
    	return perimetro;
    }


}
