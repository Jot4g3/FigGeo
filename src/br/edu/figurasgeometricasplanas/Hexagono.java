package br.edu.figurasgeometricasplanas;

public class Hexagono {
	public double lado;
	public double area;
	
	public void calcArea() {
		area = (3*lado*lado*1.732)/2;
	}
	public void listaAtributos() {
		System.out.println("O lado do Hexagono �: "+lado+".");
		System.out.println("A �rea do Hexagono �: "+area+".");
	}
}
