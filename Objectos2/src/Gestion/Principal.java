package Gestion;

public class Principal {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Andres","Pino",25,"Hombre",80,170);
		
		Persona copia= new Persona(p1);//así hacemos una copia del objeto p1
		
		p1.mostrar();
		System.out.println("_________________");
		copia.mostrar();
		System.out.println("_________________");
		
		System.out.println("La edad de p1 es: "+p1.getEdad());
		
		p1.setEdad(39);
		
		System.out.println("La edad de p1 es: "+p1.getEdad()+" (modificada)");
		
		p1.setEdad(-50);
		
		System.out.println("La edad de p1 es: "+p1.getEdad()+" (no varía al ser negativo)");

		p1.setEdad(18);
		
		System.out.println("La edad de p1 es: "+p1.getEdad());
		if (p1.esMayorDeEdad()) {
			System.out.println(p1.getNombre()+" es mayor de edad");
		}else {
			System.out.println(p1.getNombre()+" no es mayor de edad");
		}
		
		System.out.println("IMC: "+p1.calculaIMC());
		
	}

}
