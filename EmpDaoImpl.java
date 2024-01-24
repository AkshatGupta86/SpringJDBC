package com.springjdbc.dao;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entities.Emp;

public class EmpDaoImpl implements EmpDao{
	
	private JdbcTemplate jdbcTemplate;

	public int insert(Emp emp) {
		String ins="insert into Employee(id,name,email,department,salary) values (?,?,?,?,?)";
		int up=this.jdbcTemplate.update(ins,emp.getId(),emp.getName(),emp.getEmail(),emp.getDepartment(),emp.getSalary());
		return up;
	}

	public int updates(Emp emp) {
		String up1="insert into Employee(id,name,email,department,salary) values (?,?,?,?,?)";
		int ups=this.jdbcTemplate.update(up1,emp.getId(),emp.getName(),emp.getEmail(),emp.getDepartment(),emp.getSalary());
		return ups;
	}

	public int delete(int empId) {
		String del="delete from Employee where id=?";
		int dl=this.jdbcTemplate.update(del,empId);
		return dl;
	}

	public Emp getSingle(int empId) {
		String data="select * from Employee where id=?";
		RowMapper<Emp> rowMapper=new RowMapperDemo();
		Emp emp=this.jdbcTemplate.queryForObject(data, rowMapper,empId);
		return emp;
	}

	public List<Emp> getAllData() {
		String allData="select * from Employee";
		List<Emp> em=this.jdbcTemplate.query(allData, new RowMapperDemo());
		return em;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
