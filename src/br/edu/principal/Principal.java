package br.edu.principal;
import java.util.Scanner;

import br.edu.figurasgeometricasespaciais.Cone;
import br.edu.figurasgeometricasespaciais.Cubo;
import br.edu.figurasgeometricasespaciais.Esfera;
import br.edu.figurasgeometricasespaciais.Paralelepipedo;
import br.edu.figurasgeometricasespaciais.Piramide;
import br.edu.figurasgeometricasespaciais.Prisma;
import br.edu.figurasgeometricasespaciais.Tetraedro;
import br.edu.figurasgeometricasplanas.*;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("---------------Figuras geométricas planas---------------");
		
		System.out.println("*Círculo*");
		Circulo cir1 = new Circulo();
		System.out.println("Digite o raio do círculo: ");
		cir1.raio = sc.nextDouble();
		cir1.calcArea();
		cir1.calcCompCirc();
		cir1.listaAtributos();
		
		System.out.println("");
		
		System.out.println("*Hexágono*");
		Hexagono h1 = new Hexagono();
		System.out.println("Digite o lado do hexágono: ");
		h1.lado = sc.nextDouble();
		h1.calcArea();
		h1.listaAtributos();
		
		System.out.println("");
		
		System.out.println("*Losango*");
		Losango l1 = new Losango();
		System.out.println("Digite a diagonal maior do losango: ");
		l1.diagonalG = sc.nextDouble();
		System.out.println("Digite a diagonal menor do losango: ");
		l1.diagonalP = sc.nextDouble();
		l1.calcArea();
		l1.listaAtributos();
		
		System.out.println("");
		
		System.out.println("*Paralelogramo*");
		Paralelogramo par1 = new Paralelogramo();
		System.out.println("Digite a altura do paralelogramo: ");
		par1.altura = sc.nextDouble();
		System.out.println("Digite a base do paralelogramo: ");
		par1.base=sc.nextDouble();
		par1.calcArea();
		par1.listaAtributos();
		
		System.out.println("");
		
		System.out.println("*Pentágono*");
		Pentagono pent1 = new Pentagono();
		System.out.println("Digite o lado do pentágono: ");
		pent1.lado = sc.nextDouble();
		pent1.calcArea();
		pent1.listaAtributos();
		
		System.out.println("");
		
		System.out.println("*Quadrado*");
		Quadrado q1 = new Quadrado();
		System.out.println("Digite o lado do quadrado: ");
		q1.lado=sc.nextDouble();
		q1.calcArea();
		q1.listaAtributos();
		
		System.out.println("");
		
		System.out.println("*Retângulo*");
		Retangulo r1 = new Retangulo();
		System.out.println("Digite a base do retângulo: ");
		r1.base = sc.nextDouble();
		System.out.println("Digite a altura do retângulo: ");
		r1.altura=sc.nextDouble();
		r1.calcArea();
		r1.listaAtributos();
		
		System.out.println("");
		
		System.out.println("*Trapézio*");
		Trapezio tra1 = new Trapezio();
		System.out.println("Digite a altura do trapézio: ");
		tra1.altura = sc.nextDouble();
		System.out.println("Digite a base maior do trapézio: ");
		tra1.baseG=sc.nextDouble();
		System.out.println("Digite a base menor do trapézio: ");
		tra1.baseP = sc.nextDouble();
		tra1.calcArea();
		tra1.listaAtributos();
		
		System.out.println("");
		
		System.out.println("*Triângulo*");
		Triangulo t1 = new Triangulo();
		System.out.println("Digite a base do triângulo: ");
		t1.base=sc.nextDouble();
		System.out.println("Digite a altura do triângulo: ");
		t1.altura = sc.nextDouble();
		t1.calcArea();
		t1.listaAtributos();
		
		System.out.println("");
		
		System.out.println("---------------Figuras geométricas espaciais---------------");

		System.out.println("*Cone*");
		Cone cone1 = new Cone();
		System.out.println("Digite a altura do cone: ");
		cone1.altura = sc.nextDouble();
		System.out.println("Digite o raio do cone: ");
		cone1.raio = sc.nextDouble();
		cone1.calcAreaBase();
		cone1.calcAreaLateral();
		cone1.calcAreaTotal();
		cone1.calcVolume();
		cone1.listaAtributos();
		
		System.out.println("");
		
		System.out.println("*Cubo*");
		Cubo c1 = new Cubo();
		System.out.println("Digite o lado do cubo: ");
		c1.lado = sc.nextDouble();
		c1.calcAreaFace();
		c1.calcAreaLateral();
		c1.calcAreaTotal();
		c1.calcVolume();
		c1.listaAtributos();
		
		System.out.println("");
		
		System.out.println("*Esfera*");
		Esfera esf1 = new Esfera();
		System.out.println("Digite o raio do esfera: ");
		esf1.raio=sc.nextDouble();
		esf1.calcArea();
		esf1.calcVolume();
		esf1.listaAtributos();
		
		System.out.println("");
		
		System.out.println("*Paralelepípedo*");
		Paralelepipedo p1 = new Paralelepipedo();
		System.out.println("Digite a base do paralelepípedo: ");
		p1.base=sc.nextDouble();
		System.out.println("Digite a altura do paralelepípedo: ");
		p1.altura=sc.nextDouble();
		System.out.println("Digite a profundidade do paralelepípedo: ");
		p1.profundidade=sc.nextDouble();
		p1.calcAreaBase();
		p1.calcAreaLateral();
		p1.calcAreaTotal();
		p1.calcVolume();
	    p1.listaAtributos();	
	
		System.out.println("");
		
		System.out.println("*Pirâmide de base quadrada*");
		Piramide pir1 = new Piramide();
		System.out.println("Digite o lado da pirâmide: ");
		pir1.lado=sc.nextDouble();
		System.out.println("Digite a aresta lateral da pirâmide: ");
		pir1.arestalateral = sc.nextDouble();
		pir1.calcAptB();
		pir1.calcAptP();
		pir1.calcAltura();
		pir1.calcAreaBase();
		pir1.calcAreaLateral();
		pir1.calcAreaTotal();
		pir1.calcVolume();
		pir1.listaAtributos();
		
		System.out.println("");
		
		System.out.println("*Prisma*");
		Prisma pri1 = new Prisma();
		System.out.println("Digite a aresta do prisma: ");
		pri1.aresta=sc.nextDouble();
		System.out.println("Digite a altura do prisma: ");
		pri1.altura=sc.nextDouble();
		pri1.descobrirTypeBase();
		pri1.calcAreaBase();
		pri1.calcAreaLateral();
		pri1.calcAreaTotal();
		pri1.calcVolume();
		pri1.listaAtributos();
		
		System.out.println("");
		
		System.out.println("*Tetraedro*");
		Tetraedro tet1 = new Tetraedro();
		System.out.println("Digite a aresta do tetraedro");
		tet1.aresta=sc.nextDouble();
		tet1.calcAptB();
		tet1.calcAptP();
		tet1.calcAltura();
		tet1.calcAreaBase();
		tet1.calcAreaLateral();
		tet1.calcAreaTotal();
		tet1.calcVolume();
		tet1.listaAtributos();
		

	}

}
