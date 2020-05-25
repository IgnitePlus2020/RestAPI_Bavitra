package com.tgt.ignite.RestWeb1;

import javax.persistence.*;

@Entity
@TableGenerator(name="counter", initialValue = 0, allocationSize = 50)
public class Employee {
   @Id
    @GeneratedValue(strategy = GenerationType.TABLE , generator = "counter")
    private Integer id;
    private String name;
    private String org;
    private Long number;

    public Employee(Integer id, String name, String org,Long number) {
        this.id = id;
        this.name = name;
        this.org = org;
        this.number = number;
    }
    public Employee(){}

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    @Override
    public String toString(){
        return "Employee [id : " +id+
                "/name : " +name+
                "/ org : " +org+
                "/number : " +number+ "]";
    }
}
