package br.edu.figurasgeometricasespaciais;

public class Paralelepipedo {
	public double base;
	public double altura;
	public double profundidade;
	public double areabase;
	public double arealateral;
	public double areatotal;
	public double volume;
	
	public void calcAreaBase() {
		areabase = base*altura;
	}
	
	public void calcAreaLateral() {
		arealateral = (2*base*profundidade) + (2*altura*profundidade);
	}
	
	public void calcAreaTotal() {
		areatotal = (2*base*altura)+(2*base*profundidade)+(2*altura*profundidade);
	}
	
	public void calcVolume() {
		volume = base*altura*profundidade;
	}
	
	public void listaAtributos() {
		System.out.println("A base do paralepípedo é: "+base+".");
		System.out.println("A altura do paralepípedo é: "+altura+".");
		System.out.println("A profundidade do paralepípedo é: "+profundidade+".");
		System.out.println("A área da base do paralepípedo é: "+areabase+".");
		System.out.println("A área lateral do paralepípedo é: "+arealateral+".");
		System.out.println("A área total do paralepípedo é: "+areatotal+".");
		System.out.println("O volume do paralepípedo é: "+volume+".");
	}
}
