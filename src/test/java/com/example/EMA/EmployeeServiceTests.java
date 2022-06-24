package com.example.EMA;

import com.example.EMA.model.Employee;
import com.example.EMA.repo.EmployeeRepository;
import com.example.EMA.service.EmployeeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class EmployeeServiceTests {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void contextLoads(){}

    @Test
    public void addEmployeeTest(){
        Employee employee = new Employee();
        employee.setRace("chinese");
        employee.setAddress("Serangoon street 123");
        employee.setEmail("mark@gmail.com");
        employee.setGender("male");
        employee.setAge("25");
        employee.setStatus("active");
        employee.setNationality("SG");
        employee.setName("Mark");
        employee.setJobTitle("HR manager");
        employee.setSalary(3700L);
        employee.setImageUrl("https://image.shutterstock.com/image-vector/young-man-head-avatar-character-260nw-741858571.jpg");


        Assertions.assertNull(employee.getEmployeeCode());
        employeeService.addEmployee(employee);
        Assertions.assertNotNull(employee.getEmployeeCode());
    }

    @Test
    public void findEmployeeByIdTest(){
        Employee employee = employeeService.findEmployeeById(10L);
        Assertions.assertEquals(employee.getName(), "Jill");

    }

    @Test
    public void deleteEmployeeByIdTest(){
        Assertions.assertEquals(employeeService.findEmployeeById(28L).getId(), 28L);
        employeeService.deleteEmployee(28L);
        Assertions.assertFalse(!employeeRepository.findEmployeeById(28L).isEmpty());
    }
}
