package br.edu.figurasgeometricasespaciais;

public class Piramide {
	//Inferindo que a pirâmide seja de base quadrangular. 
	//Nesse caso para calcular o volume só é preciso da aresta do quadrado(base) e da aresta lateral.
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
		System.out.println("O lado do quadrado que forma a base da pirâmide é: "+lado+".");
		System.out.println("O apótema da pirâmide é: "+aptp+".");
		System.out.println("O apótema da base da pirâmide é: "+aptb+".");
		System.out.println("A área da base da pirâmide é: "+areabase+".");
		System.out.println("A área da face da pirâmide é: "+areaface+".");
		System.out.println("A área lateral da pirâmide é: "+arealateral+".");
		System.out.println("A área total da pirâmide é: "+areatotal+".");
		System.out.println("O volume da pirâmide é: "+volume+".");
	}
}
