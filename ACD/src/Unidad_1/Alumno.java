package Unidad_1;

public class Alumno {
	private String NombreApellidos;
	private int Edad;
	private String DNI;
	private String Matricula;
	
	//CREO EL CONSTRUCTOR DE ALUMNOS
	Alumno (String NombreApellidos, int Edad, String DNI, String Matricula) {
		this.setNombreApellidos(NombreApellidos);
		this.setEdad(Edad);
		this.setDNI(DNI);
		this.setMatricula(Matricula);
	}
	

	public String getNombreApellidos() {
		return NombreApellidos;
	}


	public void setNombreApellidos(String nombreApellidos) {
		this.NombreApellidos = nombreApellidos;
	}


	public int getEdad() {
		return Edad;
	}


	public void setEdad(int edad) {
		this.Edad = edad;
	}


	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		this.DNI = dNI;
	}


	public String getMatricula() {
		return Matricula;
	}


	public void setMatricula(String matricula) {
		this.Matricula = matricula;
	}


	@Override
	public String toString() {
		return "Alumnos: \n[NombreApellidos: " + this.NombreApellidos + "]" + "[Edad: " + this.Edad + "]" + "[Dni: " + this.DNI + "]" + "[Matricula: "
				+ this.Matricula + "]";
	}


	//CREO EL toString() QUE SERÍA COMO EL mostrarInfo()
	
	
	
}


