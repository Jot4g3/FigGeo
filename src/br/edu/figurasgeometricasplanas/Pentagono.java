package br.edu.figurasgeometricasplanas;

public class Pentagono {
	public double lado;
	public double area;
	
	public void calcArea() {
		area = 1.72*lado*lado;
	}
	
	public void listaAtributos() {
		System.out.println("O lado do pentágono é: "+lado+".");
		System.out.println("A área do pentágono é: "+area+".");
	}
}
