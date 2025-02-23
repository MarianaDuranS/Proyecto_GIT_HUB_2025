public class ConvertidorDistancias {

	public double kilometrosAMillas(double kilometros) {
		double millas=kilometros/1.6093445;
		return millas;
		
	}
	
	public double kilometrosAPies(double kilometros) {
		double pies=kilometros*3280.84;
		return pies;
		
	}
	
	public double kilometrosAPulgadas(double kilometros) {
		double pulgadas=kilometros*393701;
		return pulgadas;
		
	}
	
}
