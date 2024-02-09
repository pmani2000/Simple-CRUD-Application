package com.crudExp.crudproject.repository;

import com.crudExp.crudproject.entity.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface crudRepo extends JpaRepository <EmployeeDetails,Integer >{

    List<EmployeeDetails> getByCompanyName(String companyName);



}
