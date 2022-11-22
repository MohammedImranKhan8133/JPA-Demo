package com.imran.jpa.service;

import com.imran.jpa.entity.*;
import com.imran.jpa.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PersonsService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
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
        Employee employee = Employee.builder()
                 .emp_id(1)
                 .emp_name("mohammed imran")
                 .build();

        Employee employee1 = Employee.builder()
                .emp_name("hasan")
                .build();

        Employee employee2 = Employee.builder()
                .emp_name("thameem")
                .build();


        Department department =Department.builder()
                .Dep_id(1)
                .emp_role("Java Developer")
                .employee(employee).build();

        Department department1 =Department.builder()
                .emp_role("Java Developer")
                .employee(employee1).build();

        Department department2 =Department.builder()
                .emp_role("python Developer")
                .employee(employee2).build();

        Amount amount= Amount.builder()
                .amt_id(1)
                .emp_amount(100000)
                .employee(employee).build();

        Amount amount1= Amount.builder()
                .emp_amount(200000)
                .employee(employee1).build();

        Amount amount2= Amount.builder()
                .emp_amount(300000)
                .employee(employee2).build();

        amountRepository.save(amount);
        amountRepository.save(amount1);
        amountRepository.save(amount2);

        departmentRepository.save(department);
        departmentRepository.save(department1);
        departmentRepository.save(department2);

        List<Amount> obj=amountRepository.findAll();
        List<Employee> obj2=employeeRepository.findAll();
        System.out.println(obj2);


    }

    public void insertCourseData(){

        Course course = Course.builder()
                .courseId(1L)
                .title("Spring Boot")
                .build();

        List<Course> courses = Arrays.asList(course);
        Teacher teacher = Teacher.builder()
                .teacherId(1L)
                .firstName("jaffer")
                .lastName("siddiq")
                .courses(courses)
                .build();

          teacherRepository.save(teacher);
    }
}
