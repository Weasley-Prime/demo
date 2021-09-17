package com.example.dao;

import com.example.pojo.Department;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//部门Dao
@Component
public class DepartmentDao {
    private static Map<Integer, Department> department = null;
    static{
        department = new HashMap<Integer, Department>();
        department.put(1,new Department(1,"1"));
        department.put(2,new Department(2,"2"));
        department.put(3,new Department(3,"3"));
        department.put(4,new Department(4,"4"));
        department.put(5,new Department(5,"5"));
    }


    public Collection<Department> GetDepartments(){
        return department.values();
    }
    public Department GetDepartmentsID(Integer id){
        return department.get(id);
    }
}
