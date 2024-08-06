package br.edu.figurasgeometricasplanas;

public class Triangulo {
	public double base;
	public double altura;
	public double area;
	
	public void calcArea() {
		area = (base*altura)/2;
	}
	
	public void listaAtributos() {
		System.out.println("A base do triângulo é: "+base+".");
		System.out.println("A altura do triângulo é: "+altura+".");
		System.out.println("A área do triângulo é: "+area+".");
	}
}
