

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.itheima.transaction.Customer;
import com.itheima.transaction.CustomerMapper;

public class CustomerMapperImpl extends SqlSessionDaoSupport implements CustomerMapper{

	@Override
	public void addCustomer(Customer customer) {
		this.getSqlSession().insert("com.itheima.Dao.CustomerMapper.addCustomer",customer);
	}


}
