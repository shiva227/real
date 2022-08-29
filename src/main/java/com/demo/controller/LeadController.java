package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.entity.Contact;
import com.demo.entity.Lead;
import com.demo.service.ContactInterface;
import com.demo.service.LeadInterface;

@Controller
public class LeadController {
@Autowired
	LeadInterface p ;
	@Autowired
	ContactInterface q ;

	@RequestMapping("/add")
	public String addLead(){
		return "insert" ;
	}
	@RequestMapping("/save")
	public String save(@ModelAttribute("lead")Lead lead , ModelMap model) {
		Lead val = p.saveLead(lead);
		model.addAttribute("k", val) ;
		return "show" ;
	}
	@RequestMapping("/convert")
	public void convert(@RequestParam ("id")int id) {
		System.out.println(id);
		Lead lead = p.getbyId(id);
		Contact con = new Contact();
	    con.setFirstName(lead.getFirstName());
		con.setLastName(lead.getLastName());
		con.setEmail(lead.getEmail());
		con.setMobile(lead.getMobile());
		q.convertLead (con) ;
		p.del(id) ;
		}
	@RequestMapping("/listAll")
	public String read(ModelMap model) {
		List<Lead> val = p.readAll();
		model.addAttribute("k", val);
		return "listLead" ;
	}
	@RequestMapping("/convertId")
	public String convertId(@RequestParam("id") int id , ModelMap model) {
	Lead val = p.getbyId(id);
	model.addAttribute("k", val);
	return "show" ;
	
}}
