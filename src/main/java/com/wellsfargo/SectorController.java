package com.wellsfargo;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SectorController {
	
	@Autowired
	private SectorService sectorService;
	
	@RequestMapping("/sectors")
	public List<Sector> getAllSectors()
	{
		return sectorService.getAllSectors();
	}
	
	@RequestMapping("/sectors/{id}")
	public Sector getSector(@PathVariable String id)
	{
		return sectorService.getSector(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/sectors")
	public void addSector(@RequestBody Sector sector)
	{
		sectorService.addSector(sector);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/sectors/{id}")
	public void updateSector(@RequestBody Sector sector,@PathVariable String id)
	{
		sectorService.updateSector(sector,id);
	}
}