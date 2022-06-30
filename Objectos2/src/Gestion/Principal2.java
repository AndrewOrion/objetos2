package Gestion;

import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Persona p = new Persona();
		
		System.out.println("Nombre: ");
		p.setNombre(teclado.nextLine());
		
		System.out.println("Apellidos: ");
		p.setApellidos(teclado.nextLine());
	
		System.out.println("Peso (kg): ");
		p.setPeso(teclado.nextDouble());
		
		System.out.println("Altura (cm): ");
		p.setAltura(teclado.nextDouble());
		
		System.out.println("_______________");
		System.out.println("Tus datos son: ");
		//p.mostrar();
		System.out.println(p);
		
		System.out.println("_______________");
		System.out.println("Tu IMC es "+p.calculaIMC());
		
		System.out.println("El estado de tu peso es: "+p.estadoPeso());
		
	}
}
