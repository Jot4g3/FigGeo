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
		System.out.println("O raio do cone é: "+raio+".");
		System.out.println("A altura do cone é: "+altura+".");
		System.out.println("A geratriz do cone é: "+geratriz+".");
		System.out.println("A área da base do cone é: "+areabase+".");
		System.out.println("A área lateral do cone é: "+arealateral+".");
		System.out.println("A área total do cone é: "+areatotal+".");
		System.out.println("O volume do cone é: "+volume+".");
	}
}
