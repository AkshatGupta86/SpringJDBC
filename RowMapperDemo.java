package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entities.Emp;

public class RowMapperDemo implements RowMapper<Emp> 
{
	public Emp mapRow(ResultSet res, int rowNo) throws SQLException {
		Emp e1=new Emp();
		e1.setId(res.getInt(1));
		e1.setName(res.getString(2));
		e1.setEmail(res.getString(3));
		e1.setDepartment(res.getString(4));
		e1.setSalary(res.getInt(5));
		return e1;
	}

}
