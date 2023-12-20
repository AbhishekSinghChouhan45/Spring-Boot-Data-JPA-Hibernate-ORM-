package com.nt.service;

import com.nt.entity.PhoneNumbers;

public interface IPersonService {
		public void saveDataUsingParentObj()throws Exception; 
		public void saveDataUsingChildObj()throws Exception; 
		public void getAllData()throws Exception;
		public void deleteChild(int id)throws Exception;
		public void saveOnlyChilds(int id)throws Exception;
}
