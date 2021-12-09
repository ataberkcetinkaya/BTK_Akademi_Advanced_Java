package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//applicationContext.xml'i okuyacagimiz s�yledik.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		ICustomerService customerService = context.getBean("service", ICustomerService.class);
		
		//CustomerManager manager = new CustomerManager(new CustomerDal());
		CustomerManager manager = new CustomerManager(context.getBean("database", ICustomerDal.class));
		manager.add();												//ICustomerDal tipinde database nesnesini istiyoruz
																	//ve database nesnesine baktigimizda, bize MySqlCustomerDal verecek yani onu newleyip verecek (arkaplanda bizim yerimize yapacak)
	
		customerService.add();
	
	
	}
}
