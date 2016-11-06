package prueba;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beans.BeanSpring;

public class pruebaSpring {
	
	public static void main(String[] args) {
		//el aplplication context debe ir en la carpeta src/main/resources
		//se manda llamar el archivo applicationContext mediante la clase classpath...
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//le damos un nombre a la fabrica		
		BeanFactory factory = context;
		//solicitamos el bean a spring medainte el id
		//se castea para que genere una instancia de nuestra clase java beanspring
		BeanSpring miBean = (BeanSpring) factory.getBean("miBean");
		//mandamos llamar el mensaje definido en el applicationContext
		System.out.println("Mensaje: "+ miBean.getMensaje());
	}

}
