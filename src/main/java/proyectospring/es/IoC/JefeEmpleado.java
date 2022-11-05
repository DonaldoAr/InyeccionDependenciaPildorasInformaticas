package proyectospring.es.IoC;

public class JefeEmpleado implements Empleados{
	
	CreacionInformes creacionInformes;
	
	public JefeEmpleado(CreacionInformes creacionInformes) {
		this.creacionInformes = creacionInformes;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Realiza desiciones importantes de la compania";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "El informe del jefe "+creacionInformes.getInforme();
	}

}
