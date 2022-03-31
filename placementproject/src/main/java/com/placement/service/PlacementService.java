package com.placement.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.placement.entities.College;
import com.placement.entities.Placement;
import com.placement.repository.PlacementRepository;

@Component
public class PlacementService {
	
	private PlacementRepository prepository;
	
	// get all placements
	public List<Placement> getAllPlacement(){
		List<Placement> list=(List<Placement>)this.prepository.findAll();
		return list;
	}
	
	// get single placement
	public Placement getPlacementById(long id) {
		Placement placement=null;
		try {
			placement=this.prepository.findById(id);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return placement;
	}
	//add placement
		public Placement addPlacement(Placement placement) {
			Placement result=this.prepository.save(placement);	
			return result;
			
		}
		//delete placement
		public void deletePlacement(long id) {
			prepository.deleteById(id);
		}
		
		//update the placement
				public void updatePlacement(Placement placement, long id) {
					placement.setId(id);
					prepository.save(placement);
				}
	
	

}
