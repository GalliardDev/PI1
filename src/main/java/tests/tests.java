package tests;

import java.util.ArrayList;
import java.util.List;

import ejemplos.Ejemplo1;
import us.lsi.common.Files2;
import us.lsi.geometria.Punto2D;

public class tests {
	public static void test1() {
		List<Punto2D> ls = new ArrayList<>();
		for(String linea: Files2.linesFromFile("data/Ejemplo1DatosEntrada.txt")) {
			String[] partes = linea.split(",");
			Punto2D p = Punto2D.of(Double.valueOf(partes[0]),
					Double.valueOf(partes[1]));
			ls.add(p);
		}
		System.out.println("==== EJEMPLO 1 ====");
		System.out.println("Iterativo: " + Ejemplo1.ejemplo1Iter(ls));
		System.out.println("Recursivo: " + Ejemplo1.ejemplo1Rec(ls));
	}
	
	public static void main(String[] args) {
		test1();
	}
	
}
