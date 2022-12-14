package com.esprit.ProtectHer.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.ProtectHer.Repository.JackPotRepository;
import com.esprit.ProtectHer.Service.JackPotServiceIm;
import com.esprit.ProtectHer.entity.Advertising;
import com.esprit.ProtectHer.entity.Event;
import com.esprit.ProtectHer.entity.JackPot;





@CrossOrigin
@RestController
@RequestMapping("/api")
public class JackPotController {
	@Autowired
	private JackPotServiceIm  jackPotServiceIm;
	@Autowired
	JackPotRepository jackPotReposository;

	
	@PostMapping("/JackPots")
	@ResponseBody
	public void addJackPot( @RequestBody JackPot jackPot)
 {
		jackPotServiceIm.addJackPot(jackPot);
		
		}
	
	@GetMapping("/JackPots")
	public List<JackPot> getJackPots() {
		return jackPotReposository.findAll();

	}

	
	
	@PutMapping("/JackPots/{jackPot-id}")
	@ResponseBody
		
		public JackPot modifyJackPot(@PathVariable("jackPot-id") Long jackPottId, @RequestBody JackPot j) {
			return jackPotServiceIm.updateJackPot(jackPottId, j);
		}
	
	@DeleteMapping("/JackPots/{jackPot-id}")
		public void removeJackPot(@PathVariable("jackPot-id") Long jackPotId) {
		jackPotServiceIm.deleteJackPot(jackPotId);
		}

	
	@GetMapping("/retrieve-jackpot/{idJackpot}")
	@ResponseBody
	public JackPot retrieveJackPot(@PathVariable("idJackpot") Long idJackpot) {
		return jackPotServiceIm.retrieveJackPot(idJackpot);
	}
	
	
	
	
	@PutMapping("/assign-jackjwk-to-yazerwf")
	@ResponseBody
	public void assignJackPotToUser(@RequestParam("idJackPot") Long idJackPot, @RequestParam("id") Long id) {
		jackPotServiceIm.assignJackPotToUser(idJackPot, id);
	}
	
	@PutMapping("/assign-jackPot-to-event")
	@ResponseBody
	public void assignJackPotToEvent(@RequestParam("idJackpot") Long idJackpot, @RequestParam("idEvent") Long idEvent) {
		jackPotServiceIm.assignJackPotToEvent(idJackpot, idEvent);
	}

	
	}
	

	


