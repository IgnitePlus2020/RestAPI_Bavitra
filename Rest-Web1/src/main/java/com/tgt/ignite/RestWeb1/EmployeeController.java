package com.tgt.ignite.RestWeb1;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping("/employees")
    public List<Employee> retrieveAllEmployee() {
        return service.getAll();
    }

    @GetMapping("/employee/{id}")
    public Employee retrieveOneEmployee(@PathVariable Integer id) {
        return service.getById(id);
    }


    @DeleteMapping("/remove/{id}")
    public void deleteEmployee(@PathVariable Integer id){
      service.removeEmployee(id);
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee e){
        return service.createEmployee(e);
    }

    @PutMapping("/update/{id}/{name}")
    public List<Employee> updateEmployee(@PathVariable Integer id ,@PathVariable String name){
        return service.updateEmployee(id,name);

    }

}