package com.wellsfargo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SectorService {
	
	private ArrayList<Sector> sectors=new ArrayList<Sector>(Arrays.asList(
			new Sector("1","IT", "Provides IT services"),
			new Sector("2","Automobiles","Builds automobiles"),
			new Sector("3","Healthcare","Provides healthcare")
			)); 
	public List<Sector> getAllSectors()
	{
		return sectors;
	}
	public Sector getSector(String id)
	{
		for(Sector s:sectors)
		{
			if(s.getId().equals(id))return s;
		}
		return null;
	}
	public void addSector(Sector sector) {
		sectors.add(sector);
	}
	public void updateSector(Sector sector, String id) {
		for(int i=0;i<sectors.size();i++)
		{
			if(sectors.get(i).getId().equals(id))
				sectors.set(i, sector);
		}
	}
}