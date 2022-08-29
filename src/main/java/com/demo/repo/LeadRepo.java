package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Lead;

public interface LeadRepo extends JpaRepository<Lead, Integer> {

}
