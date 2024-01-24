package com.springjdbc.dao;

import java.util.List;
import com.springjdbc.entities.Emp;

public interface EmpDao 
{
public int insert(Emp emp);
public int updates(Emp emp);
public int delete(int empId);
public Emp getSingle(int empId);
public List<Emp> getAllData();
}
