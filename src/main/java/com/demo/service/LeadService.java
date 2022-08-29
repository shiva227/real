package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Lead;
import com.demo.repo.LeadRepo;

@Service
public class LeadService implements LeadInterface {

	@Autowired
	LeadRepo x ;

	@Override
	public Lead saveLead(Lead lead) {
		Lead val = x.save(lead) ;
		return val;
	}

	@Override
	public Lead getbyId(int id) {
		
		Optional<Lead> val = x.findById(id);
		Lead lead = val.get();
		return lead ;
	}

	@Override
	public void del(int id) {
		x.deleteById(id);
	}

	@Override
	public List<Lead> readAll() {
		List<Lead> val = x.findAll();
		return val ;
	}
	
}
