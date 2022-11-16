package com.esprit.ProtectHer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.ProtectHer.Repository.UserRepository;
import com.esprit.ProtectHer.Service.UserServiceIm;
import com.esprit.ProtectHer.entity.User;



@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserServiceIm  userServiceIm;
	@Autowired
	private UserRepository userRepository;
	

	
	@PostMapping("/Users")
	@ResponseBody
	public void addUser( @RequestBody User user)
 {
		userServiceIm.addUser(user);
		
		}
	
	@GetMapping("/Users")
	public List<User> getUserAll() {
		return userRepository.findAll();

	}

	
	}
	

	


