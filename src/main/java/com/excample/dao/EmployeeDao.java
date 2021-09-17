package com.example.dao;

import com.example.pojo.Department;
import com.example.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;
    @Autowired
    private DepartmentDao departmentDao;
    static{
        employees = new HashMap<Integer, Employee>();
        employees.put(101,new Employee(101,"101","101@101",0,new Department(1,"1")));
        employees.put(102,new Employee(102,"102","102@102",0,new Department(2,"2")));
        employees.put(103,new Employee(103,"103","103@103",1,new Department(3,"3")));
        employees.put(104,new Employee(104,"104","104@104",0,new Department(4,"4")));
        employees.put(105,new Employee(105,"105","105@105",1,new Department(5,"5")));
    }
    //主键自增
    private static Integer init = 106;
    //增加员工
    public void AddEmployee(Employee employee){
        if(employee.getId()==null)employee.setId(init++);
        employee.setDepartment(departmentDao.GetDepartmentsID(employee.getDepartment().getId()));
        employees.put(employee.getId(),employee);
    }
    //查询全部员工信息
    public Collection<Employee> getAll(){
        return employees.values();
    }
    //通过id查找员工
    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }
    //删除员工
    public void deletEmployee(Integer id){
        employees.remove(id);
    }
}
