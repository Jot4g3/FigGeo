package br.edu.figurasgeometricasplanas;

public class Quadrado {
	public double lado;
	public double area;
	
	public void calcArea() {
		area = lado*lado;
	}
	public void listaAtributos() {
		System.out.println("O lado do quadrado é: "+lado+".");
		System.out.println("A área do quadrado é: "+area+".");
	}
}
