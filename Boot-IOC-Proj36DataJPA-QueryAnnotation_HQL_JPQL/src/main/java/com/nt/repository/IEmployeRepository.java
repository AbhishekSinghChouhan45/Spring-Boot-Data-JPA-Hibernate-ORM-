package com.nt.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.nt.model.Employe;

public interface IEmployeRepository extends JpaRepository<Employe, Integer> {
	@Query("from Employe")
	public List<Employe> getAllEmployes()throws Exception;
//	@Query("from Employe WHERE eName=?1 And eAddress=?2")
/*	       
  @Query("from Employe WHERE eName=:Name And eAddress=:Add")
	public List<Employe> getAllEmployesByNameAndAddress(@Param("Name")String name1,@Param("Add") String address)throws Exception;
		
		 * 1. eName = ? (JDBC Named Paramteres)
		 * 2. eName = ?1 (Oridinary Named Parameter)
		 * 3. eName =: Name	(any name but which argument we have to give here. We have to declare @Param("Name") before that argument in method body we can see above code
		 * 4. eName = name (parameter name and method argument name must be same we can see below)
		  
		 After SpringBoot 2.x we can not use JDBC Named Parameter otherwise we will get Exception JDBC style paramters are not allowed 
*/
	@Query("from Employe WHERE eName=:name1 And eAddress=:address")
	public List<Employe> getAllEmployesByNameAndAddress(String name1,String address)throws Exception;
	@Query("Select count(*), max(eSalary),min(eSalary),avg(eSalary),sum(eSalary) from Employe")
	public List<Object[]> getAllEmployesExtra()throws Exception;
	@Query("Select count(*), max(eSalary),min(eSalary),avg(eSalary),sum(eSalary) from Employe WHERE eName=:name")
	public Object getAllEmployesExtrabyName(String name)throws Exception;
	/*
	* In HQL/JPQL querys we can not do insert operation for doing insert or update operation we need to use two more annotation on the top of update method
	* 1. @Transactional
	* 2.@Modifying
	*/
	@Query("update Employe SET eName=:newName WHERE eId=:id")
	@Transactional
	@Modifying
	public int updateName(String newName,Integer id)throws Exception;
//	    @Query(value="INSERT INTO Employe_info (Employe_id,EMPLOYE_NAME,EMPLOYE_ADDRESS, EMPLOYE_AGE, EMPLOYE_DOB, EMPLOYE_GENDER, EMPLOYE_SAL) " +
//	           "VALUES (EMP_SEQ.NEXTVAL,:employeeName, :employeeAddress, :employeeAge, :employeeDob, :employeeGender, :employeeSal)",nativeQuery = true)
	    @Query(value="INSERT INTO Employe_info(Employe_name,Employe_Address,Employe_age,Employe_dob,Employe_gender,Employe_sal) Values(:employeeName,:employeeAddress, :employeeAge, :employeeDob, :employeeGender, :employeeSal)",nativeQuery = true)
	  @Transactional
	  @Modifying
	  public int insertEmploye(String employeeName,String employeeAddress,int employeeAge,Date employeeDob,String employeeGender, double employeeSal);
	   
	    @Query("update Employe SET eName=:name,eAddress=:add,eAge=:age,eDob=:dob,eGender=:gen,eSalary=:sal WHERE eId=:id")
	    @Transactional
	    @Modifying
	    public int UpdateEmploye(Integer id,String name,String add,Integer age,Date dob,Character gen,Double sal);
	
}
	