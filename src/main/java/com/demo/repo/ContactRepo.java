package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer>{

}
