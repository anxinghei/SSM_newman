package com.itheima.jdbc;

import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {
	
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int addUser(User user) {
		String sql="insert into user(username,password) value(?,?)";
		Object[] objects=new Object[] {
				user.getUsername(),
				user.getPassword()
		};
		int num=this.jdbcTemplate.update(sql,objects);
		return num;
	}

	@Override
	public int updateUser(User user) {
		String sql="update user set username=?,password=? where id=?";
		Object[] objects=new Object[] {
				user.getUsername(),
				user.getPassword(),
				user.getId()
		};
		int num=this.jdbcTemplate.update(sql,objects);
		return num;
	}

	@Override
	public int deleteUser(int id) {
		String sql="delete from user where id=?";
		int num=this.jdbcTemplate.update(sql,id);
		return num;
	}

	@Override
	public User findUser(int id) {
		String sql="select * from user where id=?";
		BeanPropertyRowMapper<User> rowMapper=new BeanPropertyRowMapper<User>(User.class);
		
		return this.jdbcTemplate.queryForObject(sql, rowMapper,id);
	}

	@Override
	public List<User> findAllUser() {
		String sql="select * from user";
		BeanPropertyRowMapper<User> rowMapper=new BeanPropertyRowMapper<User>(User.class);
		
		return this.jdbcTemplate.query(sql, rowMapper);
	}

}
