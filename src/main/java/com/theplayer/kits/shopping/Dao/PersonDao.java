package com.theplayer.kits.shopping.Dao;

import org.springframework.stereotype.Repository;

import com.theplayer.kits.shopping.model.Person;

public interface PersonDao {
	void add(Person person);
}

@Repository
class PersonDaoImpl implements PersonDao {

	@Override
	public void add(Person person) {
		// TODO Auto-generated method stub
		
	}
	
}