package br.edu.figurasgeometricasplanas;

public class Retangulo {
	public double base;
	public double altura;
	public double area;
	
	public void calcArea() {
		area = base*altura;
	}
	
	public void listaAtributos() {
		System.out.println("A base do retângulo é: "+base+".");
		System.out.println("A altura do retângulo é: "+altura+".");
		System.out.println("A área do retângulo é: "+area+".");
	}
}
