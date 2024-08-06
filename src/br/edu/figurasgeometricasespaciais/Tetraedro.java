package br.edu.figurasgeometricasespaciais;

public class Tetraedro {
	public double aresta;
	public double altura;
	public double aptp;
	public double aptb;
	public double areabase;
	public double arealateral;
	public double areatotal;
	public double volume;
	
	public void calcAptB() {
		aptb = (aresta*Math.sqrt(3))/6;
	}
	
	public void calcAptP() {
		aptp = Math.sqrt(Math.pow(aresta,2)-Math.pow((aresta/2),2));
	}

	public void calcAltura() {
		altura = Math.sqrt(Math.pow(aptp,2)-Math.pow(aptb,2));
	}

	public void calcAreaBase() {
		areabase = (Math.pow(aresta, 2)*Math.sqrt(3))/4;
	}
	
	public void calcAreaLateral() {
		arealateral = 3*((Math.pow(aresta, 2)*Math.sqrt(3))/4);
	}
	
	public void calcAreaTotal() {
		areatotal = Math.pow(aresta, 2)*Math.sqrt(3);
	}
	
	public void calcVolume() {
		volume = 1./3.*(Math.pow(aresta, 2)*Math.sqrt(3))/4*altura;
	}
	
	public void listaAtributos() {
		System.out.println("O lado do quadrado que forma a base do tetraedro �: "+aresta+".");
		System.out.println("O ap�tema do tetraedro �: "+aptp+".");
		System.out.println("O ap�tema da base do tetraedro �: "+aptb+".");
		System.out.println("A �rea da base do tetraedro �: "+areabase+".");
		System.out.println("A �rea lateral do tetraedro �: "+arealateral+".");
		System.out.println("A �rea total do tetraedro �: "+areatotal+".");
		System.out.println("O volume do tetraedro �: "+volume+".");
	}
}
