package br.edu.figurasgeometricasespaciais;

public class Cone {
	public double raio;
	public double geratriz;
	public double areabase;
	public double arealateral;
	public double areatotal;
	public double altura;
	public double volume;

	public void calcAreaBase() {
		areabase = Math.PI*raio*raio;
	}
	
	public double calcGeratriz() {
		geratriz = Math.sqrt((raio*raio)+(altura*altura));
		return geratriz;
	}
	
	public void calcAreaTotal() {
		areatotal = Math.PI*raio*calcGeratriz()+(Math.PI*raio*raio);
	}
	
	public void calcAreaLateral() {
		arealateral = Math.PI*raio*calcGeratriz();
	}
	
	public void calcVolume() {
		volume = (1./3.)*areabase*altura;
	}
	public void listaAtributos() {
		System.out.println("O raio do cone �: "+raio+".");
		System.out.println("A altura do cone �: "+altura+".");
		System.out.println("A geratriz do cone �: "+geratriz+".");
		System.out.println("A �rea da base do cone �: "+areabase+".");
		System.out.println("A �rea lateral do cone �: "+arealateral+".");
		System.out.println("A �rea total do cone �: "+areatotal+".");
		System.out.println("O volume do cone �: "+volume+".");
	}
}
