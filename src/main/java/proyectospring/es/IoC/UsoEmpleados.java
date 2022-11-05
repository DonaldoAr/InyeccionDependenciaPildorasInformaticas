package proyectospring.es.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {
	public static void main(String[] args) {
		/*4 pasos a seguir para usar el contenedor de spring*/
		//Paso 1 Crar un contexto: Creando un objto o instancia de la clase: "Cargar el archivo xml"
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Paso 2: Pedir a contexto el bean. Nos va apedir el alias que le dimos al motor de bean, nombre de la interfaz
		Empleados Juan= contexto.getBean("miEmpleado", Empleados.class);
		
		//Paso 3: Utilizar el objeto
		System.out.println(Juan.getTareas());
		
		System.out.println(Juan.getInforme());
		
		//Paso 4: Cerrar el contexto, para liberar recursos
		contexto.close();
		
	}

}
