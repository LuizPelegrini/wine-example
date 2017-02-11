package com.luiz.wines.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.luiz.wines.model.Wine;
import com.luiz.wines.model.WineType;

@Controller
public class WineController {
	
	@GetMapping("wine/register-wine")
	public String newWine(Model model){
		model.addAttribute(new Wine());
		model.addAttribute("types", WineType.values());
		return "wine/register-wine";
	}
	
	@PostMapping("wine/save")
	public String save(Wine wine){
		return "";
	}
	
}
