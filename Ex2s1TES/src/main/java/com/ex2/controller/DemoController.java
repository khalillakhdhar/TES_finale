package com.ex2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ex2.model.Calcule;

@RestController
public class DemoController {

	@GetMapping("/fact")
	@ResponseBody
	String facto(@RequestParam(defaultValue = "1") String a)
	{
		Calcule cl=new Calcule();
		return "la factoriel de "+a+ " est "+cl.factoriel(Integer.parseInt(a));
		
		
	}
	@PostMapping("/somme")
	@ResponseBody
	String somme(@RequestParam String a,@RequestParam String b)
	
	{
		Calcule cl=new Calcule();
		int somme = cl.somme(Integer.parseInt(a),Integer.parseInt(b));
		
	return "la somme de "+a+" "+b+" est "+somme;	
	}
	@PostMapping("/produit")
	@ResponseBody
	String produit(@RequestParam String a, @RequestParam String b)
	{
		
		Calcule cl=new Calcule();
		long produit= cl.produit(Integer.parseInt(a),Integer.parseInt(b));
		return "le produit de "+a+" "+b+" est "+produit;
		
	}
	@PostMapping("/pgcd")
	@ResponseBody
	String pgcd(@RequestParam String a, @RequestParam String b)
	{
		Calcule cl=new Calcule();
		int commun=cl.pgcd(Integer.parseInt(a),Integer.parseInt(b));
		return "le pgcd de "+a+" et "+b+" est "+commun;
		
	}
	@GetMapping("")
	ModelAndView welcome()
	{
		ModelAndView page=new ModelAndView("math.html");
		return page;
	}
	
	
	
	
	
}
