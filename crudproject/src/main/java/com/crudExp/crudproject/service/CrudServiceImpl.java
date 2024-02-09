package com.crudExp.crudproject.service;

import com.crudExp.crudproject.entity.EmployeeDetails;
import com.crudExp.crudproject.repository.crudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CrudServiceImpl   {

    @Autowired
    crudRepo crudDao;
   public List<EmployeeDetails>  getEmployees(){
      return crudDao.findAll();
   }

   public String addEmployee(EmployeeDetails employeeDetails){
       crudDao.save(employeeDetails);
       return "employee added";
   }


   public EmployeeDetails getByEmpId(int empId){
        return crudDao.findById(empId).get();
   }


    public List<EmployeeDetails> getByCompanyName(String companyName) {
        return crudDao.getByCompanyName(companyName);
    }

    public EmployeeDetails updateEmployeeDetails(EmployeeDetails employeeDetails){
       return crudDao.save(employeeDetails);
    }

        public String deleteByEmpId(int empId){
        crudDao.deleteById(empId);
       return "Deleted Successfully";

        }

}
