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
		System.out.println("O raio do c�rculo �: "+raio+".");
		System.out.println("A �rea do c�rculo �: "+area+".");
		System.out.println("O comprimento da circunfer�ncia que envolve esse c�rculo �: "+comprimento+".");
	}
}	
