package proyectospring.es.IoC;

public class DirectorEmpleado implements Empleados{	
	// Creacion de campo tipo CreacionInformes(interfaz)
	private CreacionInformes informeNuevo;
	
	
	// Creacion d contructor que inyecta la dependecia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Encarga de ver que se ejecute todo bien";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el director"+informeNuevo.getInforme();
	}

}
