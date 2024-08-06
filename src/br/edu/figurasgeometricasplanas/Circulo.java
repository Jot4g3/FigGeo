package br.edu.figurasgeometricasplanas;

public class Circulo {
	public double raio;
	public double area;
	public double comprimento;
	
	public void calcArea() {
		area = Math.PI*raio*raio;
	}
	
	public void calcCompCirc() {
		comprimento = 2*Math.PI*raio;
	}
	
	public void listaAtributos() {
		System.out.println("O raio do círculo é: "+raio+".");
		System.out.println("A área do círculo é: "+area+".");
		System.out.println("O comprimento da circunferência que envolve esse círculo é: "+comprimento+".");
	}
}	
