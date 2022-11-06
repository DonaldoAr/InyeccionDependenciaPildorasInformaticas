package proyectospring.es.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		
		//Cargar el xml de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Obtencion del bean
		Empleados juan= contexto.getBean("miEmpleado", Empleados.class);
		 
		//Pedir el bean
		System.out.println(juan.getInforme());
		
		// Cerrar el contexto
		contexto.close();

	}

}
