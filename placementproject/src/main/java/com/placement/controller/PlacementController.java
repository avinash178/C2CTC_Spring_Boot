package com.placement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.placement.entities.Placement;
import com.placement.service.PlacementService;

@RestController
public class PlacementController {
	
	@Autowired
	private PlacementService placementService;
	
	@GetMapping("/placements")                           // getting all college
	public ResponseEntity<List<Placement>> getPlacement(){
		List<Placement>list= placementService.getAllPlacement();
		if (list.size()<= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
	}
	
	@GetMapping("/placements/{id}")                             //getting College by id
	public ResponseEntity<Placement> getPlacement(@PathVariable("id") long id){
		Placement placement=placementService.getPlacementById(id);
		if (placement == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

		}
		return ResponseEntity.of(Optional.of(placement));
	}
	@PostMapping("/placements")
	public ResponseEntity<Placement> addPlacement(@RequestBody Placement placement){
		Placement p=null;
		try {
			p = this.placementService.addPlacement(placement);
			System.out.println(placement);
			return ResponseEntity.of(Optional.of(p));
			
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

		}
	}
	@DeleteMapping("/placements/{placementId}")
	public ResponseEntity<Void> deletePlacment(@PathVariable("placementId") long placementId){
		
		try {
			this.placementService.deletePlacement(placementId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			}
		catch(Exception e)
		{
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	@PutMapping("/placements/{placementId}")
	public ResponseEntity<Placement> updatePlacement(@RequestBody Placement placement,@PathVariable("placementId") long placementId){
		try {
			this.placementService.updatePlacement(placement, placementId);
			return ResponseEntity.ok().body(placement);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	

}
