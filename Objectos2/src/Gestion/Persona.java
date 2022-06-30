package Gestion;

public class Persona {

	//estado del objeto
	private String nombre;
	private String apellidos;
	private int edad;
	private String sexo;
	private double peso;
	private double altura;
	
	
	public Persona() { //constructor al que llamo sin parámetros
		edad=0;
		nombre="No inicializado";
	}
	
	public Persona(String n,String a) {//constructor al que llamo si paso parámetros
		nombre=n;
		apellidos=a;
	}

	public Persona(String nombre, String apellidos, int edad, String sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public Persona(Persona p) { //constructor para hacer una copia de un objeto
		this.nombre=p.nombre;
		this.apellidos = p.apellidos;
		this.edad = p.edad;
		this.sexo = p.sexo;
		this.peso = p.peso;
		this.altura = p.altura;
	}
	
	public void mostrar() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellidos: "+apellidos);
		System.out.println("Edad: "+edad);
		System.out.println("Sexo: "+sexo);
		System.out.println("Peso: "+this.peso);
		System.out.println("Altura: "+altura);
	}
	
	public int getEdad() {
		return this.edad;
	}

	
	/** poniendo barra y 2 asteriscos le doy a intro y comento.
	 * Método de la clase que establece la edad de la persona
	 * si la edad es negativa no se actualiza
	 * @param edad int con el valor nuevo de edad
	 */
	public void setEdad(int edad) {
		if (edad>=0) {
			this.edad=edad;//this es "edad" de la clase, el otro es el 
		}					//parámetro "edad"	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public boolean esMayorDeEdad() {
		if (this.edad>=18) {
			return true;
		}
		return false;
		//return edad>=18;
	}
	
	public double calculaIMC() {
		return this.peso/Math.pow(altura/100, 2);
	}
	
	public String estadoPeso() {
		double imc=this.calculaIMC();
		if (imc<20) {
			return "Peso bajo";
		}
		else if (imc>=20 && imc<=25) {
			return "Peso ideal";			
		}
		else {
			return "Sobrepeso";
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", sexo=" + sexo
				+ ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	
	
	
}
