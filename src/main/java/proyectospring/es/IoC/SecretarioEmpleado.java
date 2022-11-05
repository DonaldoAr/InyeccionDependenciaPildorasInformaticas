package proyectospring.es.IoC;

public class SecretarioEmpleado implements Empleados{
	
	private CreacionInformes informeNuevo;

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Encargador de ayudar jefe";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el secretario "+informeNuevo.getInforme();
	}

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	

}
