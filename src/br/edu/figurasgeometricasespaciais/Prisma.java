package br.edu.figurasgeometricasespaciais;
import java.util.Scanner;

public class Prisma {
	public double aresta;
	public double altura;
	public double areabase;
	public double arealateral;
	public double areatotal;
	public double volume;
	public int typebase = 0;
	public String typebaseextenso;
	Scanner sc = new Scanner(System.in);
	//� necess�rio fornecer a aresta da base e a altura do prisma.
	//Todos os pol�gonos da base s�o regulares.
	
	public void descobrirTypeBase() {
		System.out.println("Digite 1 se a base do prisma � triangular (equil�tero).");
		System.out.println("Digite 2 se a base do prisma � quadrangular.");
		System.out.println("Digite 3 se a base do prisma � pentagonal.");
		System.out.println("Digite 4 se a base do prisma � hexagonal.");
		typebase = sc.nextInt();
	}
	
	public void calcAreaBase( ) {
		if (typebase == 1) {
			areabase = (Math.pow(aresta, 2)*Math.sqrt(3))/4;
		}
		else if (typebase == 2) {
			areabase = Math.pow(aresta, 2);
		}
		else if (typebase == 3) {
			areabase = 1.72*aresta*aresta;
		}
		else if (typebase == 4) {
			areabase = (3*aresta*aresta*1.732)/2;
		}
		else {
			System.out.println("A resposta n�o corresponde a nenhuma das op��es.");
		}
	}
	
	public void calcAreaLateral() {
		if (typebase == 1) {
			arealateral = 3*aresta*altura;
		}
		else if (typebase == 2) {
			arealateral = 4*aresta*altura;		
		}
		else if (typebase == 3) {
			arealateral = 5*aresta*altura;		
		}
		else if (typebase == 4) {
			arealateral = 6*aresta*altura;
		}
		else {
			System.out.println("A resposta n�o corresponde a nenhuma das op��es.");
		}
	}
	
	public void calcAreaTotal() {
		areatotal = (2*areabase)+arealateral;
	}
	
	public void calcVolume() {
		volume = areabase*altura;
	}
			
	public void listaAtributos() {
		System.out.println("A aresta do quadrado que forma a base do prisma �: "+aresta+".");
		System.out.println("A altura do prisma �: "+altura+".");
		System.out.println("A �rea da base do prisma �: "+areabase+".");
		System.out.println("A �rea lateral do prisma �: "+arealateral+".");
		System.out.println("A �rea total do prisma �: "+areatotal+".");
		System.out.println("O volume do prisma �: "+volume+".");
		
		if (typebase == 1) {
			typebaseextenso = "triangular";
		}
		else if (typebase == 2) {
			typebaseextenso = "quadrangular";
		}
		else if (typebase == 3) {
			typebaseextenso = "pentagonal";
		}
		else if (typebase == 4) {
			typebaseextenso = "hexagonal";
		}
		else {
			typebaseextenso = "nenhuma das listadas";
		}
		
		System.out.println("O tipo de base do prisma �: "+ typebaseextenso+".");
	}
}
