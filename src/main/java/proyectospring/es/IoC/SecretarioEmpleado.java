package proyectospring.es.IoC;

public class SecretarioEmpleado implements Empleados{

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Encargador de ayudar jefe";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return null;
	}

}
