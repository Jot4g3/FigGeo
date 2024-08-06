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
		System.out.println("O lado do cubo é: "+lado+".");
		System.out.println("A área da face do cubo é: "+areaface+".");
		System.out.println("A área lateral do cubo é: "+arealateral+".");
		System.out.println("A área total do cubo é: "+areatotal+".");
		System.out.println("O volume do cubo é: "+volume+".");
	}
}
