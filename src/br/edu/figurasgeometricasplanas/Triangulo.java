package br.edu.figurasgeometricasplanas;

public class Triangulo {
	public double base;
	public double altura;
	public double area;
	
	public void calcArea() {
		area = (base*altura)/2;
	}
	
	public void listaAtributos() {
		System.out.println("A base do tri�ngulo �: "+base+".");
		System.out.println("A altura do tri�ngulo �: "+altura+".");
		System.out.println("A �rea do tri�ngulo �: "+area+".");
	}
}
