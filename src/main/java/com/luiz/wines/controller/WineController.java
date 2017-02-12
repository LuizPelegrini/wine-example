package com.luiz.wines.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.luiz.wines.model.Wine;
import com.luiz.wines.model.WineType;
import com.luiz.wines.repository.WinesRepo;

@Controller
public class WineController {
	
	@Autowired
	private WinesRepo winesRepo;
	
	@GetMapping("/wine/register-wine")
	public String newWine(Model model){
		model.addAttribute(new Wine());
		model.addAttribute("types", WineType.values());
		return "wine/register-wine";
	}
	
	@PostMapping("/wine/register-wine")
	public String save(Wine wine){
		winesRepo.save(wine);
		return "redirect:/wine/register-wine";
	}
	
}
