package com.tgt.ignite.RestWeb1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    private static List<Employee> employee = new CopyOnWriteArrayList<>();

    /*static {
        employee.add(new Employee(1, "dustin", "sgt", 1111111111l));
        employee.add(new Employee(2, "will", "upd", 2222222222l));
    }*/

    //list all employees
    public List<Employee> getAll() {
        return employeeRepo.findAll();
    }

    //find employee by id
    public Employee getById(Integer id) {
       /* for (Employee e : employee) {
            if (e.getId() == id) {
                System.out.println("Employee found!");
                return e;
            }
        }
        System.out.println("Employee not present");*/
        Optional<Employee> opemployee = employeeRepo.findById(id);
        if(!employeeRepo.findById(id).isPresent())
            throw new EmpExceptions("The entered employee id is invalid");
        return opemployee.get();
    }


    //remove an employee
    public void removeEmployee(Integer rid) {
       //employee.removeIf(e -> e.getId().equals(rid));
       /* for (Employee e : employee) {
            if (e.getId().equals(rid)) {
                employee.remove(e);
            }
        }*/

       employeeRepo.deleteById(rid);
    }


    public Employee createEmployee(Employee e) {
       /* e.setId(employeecount);
        long valid = e.getNumber();
        if ((valid >= 100000000l) && (valid <= 9999999999l)) {
            employee.add(e);
            employeecount++;
        }*/
        long valid = e.getNumber();
        if ((valid >= 100000000l) && (valid <= 9999999999l)) {
            return employeeRepo.save(e);
        }
        return null;
    }

    public List<Employee> updateEmployee(int id, String  newname) {
        for (Employee x : employee) {
            if (x.getId() == id) {
                    x.setName(newname);
                }
        }
        return getAll();
    }


}

