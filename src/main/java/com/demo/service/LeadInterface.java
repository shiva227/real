package com.demo.service;

import java.util.List;

import com.demo.entity.Lead;

public interface LeadInterface {

public	Lead saveLead(Lead lead);

public Lead getbyId(int id);

public void del(int id);

public List<Lead> readAll();

}
