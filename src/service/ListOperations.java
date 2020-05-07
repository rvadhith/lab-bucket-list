package service;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.TouristPlace;

public class ListOperations {
	
	//Addition of places
	List<TouristPlace> list = new ArrayList<TouristPlace>();
	
	public List<TouristPlace> add(TouristPlace places) throws IOException {
		list.add(places);
		return list;
	}
	
	//Removal of places
	public List<TouristPlace> remove(TouristPlace places) throws IOException{
		list.remove(places);
		return list;
	}
	
	//Sorting by destination
	public Object sortByDestination(List<TouristPlace> places) throws IOException {
		places.sort((TouristPlace p1,TouristPlace p2)-> p1.getDestination().compareTo(p2.getDestination()));
		return places;	
    }
	
	//Sorting by rank
	public Object sortByRank(List<TouristPlace> places) throws IOException {
    	places.sort((TouristPlace p1,TouristPlace p2)-> p1.getRank().compareTo(p2.getRank()));
        return places;
	}
	
	//Reset of list
	public Object reset(List<TouristPlace> places) throws IOException {
		
		list.clear();
		return list;
	}	
}