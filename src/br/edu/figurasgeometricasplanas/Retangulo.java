package br.edu.figurasgeometricasplanas;

public class Retangulo {
	public double base;
	public double altura;
	public double area;
	
	public void calcArea() {
		area = base*altura;
	}
	
	public void listaAtributos() {
		System.out.println("A base do ret�ngulo �: "+base+".");
		System.out.println("A altura do ret�ngulo �: "+altura+".");
		System.out.println("A �rea do ret�ngulo �: "+area+".");
	}
}
