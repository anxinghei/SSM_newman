package transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService=applicationContext.getBean(CustomerService.class);
		
		Customer customer=new Customer();
		customer.setUsername("÷‹∞À");
		customer.setJobs("programmer");
		customer.setPhone("27843123402");
		
		customerService.addCustomer(customer);
	}
}
