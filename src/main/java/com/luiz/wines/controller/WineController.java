package com.luiz.wines.controller;

import org.springframework.stereotype.Controller;

@Controller
public class WineController {
	
	public String novo(){
		return "wine/register-wine";
	}
	
}
