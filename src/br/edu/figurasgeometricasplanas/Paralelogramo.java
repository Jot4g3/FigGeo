package br.edu.figurasgeometricasplanas;

public class Paralelogramo {
	public double base;
	public double altura;
	public double area;
	
	public void calcArea() {
		area = base*altura;
	}
	
	public void listaAtributos() {
		System.out.println("A base do paralelogramo �: "+base+".");
		System.out.println("A altura do paralelogramo �: "+altura+".");
		System.out.println("A �rea do paralelogramo �: "+area+".");
	}
}
