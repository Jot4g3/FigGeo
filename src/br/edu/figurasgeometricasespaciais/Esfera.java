package br.edu.figurasgeometricasespaciais;

public class Esfera {
	public double raio;
	public double area;
	public double volume;
	
	public void calcArea() {
		area = 4 * Math.PI * raio * raio;
	}
	
	public void calcVolume() {
		volume = (4./3.) * Math.PI * raio * raio * raio;
	}
	
	public void listaAtributos() {
		System.out.println("O raio da esfera �: "+raio+".");
		System.out.println("A �rea da esfera �: "+area+".");
		System.out.println("O volume da esfera �: "+volume+".");
	}
	
}
