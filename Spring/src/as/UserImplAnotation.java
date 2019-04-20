package as;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.itheima.aspectJ.User;

@Repository("userDao")
public class UserImplAnotation implements User {

	@Override
	public void addUser() {
		System.out.println("------ÃÌº””√ªß");
	}

}
