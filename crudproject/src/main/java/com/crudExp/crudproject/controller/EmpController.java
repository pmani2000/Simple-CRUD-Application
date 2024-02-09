package com.crudExp.crudproject.controller;

import com.crudExp.crudproject.entity.EmployeeDetails;
import com.crudExp.crudproject.service.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    CrudServiceImpl crudService;
    @GetMapping("/all")
    public List<EmployeeDetails> getEmployees(){
        return crudService.getEmployees();
    }
    @PostMapping("/add")
    public String addEmployee(@RequestBody EmployeeDetails employeeDetails){
       return crudService.addEmployee(employeeDetails);
    }

    @GetMapping("/get/{empId}")
    public EmployeeDetails getById(@PathVariable int empId){
      return  crudService.getByEmpId(empId);

    }

    @GetMapping("/gett/{companyName}")
    public List<EmployeeDetails> getByCompanyName(@PathVariable String companyName){
        return crudService.getByCompanyName(companyName);

    }

    @PutMapping("/update")
    public EmployeeDetails updateEmployee(@RequestBody   EmployeeDetails employeeDetails){
        return crudService.updateEmployeeDetails(employeeDetails);
    }

    @DeleteMapping("/delete/{empId}")
            public String deleteByEmpId(@PathVariable int empId){
             return crudService.deleteByEmpId(empId);

            }

}
