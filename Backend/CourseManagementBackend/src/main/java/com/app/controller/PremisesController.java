package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.PremisesDto;
import com.app.entity.Premises;
import com.app.service.PremisesService;

@RestController
@RequestMapping("/premises")
public class PremisesController {

	@Autowired
	private PremisesService premiseServ ;
	
	@GetMapping("/getall")
	public ResponseEntity<List<Premises>> getAllPremises()
	{
		List<Premises> list = premiseServ.getAllPremises();
		return ResponseEntity.ok(list);
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> addPremise(@RequestBody PremisesDto addPremiseDto)
	{
		Premises pre = premiseServ.addPremise(addPremiseDto);
		return ResponseEntity.ok(pre);
	}
	
	@DeleteMapping("/delete/{premisesId}")
	public ResponseEntity<?> deletePremise(@PathVariable Long premisesId)
	{
		String msg = premiseServ.deletePremise(premisesId);
		return ResponseEntity.ok(msg);
	}
	
	@PutMapping("/edit/{id}")
	public ResponseEntity<?> editPremise(@RequestBody PremisesDto addPremiseDto , @PathVariable Long premisesId )
	{
		Premises pre = premiseServ.editPremise(addPremiseDto , premisesId);
		return ResponseEntity.ok(pre);
	}
}