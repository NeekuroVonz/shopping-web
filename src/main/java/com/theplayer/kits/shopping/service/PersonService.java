package com.theplayer.kits.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theplayer.kits.shopping.Dao.PersonDao;
import com.theplayer.kits.shopping.model.Person;

public interface PersonService {
	void add(Person person);
	
	void delete(int id);	
}

@Service
class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;
	
	@Override
	public void add(Person person) {
		personDao.add(person);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
}
