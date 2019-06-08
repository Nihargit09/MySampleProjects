package com.example.demo.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public class EmployeeDAO {


    private static final Map<String, Employee> empMap = new HashMap<String, Employee>();
 
    static {
        initEmps();
    }
 
    private static void initEmps() {
        Employee emp1 = new Employee("E01", "Smith", "Clerk",4454);
        Employee emp2 = new Employee("E02", "Allen", "Salesman",67576);
        Employee emp3 = new Employee("E03", "Jones", "Manager",788979);
 
        empMap.put(emp1.geteId(), emp1);
        empMap.put(emp2.geteId(), emp2);
        empMap.put(emp3.geteId(), emp3);
    }
    
    public List<Employee> getAllEmployees() {
        Collection<Employee> c = empMap.values();
        List<Employee> list = new ArrayList<Employee>();
        list.addAll(c);
        return list;
    }
}
