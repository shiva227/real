package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Contact;
import com.demo.repo.ContactRepo;

@Service
public class ContactService implements ContactInterface {
@Autowired
	ContactRepo y ;

@Override
public void convertLead(Contact con) {

y.save(con);
}
}
