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
		System.out.println("A base maior do trap�zio �: "+baseG+".");
		System.out.println("A base menor do trap�zio �: "+baseP+".");
		System.out.println("A altura do trap�zio �: "+altura+".");
		System.out.println("A �rea do trap�zio �: "+area+".");
	}
}
