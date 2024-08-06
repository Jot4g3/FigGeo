package br.edu.figurasgeometricasespaciais;

public class Paralelepipedo {
	public double base;
	public double altura;
	public double profundidade;
	public double areabase;
	public double arealateral;
	public double areatotal;
	public double volume;
	
	public void calcAreaBase() {
		areabase = base*altura;
	}
	
	public void calcAreaLateral() {
		arealateral = (2*base*profundidade) + (2*altura*profundidade);
	}
	
	public void calcAreaTotal() {
		areatotal = (2*base*altura)+(2*base*profundidade)+(2*altura*profundidade);
	}
	
	public void calcVolume() {
		volume = base*altura*profundidade;
	}
	
	public void listaAtributos() {
		System.out.println("A base do paralep�pedo �: "+base+".");
		System.out.println("A altura do paralep�pedo �: "+altura+".");
		System.out.println("A profundidade do paralep�pedo �: "+profundidade+".");
		System.out.println("A �rea da base do paralep�pedo �: "+areabase+".");
		System.out.println("A �rea lateral do paralep�pedo �: "+arealateral+".");
		System.out.println("A �rea total do paralep�pedo �: "+areatotal+".");
		System.out.println("O volume do paralep�pedo �: "+volume+".");
	}
}
