package br.edu.figurasgeometricasplanas;

public class Quadrado {
	public double lado;
	public double area;
	
	public void calcArea() {
		area = lado*lado;
	}
	public void listaAtributos() {
		System.out.println("O lado do quadrado �: "+lado+".");
		System.out.println("A �rea do quadrado �: "+area+".");
	}
}
