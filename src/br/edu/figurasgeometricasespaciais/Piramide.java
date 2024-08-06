package br.edu.figurasgeometricasespaciais;

public class Piramide {
	//Inferindo que a pir�mide seja de base quadrangular. 
	//Nesse caso para calcular o volume s� � preciso da aresta do quadrado(base) e da aresta lateral.
	public double lado;
	public double aptp;
	public double aptb;
	public double arestalateral;
	public double areabase;
	public double areaface;
	public double arealateral;
	public double areatotal;
	public double altura;
	public double volume;
	
	public void calcAptB() {
		aptb=lado/2;
	}
	
	public void calcAptP() {
		aptp = Math.sqrt(Math.pow(arestalateral,2)-Math.pow((lado/2),2));
	}
	
	public void calcAltura() {
		altura = Math.sqrt(Math.pow(aptp,2)-Math.pow(aptb,2));
	}
	
	public void calcAreaBase() {
		areabase = lado*lado;
	}
	
	public void calcAreaLateral() {
		areaface = (lado*aptp)/2;
		arealateral = 4*areaface;
	}
	
	public void calcAreaTotal() {
		areatotal = areabase+arealateral;
	}
	
	public void calcVolume () {
		volume = 1./3.*areabase*altura;
	}
	
	public void listaAtributos() {
		System.out.println("O lado do quadrado que forma a base da pir�mide �: "+lado+".");
		System.out.println("O ap�tema da pir�mide �: "+aptp+".");
		System.out.println("O ap�tema da base da pir�mide �: "+aptb+".");
		System.out.println("A �rea da base da pir�mide �: "+areabase+".");
		System.out.println("A �rea da face da pir�mide �: "+areaface+".");
		System.out.println("A �rea lateral da pir�mide �: "+arealateral+".");
		System.out.println("A �rea total da pir�mide �: "+areatotal+".");
		System.out.println("O volume da pir�mide �: "+volume+".");
	}
}
