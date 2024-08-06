package br.edu.figurasgeometricasplanas;

public class Paralelogramo {
	public double base;
	public double altura;
	public double area;
	
	public void calcArea() {
		area = base*altura;
	}
	
	public void listaAtributos() {
		System.out.println("A base do paralelogramo é: "+base+".");
		System.out.println("A altura do paralelogramo é: "+altura+".");
		System.out.println("A área do paralelogramo é: "+area+".");
	}
}
