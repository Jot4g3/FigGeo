package br.edu.figurasgeometricasplanas;

public class Trapezio {
	public double baseG;
	public double baseP;
	public double altura;
	public double area;
	
	public void calcArea() {
		area = ((baseG+baseP)*altura)/2;
	}
	public void listaAtributos() {
		System.out.println("A base maior do trapézio é: "+baseG+".");
		System.out.println("A base menor do trapézio é: "+baseP+".");
		System.out.println("A altura do trapézio é: "+altura+".");
		System.out.println("A área do trapézio é: "+area+".");
	}
}
