package com.imran.jpa.service;

import com.imran.jpa.entity.Amount;
import com.imran.jpa.entity.Employee;
import com.imran.jpa.entity.Persons;
import com.imran.jpa.repository.AmountRepository;
import com.imran.jpa.repository.EmployeeRepository;
import com.imran.jpa.repository.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonsService {
    @Autowired
    private PersonsRepository personsRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private AmountRepository amountRepository;

    public Persons getData(String address){
       Persons persons = personsRepository.findByaddress(address);
       return persons;
    }

    public void insertData(){
//
//        Employee employee = Employee.builder()
//                 //.emp_id(3)
//                .emp_name("Aadhil")
//                .build();
//
//        Amount amount= Amount.builder()
//                //.amt_id(5)
//                .emp_amount(30000)
//                .employee(employee).build();
//
//        amountRepository.save(amount);

        List<Amount> obj=amountRepository.findAll();
        List<Employee> obj2=employeeRepository.findAll();
        System.out.println(obj2);


    }
}
