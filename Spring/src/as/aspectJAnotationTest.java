package as;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.aspectJ.User;

public class aspectJAnotationTest {

	public static void main(String[] args) {
		String string="as/aspectJAnotation.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(string);
		
		User user=(User)applicationContext.getBean("userDao");
		user.addUser();

	}
}
