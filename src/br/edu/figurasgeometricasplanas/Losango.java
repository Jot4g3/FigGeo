package br.edu.figurasgeometricasplanas;

public class Losango {
	public double diagonalG;
	public double diagonalP;
	public double area;
	
	public void calcArea() {
		area = (diagonalG*diagonalP)/2;
	}
	public void listaAtributos() {
		System.out.println("A diagonal maior do losango �: "+diagonalG+".");
		System.out.println("A diagonal menor do losango �: "+diagonalP+".");
		System.out.println("A �rea do losango �: "+area+".");
	}
}
