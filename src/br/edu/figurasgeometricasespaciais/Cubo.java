package br.edu.figurasgeometricasespaciais;

public class Cubo {
	public double lado;
	public double areaface;
	public double arealateral;
	public double areatotal;
	public double volume;
	
	public void calcAreaFace() {
		areaface = lado*lado;
	}
	
	public void calcAreaLateral() {
		arealateral = 4*lado*lado;
	}
	
	public void calcAreaTotal() {
		areatotal = 6*lado*lado;
	}
	
	public void calcVolume() {
		volume = lado*lado*lado;
	}
	
	public void listaAtributos() {
		System.out.println("O lado do cubo �: "+lado+".");
		System.out.println("A �rea da face do cubo �: "+areaface+".");
		System.out.println("A �rea lateral do cubo �: "+arealateral+".");
		System.out.println("A �rea total do cubo �: "+areatotal+".");
		System.out.println("O volume do cubo �: "+volume+".");
	}
}
