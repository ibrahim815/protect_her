package com.esprit.ProtectHer.Service;



import java.util.List;

import com.esprit.ProtectHer.entity.Event;
import com.esprit.ProtectHer.entity.Stat;


public interface EventServiceIm {

	public Event addEvent(Event event);

	Event updateEvent(Long idEvent, Event e);
	
	public float  stat (Long idEvent) ;
	public List<Stat> stat1();
	
	void deleteEvent(Long id);

	Event retrieveEvent(Long id);

	public void assignAdvertisingToEvent(Long idEvent, Long idAdvertising);

	
   public void assignUserToEvent(Long idEvent, Long id);

}



