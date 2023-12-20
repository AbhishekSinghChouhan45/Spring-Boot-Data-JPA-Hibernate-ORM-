package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumbers;
import com.nt.repository.IPersonRepository;
import com.nt.repository.IPhoneNumbersRepository;

import lombok.Value;
@Service
public class PersonServiceImpl implements IPersonService {
	// Injecting Person class obj
	@Autowired
	private IPersonRepository perRepo;
	//Injecting PhoneNumber class obj
	@Autowired
	private IPhoneNumbersRepository phoneRepo;
	@Override
	public void saveDataUsingParentObj() throws Exception{
		System.out.println("----------------savePerson()-----");
		//create the objs of both class
		Person p1 = new Person("Raja", "Hyderabad");
		PhoneNumbers ph1 = new PhoneNumbers(9998887776L,"Jio", "Office");
		PhoneNumbers ph2 = new PhoneNumbers(1112223334L,"Airtel", "Residence");
		//set the personinfo on ph1 and ph2
		ph1.setPersoninfo(p1);
		ph2.setPersoninfo(p1);
		List<PhoneNumbers> pn = new ArrayList<PhoneNumbers>();
		//adding the ph1 and ph2 to the list collection and passing the list collection ref var to the ContactDeatils setter method of the Person class
		pn.add(ph1); pn.add(ph2);
		System.out.println("HERE we cheking the list data "+pn.size());
		pn.forEach(System.out::println);
		System.out.println();
		p1.setContactdetails(pn);
		// calling the save method of jpa repo and passing the parent class obj
		int id = perRepo.save(p1).getPid();
		System.out.println("Person and child data saved using parent obj and id is "+id); 
	}
	@Override
	public void saveDataUsingChildObj()throws Exception {
			System.out.println("PersonServiceImpl.saveDataUsingChildObj()");
			Person p = new Person("Tarun","Delhi");
			PhoneNumbers ph1 = new PhoneNumbers(1111111111L,"Jio","Personal");
			PhoneNumbers ph2 = new PhoneNumbers(2222222222L,"Airtel","Office");
			PhoneNumbers ph3 = new PhoneNumbers(3333333333L,"Vi","Residence");
			List<PhoneNumbers> pn = new ArrayList<PhoneNumbers>();
			ph1.setPersoninfo(p); ph2.setPersoninfo(p);ph3.setPersoninfo(p);
			pn.add(ph1);pn.add(ph2);pn.add(ph3);
			p.setContactdetails(pn);
			int id = phoneRepo.save(ph1).getPersoninfo().getPid();
			phoneRepo.save(ph2);
			phoneRepo.save(ph3);
			System.out.println("Parent and Child Object Saved using Child class and id is: "+id);
	}
	@Override
	public void getAllData() throws Exception {
		System.out.println("PersonServiceImpl.getAllData()");
		// To get data from parent obj
		List<Person> list = new ArrayList<Person>();
			list = perRepo.findAll();
			if(list.isEmpty())
				System.out.println("No Data Found");
			else
				list.forEach(tt->{
					System.out.println(tt);
		//				System.out.println(tt.getContactdetails());
					List<PhoneNumbers> num = tt.getContactdetails();
					num.forEach(y->{
						System.out.println(y.getPhonenumber());
					});
				});
			//to get data from child object
			/*	List<PhoneNumbers> list = phoneRepo.findAll();
				list.forEach(t->{
					System.out.println(t);
					System.out.println(t.getPersoninfo());
				});
			*/
	}
	@Override
	public void deleteChild(int id) throws Exception {
			Optional<Person> per = perRepo.findById(id);
			if(per.isEmpty())
				System.out.println("No person found of id: "+id);
			else {
				Person p = per.get();
				List<Integer> ids =new ArrayList<>();
				Iterable<PhoneNumbers> list = p.getContactdetails();
				list.forEach(idss->{
						ids.add(idss.getNid());
				});
				phoneRepo.deleteAllInBatch(list);
				System.out.println("Phonenumber deleted of id: "+id+"and deleted phone number id's are: "+ids.toString());
			}
	}
	@Override
	public void saveOnlyChilds(int id) throws Exception {
			Optional<Person> per = perRepo.findById(id);
			if(per.isEmpty())
				System.out.println("No person found of having id: "+id);
			else {
//				Person p = per.get();
//				System.out.println(p);
				System.out.println(1);
				PhoneNumbers n1 = new PhoneNumbers(1111122222L,"BSNL","Ofiice");
				PhoneNumbers n2 = new PhoneNumbers(2222222222L,"AIRCEL","Residence");
				/*System.out.println(2);
				Person p1 = new Person();
				p1.setPname(p.getPname());
				p1.setPaddress(p.getPaddress());
				p1.setContactdetails(List.of(n1,n2));
				p1.setPid(p.getPid());
				
				n1.setPersoninfo(p1);
				n2.setPersoninfo(p1);
				System.out.println(3);
				System.out.println(n1.getPersoninfo().getPid()+"-----------"+n2.getPersoninfo().getPid());
				List<PhoneNumbers> n = new ArrayList<PhoneNumbers>();
				n.add(n1);
				n.add(n2);
				System.out.println(4);*/
				Person p = new Person();
				p.setContactdetails(List.of(n1,n2));
				System.out.println(2);
				n1.setPersoninfo(per.get());
				System.out.println(3);
				n2.setPersoninfo(per.get());
				System.out.println(4);
				phoneRepo.saveAll(List.of(n1,n2));
//				phoneRepo.save(n1);
				System.out.println(5);
//				phoneRepo.saveAndFlush(n2);
				System.out.println(6);
				System.out.println("Phone numbers saved on person id: "+id);
			}
		
	}
	
}
