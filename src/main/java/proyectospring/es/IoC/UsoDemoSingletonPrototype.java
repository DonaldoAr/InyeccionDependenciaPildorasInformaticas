package proyectospring.es.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// Carga de XML de configuraion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Peticion de beans al contenedor Spring
		SecretarioEmpleado maria= contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado pedro= contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(maria);
		System.out.println(pedro);
		if(maria==pedro) System.out.println("Misma memoria");
		else System.out.println("Diferente direccion de memoria");
		
	}

}
